package com.bridgelabz.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgelabz.dao.DBConnection;
public class ForgetPasswordServlet extends HttpServlet 
{
	Connection connection = null;

	@Override
	public void init() throws ServletException 
	{
		connection = DBConnection.getDBConnection();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PreparedStatement statement = null;
		String sql = "update user123 set password1=? where username=? and email=?";
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		String userName = req.getParameter("username");
		String emailId = req.getParameter("email");
		String newPassword = req.getParameter("newpassword");
		String confirmPassword = req.getParameter("confirmpassword");

		if (!userName.equals("") && !emailId.equals("")) 
		{

			{
				if (newPassword.equals(confirmPassword))
				{
					try 
					{
						statement = connection.prepareStatement(sql);
						statement.setString(1, newPassword);
						statement.setString(2, userName);
						statement.setString(3, emailId);

						int transaction = statement.executeUpdate();
						if (transaction > 0) 
						{
							out.println("<h1 style='color:red; text-align=center'>");
							out.println("Password updated SuccessFully</h1>");
							out.print("<a href='LoginPage.jsp'>Login Page</a>");

						}
					} 
					catch (Exception e)
					{
						e.printStackTrace();
						// TODO: handle exception
					}
				}
			}
		}
	}
}
