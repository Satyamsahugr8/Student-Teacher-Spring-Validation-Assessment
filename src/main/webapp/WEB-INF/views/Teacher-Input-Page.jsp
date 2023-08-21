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

	<form:form action="submitFormTeacher" modelAttribute="teacher">
	First Name:<form:input path="firstName" />
	<form:errors path="firstName" cssClass="error">
		</form:errors>
		<br>
	Last Name:<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error">
		</form:errors>
		<br>
	Employee ID:<form:input path="empId" />
		<form:errors path="empId" cssClass="error">
		</form:errors>
		<br>
	Subject Name:<form:input path="subject" />
		<form:errors path="subject" cssClass="error">
		</form:errors>
		<br>	
		
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>