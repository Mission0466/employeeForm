<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h2>Employee Registration</h2>
    <form:form method="POST" action="/submitEmployee" modelAttribute="employeeDTO">
        <table>
            <tr>
                <td>First Name:</td>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td>Second Name:</td>
                <td><form:input path="secondName" /></td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><form:input path="userName" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
