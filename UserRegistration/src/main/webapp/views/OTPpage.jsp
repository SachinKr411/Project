<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1 style= "color:red;text-align:center">${MSG}</h1>
	<form:form  action="verifyOtp" method="POST" modelAttribute="userAcc">
	 	<table align="center" >
	 		<caption><font style= "color: blue; text-decoration: underline; font-size: x-large;"><b>Type OTP here</b></font></caption>
	 		<tr> </tr><tr> </tr><tr> </tr><tr> </tr><tr> </tr><tr> </tr>
			<tr>
				<td>OTP  Number&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:: </td>
				<td><form:input path="otpNo"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit"></td>
			</tr>
	 	</table>
	 	</form:form>
</body>
</html>