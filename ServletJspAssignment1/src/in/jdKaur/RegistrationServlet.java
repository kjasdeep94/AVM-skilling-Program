package in.jdKaur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid=request.getParameter("cid");
		String cn=request.getParameter("cn");
		String gender=request.getParameter("gender");
		String an=request.getParameter("an");
		String ifsc=request.getParameter("ifsc");
		String bank=request.getParameter("bank");
		String branch=request.getParameter("branch");
		String amt=request.getParameter("amt");
		
		CustomerBean cBean=new CustomerBean(cid,cn,gender,an);
		AccountBean aBean=new AccountBean(an,ifsc,bank,branch,amt);
		
		request.setAttribute("key1", cBean);
		request.setAttribute("key2",aBean);
		
		RequestDispatcher rd=request.getRequestDispatcher("displayInfo.jsp");
		rd.forward(request, response);
		
	}

}
