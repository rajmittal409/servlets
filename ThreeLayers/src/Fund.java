

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.BankService;

/**
 * Servlet implementation class Balance
 */
public class Fund extends HttpServlet {
	BankService bs=new BankService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String balance = request.getParameter("t2");
		long bal1=Long.parseLong(balance);
		String acc = request.getParameter("t1");
		long accNo2=Long.parseLong(acc);
	      HttpSession session=request.getSession();  
	        long accNo=(long) session.getAttribute("acc"); 
	        String s=(String) session.getAttribute("pass");

    		try {
				bs.setBalance(accNo2,bs.getBalance(accNo2)+bal1, "Amount Credited : "+bal1);
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	    	try {
	    		bs.setBalance(accNo2,bs.getBalance(accNo2)+bal1, "Amount Credited : "+bal1);
				bs.setBalance(accNo,bs.getBalance(accNo)-bal1,"Amount Debited : "+bal1);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        long bal=0;
	        try {
				bal=bs.getBalance(accNo);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	        RequestDispatcher rd1=request.getRequestDispatcher("fund.html");
			rd1.include(request, response);
			out.print("<center><h1><font color='blue'>Fund Successfully Transferred<br> Your Account Balance is : "+bal+"</font></h1></center>\n");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
