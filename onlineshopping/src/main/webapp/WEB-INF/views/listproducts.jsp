<div class="container">
	<div class="row">
		<div class="col-md-3">
			<%@ include file="./shared/sidebar.jsp"%>

		</div>
		<div class="col-md-9">

			<div class="row">
				<div class="col-md-12">
					<c:if test="${userClickAllProducts== true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home </a>
						<li class="acive">All Producs</li>
					</ol>
					</c:if>
					<c:if test="${userClickCategoryProducts== true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home </a>
						<li class="acive">Category</li>
						<li class="acive">${category.name}</li>
					</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>