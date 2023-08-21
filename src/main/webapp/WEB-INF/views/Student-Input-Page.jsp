<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{color:red}
</style>
</head>
<body>

	<form:form action="submitFormStudent" modelAttribute="student">
	First Name:<form:input path="firstName" />
	<form:errors path="firstName" cssClass="error">
		</form:errors>
		<br>
	Last Name:<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error">
		</form:errors>
		<br>
	Roll Number:<form:input path="rollNo" />
		<form:errors path="rollNo" cssClass="error">
		</form:errors>
		<br>
	Branch Name:<form:input path="branch" />
		<form:errors path="branch" cssClass="error">
		</form:errors>
		<br>	
		
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>