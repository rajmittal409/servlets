


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BankService;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	BankService bs=new BankService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubPrintWriter out = response.getWriter();
		PrintWriter out = response.getWriter();
		String user = request.getParameter("t1");
		String mob = request.getParameter("t3");
		long mob1=Long.parseLong(mob);
		String pass = request.getParameter("t4");
		RequestDispatcher rd;
		try {
			

			String s = bs.addAccount(user, mob1, pass,1000);
	
				//rd=request.getRequestDispatcher("NewFile.html");
				RequestDispatcher rd1=request.getRequestDispatcher("login.html");
				rd1.include(request, response);
				out.print("<h1 align='center'><font color='red'>"+s+"</font></h1>");
				
					} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
