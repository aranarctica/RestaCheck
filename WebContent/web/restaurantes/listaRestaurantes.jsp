

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>
<%
	RestauranteModelo restauranteModelo = new RestauranteModelo();

	ArrayList<Restaurante> restaurantes = restauranteModelo.selectAll();
%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Creative - Start Bootstrap Theme</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>

<!-- Plugin CSS -->
<link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/creative.min.css" rel="stylesheet">

</head>
<span class="group-btn"> <a
	href="../restaurantes/anadirRestaurante.jsp" class="btn btn-primary btn-md">Añadir
		un Restaurante <i class="fa fa-sign-in"></i>
</a>
	<body id="page-top">


		<%
			Iterator<Restaurante> i = restaurantes.iterator();
			Restaurante restaurante;

			while (i.hasNext()) {
				restaurante = i.next();
		%>

		<section class="p-0" id="portfolio">

			<div class="container-fluid p-0">
				<div class="row no-gutters popup-gallery">
					<div class="col-lg-4 col-sm-6">
						<a class="portfolio-box"
							href="../restaurantes/infoRestaurante.jsp?idRestaurante=<%=restaurante.getIdRestaurante() %>">
							<img class="img-fluid" src="img/portfolio/thumbnails/1.jpg"
							alt="">
							<div class="portfolio-box-caption">
								<div class="portfolio-box-caption-content">

									<div class="project-name"><%=restaurante.getNombre()%></div>



								</div>
							</div>
						</a>
					</div>





				</div>
			</div>
			<%
				}
			%>
		</section>




		<!-- Bootstrap core JavaScript -->
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- Plugin JavaScript -->
		<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
		<script src="vendor/scrollreveal/scrollreveal.min.js"></script>
		<script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

		<!-- Custom scripts for this template -->
		<script src="js/creative.min.js"></script>

	</body>
</html>
