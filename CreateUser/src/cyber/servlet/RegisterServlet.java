package cyber.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cyber.controller.AuthController;

public class RegisterServlet extends HttpServlet{
	private String errMsg;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		
		resp.setContentType("text/html");
		
		writer.append(errMsg ==null ? "" : errMsg + "<br>");
		// load lại ko thấy errMsg 
		errMsg = null;
		
		String formHTML = "    </form>\r\n"
				+ "        <form method=\"POST\" action=\"\">\r\n"
				+ "        <br>\r\n"
				+ "        <label for=\"userId\">Username </label>\r\n"
				+ "        <input type=\"text\" name =\"username\" id=\"userId\">\r\n"
				+ "        <br>\r\n"
				+ "        <label for=\"password\">Password </label>\r\n"
				+ "        <input type=\"password\" name =\"password\" id=\"password\">\r\n"
				+ "			<br>\r\n"
				+ "        <label for=\"fullName\">Full name </label>\r\n"
				+ "        <input type=\"text\" name =\"fullName\" id=\"fullName\">\r\n"
				+ "        <br>\r\n"
				+ "        <label for=\"age\">Age </label>\r\n"
				+ "        <input type=\"text\" name =\"age\" id=\"age\">\r\n"
				+ "        <br>\r\n"
				
				+ "        <input type=\"submit\" value=\"Register\">\r\n"
				+ "    </form>";
		
		writer.append(formHTML);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password =req.getParameter("password");
		String fullName =req.getParameter("fullName");
		Integer age = Integer.parseInt(req.getParameter("age"));
		
		System.out.println("Username:\t" + username);
		System.out.println("Pass:\t" + password);
		System.out.println("Full name:\t" + fullName);
		System.out.println("Age:\t" + age);
		
		PrintWriter writer = resp.getWriter();
		String result = AuthController.register(username, password, fullName, age);
		
		if(result.equals("Register successfully"))
			writer.append("Register successfully!!");
		else {
			errMsg = result;
			resp.sendRedirect("register");
		}
	}
}
