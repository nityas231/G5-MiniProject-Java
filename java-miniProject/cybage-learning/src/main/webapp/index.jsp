<html lang="en">
<head>
<title>Index Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="webjars/bootstrap/4.5.3/css/bootstrap.min.css">
<script src="webjars/bootstrap/4.5.3s/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<!-- Category Card. -->
	<div class="card" style="width: 18rem;">
		<img class="card-img-top" src="..." alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title">Card title</h5>
			<p class="card-text">Some quick example text to build on the card
				title and make up the bulk of the card's content.</p>
			<a href="#" class="btn btn-primary" data-toggle="modal"
				data-target="#categoryModal">Add Category</a>
		</div>
	</div>

	<!-- Modal for adding the category. -->
	<div class="modal fade" id="categoryModal" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="categoryTitle">Add a Category</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="<%=request.getContextPath()%>/AdminController/addCategory">
						Category Name: <input type="text" id="cname" name="categoryName"><br>
						<br>
						Image Url: <input type="text" id="curl" name="imageUrl"><br>
						<br> <input type="submit" value="Submit">
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
