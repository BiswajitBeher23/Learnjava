<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="Layouts/Header.jsp"></jsp:include>
<jsp:include page="Components/Navbar.jsp"></jsp:include>

<main class="px-lg-5 py-lg-5">
<c:forEach var="variable" items="${aboutus}">


	<h2 class="text-center px-5 py-5"><c:out value="${variable.about_title }" /></h2>
	<div class="vr"></div>
	<div class="container px-5 py-5">
		<p><c:out value="${variable.aboutus_desc}" /></p>
	</div>
</c:forEach>
</main>

<jsp:include page="Components/Footer.jsp"></jsp:include>
<jsp:include page="Layouts/Webend.jsp"></jsp:include>