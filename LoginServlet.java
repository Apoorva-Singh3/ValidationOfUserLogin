package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Set the content type of response to "text/html"
        response.setContentType("text/html");
  
        // Get the print writer object to write into the response
        PrintWriter out = response.getWriter();
  
        // Get the session object
        HttpSession session = request.getSession();
  
        // Get User entered details from the request using request parameter.
        String user = request.getParameter("username");
        String password = request.getParameter("password");
  
        // Validate the password - If password is correct, 
        // set the user in this session
        // and redirect to welcome page
        if (password.equals("jerry")) {
            session.setAttribute("Tom", user);
            response.sendRedirect("welcome.jsp?name=" + user);
        }
        // If the password is wrong, display the error message on the login page.
        else {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            out.println("<font color=red>Invalid Credentials !!</font>");
            rd.include(request, response);
        }
        // Close the print writer object.
        out.close();
	}

}
