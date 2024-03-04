<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="Layouts/Header.jsp"></jsp:include>
<jsp:include page="Components/Navbar.jsp"></jsp:include>
<svg xmlns="http://www.w3.org/2000/svg" class="d-none">
      <symbol id="check2" viewBox="0 0 16 16">
        <path
		d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z" />
      </symbol>
      <symbol id="circle-half" viewBox="0 0 16 16">
        <path
		d="M8 15A7 7 0 1 0 8 1v14zm0 1A8 8 0 1 1 8 0a8 8 0 0 1 0 16z" />
      </symbol>
      <symbol id="moon-stars-fill" viewBox="0 0 16 16">
        <path
		d="M6 .278a.768.768 0 0 1 .08.858 7.208 7.208 0 0 0-.878 3.46c0 4.021 3.278 7.277 7.318 7.277.527 0 1.04-.055 1.533-.16a.787.787 0 0 1 .81.316.733.733 0 0 1-.031.893A8.349 8.349 0 0 1 8.344 16C3.734 16 0 12.286 0 7.71 0 4.266 2.114 1.312 5.124.06A.752.752 0 0 1 6 .278z" />
        <path
		d="M10.794 3.148a.217.217 0 0 1 .412 0l.387 1.162c.173.518.579.924 1.097 1.097l1.162.387a.217.217 0 0 1 0 .412l-1.162.387a1.734 1.734 0 0 0-1.097 1.097l-.387 1.162a.217.217 0 0 1-.412 0l-.387-1.162A1.734 1.734 0 0 0 9.31 6.593l-1.162-.387a.217.217 0 0 1 0-.412l1.162-.387a1.734 1.734 0 0 0 1.097-1.097l.387-1.162zM13.863.099a.145.145 0 0 1 .274 0l.258.774c.115.346.386.617.732.732l.774.258a.145.145 0 0 1 0 .274l-.774.258a1.156 1.156 0 0 0-.732.732l-.258.774a.145.145 0 0 1-.274 0l-.258-.774a1.156 1.156 0 0 0-.732-.732l-.774-.258a.145.145 0 0 1 0-.274l.774-.258c.346-.115.617-.386.732-.732L13.863.1z" />
      </symbol>
      <symbol id="sun-fill" viewBox="0 0 16 16">
        <path
		d="M8 12a4 4 0 1 0 0-8 4 4 0 0 0 0 8zM8 0a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 0zm0 13a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 13zm8-5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2a.5.5 0 0 1 .5.5zM3 8a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2A.5.5 0 0 1 3 8zm10.657-5.657a.5.5 0 0 1 0 .707l-1.414 1.415a.5.5 0 1 1-.707-.708l1.414-1.414a.5.5 0 0 1 .707 0zm-9.193 9.193a.5.5 0 0 1 0 .707L3.05 13.657a.5.5 0 0 1-.707-.707l1.414-1.414a.5.5 0 0 1 .707 0zm9.193 2.121a.5.5 0 0 1-.707 0l-1.414-1.414a.5.5 0 0 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .707zM4.464 4.465a.5.5 0 0 1-.707 0L2.343 3.05a.5.5 0 1 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .708z" />
      </symbol>
    </svg>

<svg xmlns="http://www.w3.org/2000/svg" class="d-none">
  <symbol id="check" viewBox="0 0 16 16">
    <title>Check</title>
    <path
		d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z" />
  </symbol>
</svg>
<main>
	<div class="container px-4 py-5">
		<h1 class="text-center">Pricing Chart</h1>
		<div class="row row-cols-1 row-cols-md-3 mb-3 text-center py-5">
			<div class="col">
				<div class="card mb-4 rounded-3 shadow-sm">
					<div class="card-header py-3">
						<h4 class="my-0 fw-normal">Free</h4>
					</div>
					<div class="card-body">
						<h1 class="card-title pricing-card-title">
							$0<small class="text-body-secondary fw-light">/mo</small>
						</h1>
						<ul class="list-unstyled mt-3 mb-4">
							<li>10 users included</li>
							<li>2 GB of storage</li>
							<li>Email support</li>
							<li>Help center access</li>
						</ul>
						<button type="button" class="w-100 btn btn-lg btn-outline-primary">Sign
							up for free</button>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card mb-4 rounded-3 shadow-sm">
					<div class="card-header py-3">
						<h4 class="my-0 fw-normal">Pro</h4>
					</div>
					<div class="card-body">
						<h1 class="card-title pricing-card-title">
							$15<small class="text-body-secondary fw-light">/mo</small>
						</h1>
						<ul class="list-unstyled mt-3 mb-4">
							<li>20 users included</li>
							<li>10 GB of storage</li>
							<li>Priority email support</li>
							<li>Help center access</li>
						</ul>
						<button type="button" class="w-100 btn btn-lg btn-primary">Get
							started</button>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card mb-4 rounded-3 shadow-sm border-primary">
					<div class="card-header py-3 text-bg-primary border-primary">
						<h4 class="my-0 fw-normal">Enterprise</h4>
					</div>
					<div class="card-body">
						<h1 class="card-title pricing-card-title">
							$29<small class="text-body-secondary fw-light">/mo</small>
						</h1>
						<ul class="list-unstyled mt-3 mb-4">
							<li>30 users included</li>
							<li>15 GB of storage</li>
							<li>Phone and email support</li>
							<li>Help center access</li>
						</ul>
						<button type="button" class="w-100 btn btn-lg btn-primary">Contact
							us</button>
					</div>
				</div>
			</div>
		</div>

		<h2 class="display-6 text-center mb-4">Compare plans</h2>

		<div class="table-responsive">
			<table class="table text-center">
				<thead>
					<tr>
						<th style="width: 34%;"></th>
						<th style="width: 22%;">Free</th>
						<th style="width: 22%;">Pro</th>
						<th style="width: 22%;">Enterprise</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row" class="text-start">Public</th>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
					</tr>
					<tr>
						<th scope="row" class="text-start">Private</th>
						<td></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
					</tr>
				</tbody>

				<tbody>
					<tr>
						<th scope="row" class="text-start">Permissions</th>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
					</tr>
					<tr>
						<th scope="row" class="text-start">Sharing</th>
						<td></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
					</tr>
					<tr>
						<th scope="row" class="text-start">Unlimited members</th>
						<td></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
					</tr>
					<tr>
						<th scope="row" class="text-start">Extra security</th>
						<td></td>
						<td></td>
						<td><svg class="bi" width="24" height="24">
							<use xlink:href="#check" /></svg></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</main>

<jsp:include page="Components/Footer.jsp"></jsp:include>
<jsp:include page="Layouts/Webend.jsp"></jsp:include>