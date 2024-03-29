<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="Layouts/Header.jsp"></jsp:include>
<jsp:include page="Components/Navbar.jsp"></jsp:include>
<jsp:include page="Components/referneces.jsp"></jsp:include>
<!-- Site Features -->
<div class="container px-4 py-5" id="featured-3">
	<h2 class="pb-2 border-bottom">Our Features</h2>
	<div class="row g-4 py-5 row-cols-1 row-cols-lg-3">
		<c:forEach var="tipu" items="${listfeature}">
			<div class="feature col">
				<div
					class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3">
					<svg class="bi" width="1em" height="1em">
						<use xlink:href="#collection" /></svg>
				</div>
				<h3 class="fs-2 text-body-emphasis"><c:out value="${tipu.feature_title}" /></h3>
				<p><c:out value="${tipu.feature_para}" /></p>
				<a href="#" class="icon-link"> Call to action <svg class="bi">
						<use xlink:href="#chevron-right" /></svg>
				</a>
			</div>
		</c:forEach>
		<div class="feature col">
			<div
				class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3">
				<svg class="bi" width="1em" height="1em">
						<use xlink:href="#people-circle" /></svg>
			</div>
			<h3 class="fs-2 text-body-emphasis">Featured title</h3>
			<p>Paragraph of text beneath the heading to explain the heading.
				We'll add onto it with another sentence and probably just keep going
				until we run out of words.</p>
			<a href="#" class="icon-link"> Call to action <svg class="bi">
						<use xlink:href="#chevron-right" /></svg>
			</a>
		</div>
		<div class="feature col">
			<div
				class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3">
				<svg class="bi" width="1em" height="1em">
						<use xlink:href="#toggles2" /></svg>
			</div>
			<h3 class="fs-2 text-body-emphasis">Featured title</h3>
			<p>Paragraph of text beneath the heading to explain the heading.
				We'll add onto it with another sentence and probably just keep going
				until we run out of words.</p>
			<a href="#" class="icon-link"> Call to action <svg class="bi">
						<use xlink:href="#chevron-right" /></svg>
			</a>
		</div>
	</div>
</div>
<jsp:include page="Components/Footer.jsp"></jsp:include>
<jsp:include page="Layouts/Webend.jsp"></jsp:include>

