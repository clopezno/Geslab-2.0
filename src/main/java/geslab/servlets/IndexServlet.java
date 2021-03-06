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
import geslab.database.user.Salida;
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
	private Conexion cn = null;

	// Variables ficha
	private String calidad, proveedor, marca, lote, g_ml;
	private Ubicacion ubicacion = null;
	private Producto producto = null;
	private BigDecimal capacidad;
	private boolean residuo;
	private Date caducidad;


	// Variables entrada-salida
	private Date fecha;
	private int unidades;
	private String nota;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.request = request;
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
				request.setAttribute("ubicaciones", cn.leerUbicaciones(usuario));
				request.setAttribute("proveedores", cn.leerProveedores());
				request.setAttribute("marcas", cn.leerMarcas());
				request.setAttribute("calidades", cn.leerCalidades());
				request.setAttribute("productos", cn.leerProductos());
				request.setAttribute("fichas", cn.leerFichas(usuario));
				request.setAttribute("entradas", cn.leerEntradas(usuario));
				request.setAttribute("salidas", cn.leerSalidas(usuario));
				request.setAttribute("usuario", usuario);
				request.setAttribute("mensaje", sesion.getAttribute("mensaje"));

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
		String accion = request.getParameter("accion");
		String codigo = request.getParameter("codigo");
		Ficha ficha = null;
		cn = new Conexion();

		try {
			switch (accion) {
			case "insertar":
				leerParametrosFicha();
				ficha = new Ficha(0, producto, capacidad, g_ml, calidad, ubicacion, marca, proveedor, caducidad, lote,
						residuo, 0);
				cn.insertarFicha(ficha);

				break;
			case "entrada":
				leerParametrosEntSal();
				ficha = cn.leerFicha(Integer.parseInt(codigo));
				Entrada entrada = new Entrada(0, ficha, fecha, unidades, nota, usuario.getIdusuario());
				cn.insertarEntrada(entrada);
				break;

			case "salida":
				leerParametrosEntSal();
				ficha = cn.leerFicha(Integer.parseInt(codigo));
				Salida salida = new Salida(0, ficha, fecha, unidades, nota, usuario.getIdusuario());
				cn.insertarSalida(salida);
				break;

			}
		} catch (Exception msg) {
			sesion.setAttribute("mensaje", msg.getMessage());
		}

		cn.cerrarConexion();
		response.sendRedirect("/index.do");
	}

	private void leerParametrosFicha() throws Exception {
		try {
			String nombre = request.getParameter("insertar-producto");
			if (nombre.equals("")) throw new Exception("Campo producto obligatorio");
			for (Producto p : cn.leerProductos()) {	
				if (p.getNombre().equals(nombre)) {
					producto = p;
					break;
				}
			}
			
			String cpcd = request.getParameter("insertar-cpcd");
			if (cpcd.equals("")) throw new Exception("Campo capacidad obligatorio");
			capacidad = new BigDecimal(cpcd);
			
			g_ml = request.getParameter("insertar-g-ml");
			if (g_ml.equals("")) throw new Exception("Campo g/ml obligatorio");
			
			String ub = request.getParameter("insertar-ubicacion");
			if (ub.equals("")) throw new Exception("Campo ubicacion obligatorio");
			for (Ubicacion u : cn.leerUbicaciones(usuario)) {
				if (u.getNombre().equals(ub)) {
					ubicacion = u;
					break;
				}
			}
			marca = request.getParameter("insertar-marca");
			if (marca.equals("")) throw new Exception("Campo marca obligatorio");
			
			proveedor = request.getParameter("insertar-proveedor");
			if (proveedor.equals("")) throw new Exception("Campo proveedor obligatorio");
			
			calidad = request.getParameter("insertar-calidad");
			if (calidad.equals("")) throw new Exception("Campo calidad obligatorio");
			
			lote = request.getParameter("insertar-lote");
			if (lote.equals("")) throw new Exception("Campo lote obligatorio");
			
			String cad = request.getParameter("insertar-caducidad");
			if (cad.equals("")) throw new Exception("Campo caducidad obligatorio");
			caducidad = Date.valueOf(cad);
			
			residuo = (request.getParameter("insertar-residuo") != null);
			
			
		} catch (Throwable exception) {
			if(exception.getClass().toString().equals("class java.lang.Exception")) {
				throw new Exception(exception.getMessage());	
			}else {
				throw new Exception("Parámetros de ficha incorrectos");	
			}
		} 
	}

	private void leerParametrosEntSal() throws Exception {
		try {
			String f = request.getParameter("insertar-fecha");
			if (f.equals("")) throw new Exception("Campo fecha obligatorio");
			fecha = Date.valueOf(f);
			
			unidades = Integer.parseInt(request.getParameter("insertar-unidades"));
			nota = request.getParameter("insertar-nota");
		} catch (Throwable exception) {
			if(exception.getClass().toString().equals("class java.lang.Exception")) {
				throw new Exception(exception.getMessage());	
			}else {
				throw new Exception("Parámetros de ficha incorrectos");	
			}
		} 
	}

}
