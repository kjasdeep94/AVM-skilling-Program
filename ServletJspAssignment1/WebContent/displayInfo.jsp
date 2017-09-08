<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="key1" class="in.jdKaur.CustomerBean" scope="request"></jsp:useBean>
<jsp:useBean id="key2" class="in.jdKaur.AccountBean" scope="request"></jsp:useBean>

	<table border="2px">
		<tr>
			<th>Customer Id</th><th>Customer Name</th><th>Gender</th><th>Account Number</th>
		</tr>
		<tr>
			<td><jsp:getProperty property="customerId" name="key1"/></td>
			<td><jsp:getProperty property="customerName" name="key1"/></td>
			<td><jsp:getProperty property="gender" name="key1"/></td>
			<td><jsp:getProperty property="accountNumber" name="key1"/></td>
		</tr>
	</table>
	<hr>
	<table border="2px">
	<tr>
			<th>Account Number</th><th>IFSC</th><th>Bank Name</th><th>Branch Name</th><th>Amount</th>
		</tr>
		<tr>
			<td><jsp:getProperty property="accountNumber" name="key2"/></td>
			<td><jsp:getProperty property="ifsc" name="key2"/></td>
			<td><jsp:getProperty property="bankName" name="key2"/></td>
			<td><jsp:getProperty property="branchName" name="key2"/></td>
			<td><jsp:getProperty property="amount" name="key2"/></td>
		</tr>
	
	</table>
</body>
</html>