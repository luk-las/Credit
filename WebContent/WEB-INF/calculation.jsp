<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/css/bootstrap.min.css"
integrity="sha384-PDle/QlgIONtM1aqA2Qemk5gPOE7wFq8+Em+G/hmo5Iq0CCmYZLv3fVRDJ4MMwEA" crossorigin="anonymous">
<style>
	.frame, .frame2{background-color: #fff; border: 2px solid #555; padding: 3px; width: 250px;border-radius: 5px}
	.frame2 {background-color: #e3e3e3}
</style>
<title>Kredyt</title>
</head>
<body>
	<div style="margin: auto; width: 250px; padding-top: 50px; text-align: center">
		
		<fieldset class="frame">Kwota: ${CAL.amountCalc} zl </fieldset><br/>
		<fieldset class="frame">Okres: ${CAL.repaymentPeriodCalc} miesiecy </fieldset><br/>
		<fieldset class="frame">Oprocentowanie: ${CAL.bankRateCalc} % </fieldset><br/>
		<fieldset class="frame2">Miesieczna rata: ${CAL.monthlyRate} zl </fieldset><br/>
		<fieldset class="frame2">Koszt kredytu: ${CAL.cost} zl </fieldset><br/>
		<a href="">Cofnij</a>
	</div>
</body>
</html>