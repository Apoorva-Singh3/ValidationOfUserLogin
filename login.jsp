<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
  
        <h3>Enter Login details</h3>
  
        <table>
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>User Password:</td>
                <td><input type="password" name="password" /></td>
            </tr>
  
        </table>
          
        <input type="submit" value="Login" />
  
    </form>
</body>
</html>