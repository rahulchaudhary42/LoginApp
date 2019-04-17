<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body >
	<h1 style="color: red; text-align: center;">Reset Password</h1>
	<center>
		<form action="forgot" method="post">
			<table align="center" border="8">
				<tr>
					<td>UserName:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Email Id:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>New Password:</td>
					<td><input type="password" name="newpassword"></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>

					<td><input type="submit" value="update Password"></td>
					<td><a href="Home.jsp">Home</td>
				</tr>


			</table>
		</form>
	</center>
</body>
</html>