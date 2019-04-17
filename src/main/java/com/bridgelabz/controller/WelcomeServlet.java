package com.bridgelabz.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgelabz.dao.DBConnection;
public class WelcomeServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String emailID = "";
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		Cookie ck = new Cookie("name", "");
		String name = ck.getValue();
		Connection connection = DBConnection.getDBConnection();
		String sql = "select email from user123 where username=?";
		try 
		{
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) 
			{
				emailID = resultSet.getString(1);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}

		out.print("Hello  Mr/Mrs : " + name);
		out.print("Your  EmailID : " + emailID);

		out.print("you are successfully logged out!");

		out.print("<form action='logout' method='post'>");
		out.println("<input type='submit' value='Logout'>");
		out.println("</form>");

	}
}