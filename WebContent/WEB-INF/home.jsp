<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/css/bootstrap.min.css"
integrity="sha384-PDle/QlgIONtM1aqA2Qemk5gPOE7wFq8+Em+G/hmo5Iq0CCmYZLv3fVRDJ4MMwEA" crossorigin="anonymous">
<title>Kredyt</title>
</head>
<body>
	<div style="margin: auto; width: 250px; padding-top: 50px">
		<form:form method="post" modelAttribute="data">
			<div class="form-group">
				<label>Kwota kredytu</label>
				<form:input path="amount" placeholder="10 000 zl" type="text" class="form-control"/>
				<form:errors path="amount" style="color:red" class="form-text text-muted"/>
			</div>
			
			<div class="form-group">
				<label>Okres kredytowania</label>
				<form:input path="repaymentPeriod" placeholder="60 miesiecy" type="text" class="form-control"/>
				<form:errors path="repaymentPeriod" style="color:red" class="form-text text-muted"/>
			</div>
			
			<div class="form-group">
				<label>Oprocentowanie</label>
				<form:input path="bankRate" placeholder="8.5 %" type="text" class="form-control"/>
				<form:errors path="bankRate" style="color:red" class="form-text text-muted"/>
			</div>
			<div style="text-align: center">
			<form:button type="submit" class="btn btn-success">	Wylicz</form:button>
			</div>		
		</form:form>
	</div>

</body>
</html>