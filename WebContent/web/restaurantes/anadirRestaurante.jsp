<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%
	if (request.getParameter("nombre") != null && request.getParameter("direccion") != null && request.getParameter("telefono")!= null) {
		String nombre = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		Restaurante restaurante = new Restaurante();
		restaurante.setNombre(nombre);
		restaurante.setDireccion(direccion);
		restaurante.setTelefono(telefono);
		RestauranteModelo restauranteModelo = new RestauranteModelo();
		restauranteModelo.insert(restaurante);
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
						<h3 class="panel-title">A�ade Un Restaurante</h3>

					</div>
					<div class="panel-body">
						<form action="anadirRestaurante.jsp" method="post" role="form">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="nombre" id="nombre"
											class="form-control input-sm" placeholder="nombre">
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="direccion" id="direccion"
											class="form-control input-sm" placeholder="direccion">
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="telefono" id="telefono"
											class="form-control input-sm" placeholder="telefono">
									</div>
								</div>
								
								
								<span class="group-btn">
									<input type="file" name="file" /> 
								
								 <a
									href="../restaurantes/listaRestaurantes.jsp"><input
										class="btn btn-primary btn-md" type="submit" name="guardar"
										value="guardar"> </a> <span class="group-btn"> <a
										href="../restaurantes/listaRestaurantes.jsp"
										class="btn btn-primary btn-md">Atras </a>
								</span>
						</form>

					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>