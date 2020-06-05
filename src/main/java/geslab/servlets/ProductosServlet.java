package geslab.servlets;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import geslab.database.Conexion;
import geslab.database.admin.Usuario;
import geslab.database.user.Producto;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/productos.do")
public class ProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Usuario usuario = null;
	private HttpSession sesion = null;

	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	private Conexion cn = null;

	// Variables producto
	private String cas, nombre, formula, formula_des, n_einecs, n_ec, precauciones, msds;
	private BigDecimal peso_mol;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		sesion = request.getSession();
		usuario = (Usuario) sesion.getAttribute("usuario");

		if (usuario != null) {
			if (usuario.getNombre().equals("")) {
				response.sendRedirect("/registro.do");
			} else {

				Conexion cn = new Conexion();

				request.setAttribute("productos", cn.leerProductos());
				request.setAttribute("usuario", usuario);

				cn.cerrarConexion();

				request.getRequestDispatcher("/WEB-INF/productos.jsp").forward(request, response);
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
			Producto producto = null;
			leerParametrosProducto();
			if (cn.leerProducto(cas) == null) {
				producto = new Producto(cas, nombre, formula, formula_des, peso_mol, n_einecs, n_ec, precauciones,
						msds);
				cn.insertarProducto(producto);
			}
			break;

		}
		cn.cerrarConexion();
		response.sendRedirect("/productos.do");
	}

	private void leerParametrosProducto() {
		cas = request.getParameter("insertar-cas");
		nombre = request.getParameter("insertar-nombre");
		formula = request.getParameter("insertar-formula");
		formula_des = request.getParameter("insertar-f_des");
		peso_mol = new BigDecimal(request.getParameter("insertar-peso"));
		n_einecs = request.getParameter("insertar-einecs");
		n_ec = request.getParameter("insertar-ec");
		precauciones = request.getParameter("insertar-precauciones");
		msds = request.getParameter("insertar-msds");
	}

}