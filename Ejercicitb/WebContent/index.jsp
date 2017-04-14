<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Predictor</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<script src="jquery-ui-1.12.1.custom/external/jquery/jquery.js"></script>
<script src="jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<link href="estilo.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/datos.js"></script>
</head>
<body>
	<div class="container">
		<h1>
			<strong>"Pico y placa" predictor</strong>
		</h1>
		</br>
		<form action="return false" method="POST" accept-charset="utf-8">
			<div class="form-group">
					<p>
					<label style="color:#3c766a">This program will return if a vehicule CAN or CAN NOT can be on the road on a cartainly time.</label>
					</br>
					<label style="color:#3c766a">Horary to "pico y placa" is: since 7:00 hours from 9:30 hours and since 16:00 hours from 19:30 hours.</label>
					<li style="color:black">
					<label>License plate number</label> 
					<input placeholder="Example: ABC-1234 or ABC-123" class="form-control"	type="text" name="placa" id="placa" value="" maxlength="8" required pattern="^([A-Z]{3}-\d{3,5})$" title="Correct Format Example:ABC-1234 or ABC-123" />
					</li> 
					<li style="color:black">
					<label>Date</label> 
					<input class="form-control" type="date" name="fecha" id="fecha" required title="Correct Format Example: dd/mm/aaaa or select by the widget" />
					</li>
					<li style="color:black">
					<label>Time</label> 
					<input class="form-control" type="time" name="hora"	id="hora" required/>
					</li>
				</p>
			</div>
			<input type="submit" class="btn btn-info btn-lg btn-block" name=""	value="Aceptar">
			</br>
			<div id="resultado"></div>
		</form>
	</div>
</body>
</html>