package pkg.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.inject.persist.Transactional;

import pkg.businesslogic.BusinessLogicFactory;
import pkg.businesslogic.ItemLogic;
import pkg.entity.Item;
import pkg.entity.User;

/**
 * Servlet implementation class SellServlet
 */
@WebServlet("/SellServlet")
public class SellServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Transactional
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");
		String imagePath = request.getParameter("image_path");
		int sellerId = user.getId();
		ItemLogic logic = new BusinessLogicFactory().createItemLogic();
		logic.sell(new Item(description, imagePath, name, price, sellerId));
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
