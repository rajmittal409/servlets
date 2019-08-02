
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.BankService;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
BankService bs=new BankService();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig servlet1=getServletConfig();
		
		System.out.println(servlet1.getInitParameter("raj"));
		PrintWriter out = response.getWriter();
		String acc =request.getParameter("t1");
		long accNo=Long.parseLong(acc);
		String pass = request.getParameter("t4");
		RequestDispatcher rd;
	      HttpSession session=request.getSession();  
	        session.setAttribute("acc",accNo);  
	        session.setAttribute("pass",pass); 
		try {
			if (bs.checkAccNo(accNo)&&bs.checkPass(pass)) {
					long bal = bs.getBalance(accNo);
				RequestDispatcher rd1=request.getRequestDispatcher("home.html");
				rd1.include(request, response);
				out.print("<center><font color='green'> Succesfully Logged In</font></center>\n");
				//System.out.print("<center><font color='green'> Your account balance is : Rs." + bal + "</font></center>\n");
							
			} else {
				RequestDispatcher rd1=request.getRequestDispatcher("formEx.html");
				rd1.include(request, response);
				out.print("<h1 align='center'><font color='red'>'Please register first'</font></h1>");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

