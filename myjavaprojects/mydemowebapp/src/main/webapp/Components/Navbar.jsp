<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Navbar -->
	<div class="container-fluid">
		<header
			class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
			<a href="<%= request.getContextPath() %>/"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
				<span class="fs-4">Demo</span>
			</a>

			<ul class="nav nav-pills">
				<li class="nav-item"><a href="<%= request.getContextPath() %>/" class="nav-link active"
					aria-current="page">Home</a></li>
				<li class="nav-item"><a href="<%= request.getContextPath() %>/feature" class="nav-link">Features</a></li>
				<li class="nav-item"><a href="<%= request.getContextPath() %>/price" class="nav-link">Pricing</a></li>
				<li class="nav-item"><a href="<%= request.getContextPath() %>/faq" class="nav-link">FAQs</a></li>
				<li class="nav-item"><a href="<%= request.getContextPath() %>/aboutus" class="nav-link">About</a></li>
			</ul>
		</header>
	</div>

    