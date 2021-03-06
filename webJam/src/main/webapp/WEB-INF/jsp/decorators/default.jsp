<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<title>webJam</title>

<link rel="icon" href="../../favicon.ico">

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
<link rel="stylesheet" href="css/dashboard.css" type="text/css" />

<sitemesh:write property='head' />
</head>
<body>
	
	<jsp:include page="/WEB-INF/jsp/decorators/header.jsp" />
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-9 col-md-10 main">
				<sitemesh:write property='body' />
			</div>
			<jsp:include page="/WEB-INF/jsp/decorators/left.jsp" />
		</div>
	</div>

</body>
</html>