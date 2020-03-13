<html>
	<head>
		<title>展示用户数据</title>
		<meta charset="utf-9"></meta>
	</head>
	
	<body>
		
		<table border="1" align="center" width="50%">
			
			<tr>
				
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
			
			<#list studentlist as student >
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td>${student.sex}</td>
				</tr>
			</#list>	
		</table>
	</body>
</html>