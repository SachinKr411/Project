<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: red; text-align: center">REGISTRATION FORM</h1>
	<form:form action="sendOtp" method="POST" modelAttribute="userAcc">
		<table  align="center">
			<tr>
				<td>FIRSTNAME ::</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>LASTNAME ::</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>PHONE NO ::</td>
				<td><form:input path="phno" /></td>
			</tr>
			<tr>
				<td>DATE OF BIRTH ::</td>
				<td><form:input path="dob" /><font color= "fuchsia">{dd/MM/yyyy}</font></td>
			</tr>
			<tr>
				<td>ADDRESS ::</td>
				<td><form:input path="adds" /></td>
			</tr>		
			<tr>
				<td>USERNAME ::</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
			<td>PASSWORD ::</td>
			<td><form:input path="password" /></td>
			</tr>
					 
				<tr>
					<td>&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
						<input type="reset" value="reset">
					</td>
					<td>
						<input type="submit" value="Register">	
					</td>
				</tr>	
				<tr></tr><tr></tr>	<tr></tr><tr></tr>	<tr></tr><tr></tr>	
					<tr>
						<td>
							<a href= "login.htm"><font style="color: blue">LOGIN PAGE</font></a>
						<td>
					</tr>
					
		</table>
	</form:form>
</body>
</html>