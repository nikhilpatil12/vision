import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		HttpSession session=request.getSession();
		String data = (String) session.getAttribute("firstname");
		String secname =(String) session.getAttribute("secondname");
		String qual = request.getParameter("qual");
		//session.setAttribute("qual",qual);
		
		out.println("First Name: "+data);
		out.println("<br>");
		out.println("Second Name: "+secname);
		out.println("<br>");
		out.println("Qualification: "+qual);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=FourthServlet >");
		out.println("Enter Marks");
		out.println("<input type=\"text\" name=\"mark\"/>");
		out.println("<input type=submit />");
		out.println("</form>");
		out.println("</body>");
		out.println("<html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
