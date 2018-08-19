package pkg.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.inject.Singleton;

import pkg.businesslogic.BusinessLogicFactory;
import pkg.businesslogic.ItemLogic;
import pkg.businesslogic.UserLogic;
import pkg.entity.Item;
import pkg.entity.User;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInServlet")
@Singleton
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserLogic logic = new BusinessLogicFactory().createUserLogic();
		User user = logic.signIn(email, password);
		if(user == null) {
			response.sendRedirect("signin.jsp");
			return;
		}
		AttributeManager.setUser(request.getSession(), user);
		response.sendRedirect("main.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
