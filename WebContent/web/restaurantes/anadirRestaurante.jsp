<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%
	if (request.getParameter("guardar").equals("guardar")) {
		if (request.getParameter("nombre") != null && request.getParameter("direccion") != null) {
			String nombre = request.getParameter("nombre");
			String direccion = request.getParameter("direccion");
			Restaurante restaurante = new Restaurante();
			restaurante.getNombre();
			restaurante.getDireccion();
			RestauranteModelo restauranteModelo = new RestauranteModelo();
			restauranteModelo.insert(restaurante);
		}
	}
%>

<!DOCTYPE html>
<html>
<body>
	<link
		href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Añade Un Restaurante</h3>
					</div>
					<div class="panel-body">
						<form role="form">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="first_name" id="nombre"
											class="form-control input-sm" placeholder="nombre">
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="last_name" id="direccion"
											class="form-control input-sm" placeholder="direccion">
									</div>
								</div>





 ta 
								<input type="submit" name="guardar" value="guardar" /> </span> <span
									class="group-btn"> <a
									href="../cocineros/listaRestaurantes.jsp"
									class="btn btn-primary btn-md">Cancelar </a>
								</span>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>