<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
.container {
	padding: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<form action="index.jsp">
					<input type="submit" id="home" value="Home">
				</form>
			</tr>
			<tr>
				<form action="Register.jsp">
					<input type="submit" onclick="Register.jsp" id="register" value="Register">
				</form>
			</tr>
		</table>
		
		<form action="./Login" method="POST">
			<input type="email" name="uEmail" placeholder="Email*" required>
			<input type="password" name="uPassword" placeholder="Password*" required>
			<input type="submit" name="uSubmit" value="Submit">
		</form>
	</div>
</body>
</html>