<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:red;text-align:center">LOGIN PAGE</h1>
	<br><br><br>
	<form:form  modelAttribute="loginDtls">
		<table align="center" >
			<caption><font style= "color: blue; text-decoration: underline; font-size: x-large;"><b>Sign In Here</b></font></caption>
			<tr> </tr><tr> </tr><tr> </tr><tr> </tr><tr> </tr><tr> </tr>
			<tr>
				<td>USERNAME &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:: </td>
				<td><form:input path="userName"/></td>
			</tr>
			<tr>
				<td>PASSWORD	 &nbsp;::</td>
				<td><form:input path="password"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>	
			<tr>
				<td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="loadForm.htm"><font color="cyan">Sign up?</font></a>
				</td>
			</tr>			
		</table>	
	</form:form>
</body>
</html>