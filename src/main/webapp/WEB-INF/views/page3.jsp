<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taste-o-Meter</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" />
<link rel="stylesheet" href="style.css" />
</head>
<body>

	<div class="container">

		<h1 class="display-2">taste-o-meter</h1>
		<h3 class="display-3">Films watched: ${count}</h3>


		<form action="/page4">
			<table class="table">
				<tr>
					<th></th>
					<th>Title</th>
					<th>Released</th>
					<th></th>
				</tr>

				<c:forEach var="mov" items="${page1}">
					<tr>
						<td><img src="https://image.tmdb.org/t/p/w200/${mov.poster}" />
						</td>
						<td>${mov.title}</td>
						<td>${mov.releaseDate}</td>
						<td><input type="checkbox" value="1" name="count" /></td>
					</tr>
				</c:forEach>
				<c:forEach var="mov" items="${page2}">
					<tr>
						<td><img src="https://image.tmdb.org/t/p/w200/${mov.poster}" />
						</td>
						<td>${mov.title}</td>
						<td>${mov.releaseDate}</td>
						<td><input type="checkbox" value="1" name="count" /></td>
					</tr>
				</c:forEach>
				<c:forEach var="mov" items="${page3}">
					<tr>
						<td><img src="https://image.tmdb.org/t/p/w200/${mov.poster}" />
						</td>
						<td>${mov.title}</td>
						<td>${mov.releaseDate}</td>
						<td><input type="checkbox" value="1" name="count" /></td>
					</tr>
				</c:forEach>
				<c:forEach var="mov" items="${page4}">
					<tr>
						<td><img src="https://image.tmdb.org/t/p/w200/${mov.poster}" />
						</td>
						<td>${mov.title}</td>
						<td>${mov.releaseDate}</td>
						<td><input type="checkbox" value="1" name="count" /></td>
					</tr>
				</c:forEach>
				<c:forEach var="mov" items="${page5}">
					<tr>
						<td><img src="https://image.tmdb.org/t/p/w200/${mov.poster}" />
						</td>
						<td>${mov.title}</td>
						<td>${mov.releaseDate}</td>
						<td><input type="checkbox" value="1" name="count" /></td>
					</tr>
				</c:forEach>

			</table>


			<input type="hidden" value="${count}" name="count" />
			<button type="submit">Next</button>

		</form>







	</div>

</body>
</html>