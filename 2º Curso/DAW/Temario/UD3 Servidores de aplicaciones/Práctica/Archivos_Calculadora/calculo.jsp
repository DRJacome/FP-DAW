<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora científica</title>
</head>
<body>
	<h1>Esta es la calculadora científica de ablancosantos</h1>
	<div align="center">
		<table>
			<tr>
				<td>Indicar los números a utilizar en la operación</td>
			</tr>
			<tr>
				<td>
					<form action="calculo" method="post">
						<table>
							<tr>
								<td>Número A:</td>
								<td><input type="text" size="20" name="numa"></td>
							</tr>
							<tr>
								<td>Numero B:</td>
								<td><input type="text" size="20" name="numb"></td>
							</tr>
							<tr>
								<td><input type="submit" value="sumar" name="operacion">
								</td>
								<td><input type="submit" value="restar" name="operacion">
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>