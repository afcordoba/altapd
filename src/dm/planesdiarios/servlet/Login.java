package dm.planesdiarios.servlet;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dm.planesdiarios.dao.DataWarehouseDAO;
import dm.planesdiarios.dao.DatabaseUtility;
import dm.planesdiarios.dao.Usuario;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private  DatabaseUtility dbu = null;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if("logout".equalsIgnoreCase((String) request.getParameter("accion"))){
			HttpSession sesion = request.getSession( true );
			dbu.closeConnection();
			sesion.invalidate();
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession( true );
		if("login".equalsIgnoreCase((String) request.getParameter("accion"))){
			dbu = null;
			dbu = new DatabaseUtility();
			Usuario user= null;
			try {
				user = dbu.getLogin(request.getParameter("password"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(user != null){
				sesion.setAttribute("USUARIO_LOGUEADO"+sesion.getId(), user);
				System.out.println("Nombre : "+ user.getNombre());
				response.sendRedirect("menu.jsp");
			}
			/*else{
				response.sendRedirect("errorLogin.jsp");
				
			}*/
		}
		
	}
	
	

}
