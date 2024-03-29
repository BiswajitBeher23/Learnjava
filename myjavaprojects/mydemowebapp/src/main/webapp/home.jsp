<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="Layouts/Header.jsp"></jsp:include>
<jsp:include page="Components/Navbar.jsp"></jsp:include>
<!-- Hero section 
<div class="px-4 py-5 my-5 text-center">
	<img class="d-block mx-auto mb-4"
		src="https://getbootstrap.com/docs/5.3/assets/brand/bootstrap-logo.svg"
		alt="" width="72" height="57">
	<h1 class="display-5 fw-bold text-body-emphasis">Centered hero</h1>
	<div class="col-lg-6 mx-auto">
		<p class="lead mb-4">Quickly design and customize responsive
			mobile-first sites with Bootstrap, the world’s most popular front-end
			open source toolkit, featuring Sass variables and mixins, responsive
			grid system, extensive prebuilt components, and powerful JavaScript
			plugins.</p>
		<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
			<button type="button" class="btn btn-primary btn-lg rounded-pill px-4 gap-3">Primary
				button</button>
			<button type="button" class="btn btn-outline-secondary btn-lg rounded-pill px-4">Secondary</button>
		</div>
	</div>

</div>-->

	<div class="px-4 py-5 my-5 text-center">
		<img class="d-block mx-auto mb-4"
			src="https://getbootstrap.com/docs/5.3/assets/brand/bootstrap-logo.svg"
			alt="" width="72" height="57">
	<c:forEach var="hero" items="${listhome}">
	    
		<h1 class="display-5 fw-bold text-body-emphasis">
	      <c:out value="${hero.home_title}"></c:out>
		</h1>
		<div class="col-lg-6 mx-auto">
			<p class="lead mb-4">
				<c:out value="${hero.home_para}"></c:out>
			</p>
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
				<button type="button"
					class="btn btn-primary btn-lg rounded-pill px-4 gap-3">Primary
					button</button>
				<button type="button"
					class="btn btn-outline-secondary btn-lg rounded-pill px-4">Secondary</button>
			</div>
		</div>
	</c:forEach>
</div>



<jsp:include page="Components/Footer.jsp"></jsp:include>
<jsp:include page="Layouts/Webend.jsp"></jsp:include>
