package geslab.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import geslab.database.Conexion;
import geslab.database.admin.Usuario;
import geslab.database.user.Entrada;
import geslab.database.user.Ficha;
import geslab.database.user.Producto;
import geslab.database.user.Ubicacion;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index.do")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Usuario usuario = null;
	private HttpSession sesion = null;

	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	private Conexion cn = null;

	// Variables ficha
	private String calidad, proveedor, marca;
	private Ubicacion ubicacion = null;
	private Producto producto = null;

	// Variables entrada-salida
	private Date fecha, caducidad;
	private String lote, g_ml;
	private BigDecimal unidades, capacidad;
	private boolean residuo;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		sesion = request.getSession();
		usuario = (Usuario) sesion.getAttribute("usuario");

		if (usuario != null) {
			if (usuario.getNombre().equals("")) {
				response.sendRedirect("/registro.do");
			} else {

				Conexion cn = new Conexion();

				request.setAttribute("departamentos", cn.leerDepartamentos());
				request.setAttribute("areas", cn.leerAreas());
				request.setAttribute("centros", cn.leerCentros());
				request.setAttribute("ubicaciones", cn.leerUbicaciones());
				request.setAttribute("proveedores", cn.leerProveedores());
				request.setAttribute("marcas", cn.leerMarcas());
				request.setAttribute("calidades", cn.leerCalidades());
				request.setAttribute("productos", cn.leerProductos());
				request.setAttribute("fichas", cn.leerFichas());
//				request.setAttribute("entradas", cn.leerEntradas());
//				request.setAttribute("salidas", cn.leerSalidas());
				request.setAttribute("usuario", usuario);
				
				cn.cerrarConexion();
				
				request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("/login.do");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.request = request;
		this.response = response;
		String accion = request.getParameter("accion");
		String codigo = request.getParameter("codigo");
		cn = new Conexion();
		System.out.println("Accion: " + accion);
		System.out.println("C�digo: " + codigo);

		switch (accion) {
			case "insertar":
				leerParametrosFicha();
				System.out.println(producto);
				System.out.println(capacidad);
				System.out.println(g_ml);
				System.out.println(calidad);
				System.out.println(ubicacion);
				System.out.println(marca);
				System.out.println(proveedor);
				System.out.println(caducidad);
				System.out.println(lote);
				System.out.println(residuo);
				Ficha ficha = new Ficha(0, producto, capacidad, g_ml, calidad, ubicacion, marca, proveedor, caducidad, lote, residuo, 0);
				if(cn.existeFicha(ficha) == null) {
					cn.insertarFicha(ficha);
				}
				break;
			
		}

		cn.cerrarConexion();
		response.sendRedirect("/index.do");
	}


	private void accionEntrada(String accion, int codigo) {
//		Ficha ficha = null;
//		Entrada entrada = null;
//		if (accion.equals("insertar")) {
//			ficha = cn.existeFicha(new Ficha(0, calidad, ubicacion, proveedor, marca, producto));
//			entrada = new Entrada(0, ficha, fecha, caducidad, lote, unidades, capacidad, g_ml, residuo);
//			if (ficha.getCodficha() == 0) {
//				cn.insertarFicha(ficha);
//				ficha = cn.existeFicha(ficha);
//			}
//
//		} else if (accion.equals("editar")) {
//			for (Entrada e : cn.leerEntradas()) {
//				if (e.getCodentrada() == codigo) {
//					ficha = e.getFicha();
//					break;
//				}
//			}
//			entrada = new Entrada(codigo, ficha, fecha, caducidad, lote, unidades, capacidad, g_ml, residuo);
//		}
//
//		cn.insertarEntrada(entrada);
		
	}
	
	private void accionSalida(String accion, int codigo) {
		// TODO Auto-generated method stub
		
	}

	private void leerParametrosFicha() {
		for (Producto p : cn.leerProductos()) {
			String nombre = request.getParameter("insertar-producto");
			if (p.getNombre().equals(nombre)) {
				producto = p;
				break;
			}
		}
		capacidad = new BigDecimal(request.getParameter("insertar-cpcd"));
		g_ml = request.getParameter("insertar-g-ml");
		for (Ubicacion u : cn.leerUbicaciones()) {
			String nombre = request.getParameter("insertar-ubicacion");
			if (u.getNombre().equals(nombre)) {
				ubicacion = u;
				break;
			}
		}
		marca = request.getParameter("insertar-marca");
		proveedor = request.getParameter("insertar-proveedor");
		calidad = request.getParameter("insertar-calidad");
		lote = request.getParameter("insertar-lote");
		caducidad = Date.valueOf(request.getParameter("insertar-caducidad"));
		residuo = (request.getParameter("insertar-residuo") != null);
	}

	private void leerParametrosEntradaSalida() {
		fecha = Date.valueOf(request.getParameter("insertar-fecha"));
		unidades = new BigDecimal(request.getParameter("insertar-uds"));
		
	}

}
