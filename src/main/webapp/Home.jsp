<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet Login Example</title>
<link rel="stylesheet" href="styles.css">
</head>
<body >

	<h1 class="identifier">Login Application</h1>
<center>
	<form action="log" method="post">
     
		<table align="center" border="8" rowspan="5">
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username"></td>

			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" ></td>

			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
				<td><a href="Register.jsp">Register</a>&nbsp;<a
					href="ForgotPassword.jsp">Forgot Password</a></td>

			</tr>
		</table>
   
	</form>

</center>

</body>
</html>