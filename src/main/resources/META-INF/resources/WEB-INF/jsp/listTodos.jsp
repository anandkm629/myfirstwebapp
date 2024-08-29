<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
<title>List Todos Page</title>
</head>
<body>

	<h1>Welcome to the Todos Page!</h1>
	<div>Your Todos are :</div>

	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>is Done?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate }</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>