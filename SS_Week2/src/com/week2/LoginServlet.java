package com.week2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		// doGet(request, response);

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter printOut = response.getWriter();
		StringBuilder htmlResp = new StringBuilder();

		printOut.print(htmlResp);
		boolean loginSuccess = (username.equals("admin") && password.equals("pass"));
		if (loginSuccess) {

			writer.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>SSLogin</title>\r\n" + "</head>\r\n" + "<body>\r\n"
					+ "<h1>Welcome to my webpage.</h1>\r\n"
					+ "<a href=\"https://www.bing.com/videos/search?q=rick+roll&view=detail&mid=4E7B1C0F8E67E9F7B1364E7B1C0F8E67E9F7B136&FORM=VIRE0&ru=%2fsearch%3fq%3drick%2broll%26cvid%3d34c968bee63b46aca9c3a97484fce9cd%26aqs%3dedge.0.69i59j69i60l2j0l4.984j0j4%26FORM%3dANAB01%26PC%3dDCTS\">Click Me</a>"
					+ "</body>\r\n" + "</html>");

		} else {
			writer.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>SSLogin</title>\r\n" + "</head>\r\n" + "<body>\r\n" + "<h1>Incorrect Login</h1>\r\n"
					+ "</body>\r\n" + "</html>");
		}
	}
}
