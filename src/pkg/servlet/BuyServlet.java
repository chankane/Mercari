package pkg.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pkg.businesslogic.BusinessLogicFactory;
import pkg.businesslogic.ItemLogic;
import pkg.businesslogic.UserItemLogic;
import pkg.businesslogic.UserLogic;
import pkg.entity.Item;
import pkg.entity.User;

/**
 * Servlet implementation class BuyServlet
 */
@WebServlet("/BuyServlet")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		Item item = (Item)session.getAttribute("item");
		User user = (User)session.getAttribute("user");
		UserItemLogic logic = new BusinessLogicFactory().createUserItemLogic();
		//try {
			logic.buy(user, item);
		//}catch(RollbackException e) {
		//	response.sendError(500/*, "error.jsp"*/);
		//	e.printStackTrace();
		//}
		response.sendRedirect("success.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
