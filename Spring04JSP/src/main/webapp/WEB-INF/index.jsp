<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="uetak.entity.Shain"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>社員一覧</title>
<style>
table {
	border-collapse: collapse;
	/* セルの境界線を重ねて単線にする */
}

th, td {
	border: 1px solid black;
	/* セルの境界線のスタイルを設定 */
	padding: 10px;
}
</style>
</head>

<body>
	<h1>社員一覧</h1>

	<table border="1">
		<tr bgcolor="#cccccc">
			<th>ID</th>
			<th>名前</th>
			<th>姓</th>
			<th>年</th>
			<th>住所</th>
			<th>変更</th>
			<th>削除</th>
		</tr>
		<%
		//社員リストを作る
		ArrayList<Shain> shainList = new ArrayList<>();

		//社員１を作る
		Shain shain1 = new Shain();
		shain1.setId(101);
		shain1.setName("鈴木義信");
		shain1.setGender("男");
		shain1.setNen(2003);
		shain1.setAddress("宮城県仙台市");
		shainList.add(shain1);

		Shain shain2 = new Shain();
		shain2.setId(102);
		shain2.setName("佐藤香織");
		shain2.setGender("女");
		shain2.setNen(2004);
		shain2.setAddress("福岡県福岡市");
		shainList.add(shain2);
		%>
		<%
		for (Shain shain : shainList) {
		%>
		<tr>
			<td><%=shain.getId()%></td>
			<td><%=shain.getName()%></td>
			<td><%=shain.getGender()%></td>
			<td><%=shain.getNen()%></td>
			<td><%=shain.getAddress()%></td>
			<td>変更</td>
			<td>削除</td>
		</tr>
		<%
		}
		%>
	</table>
	<p></p>
	<!-- 「社員を登録する」ボタン -->
	<form action="insert" method="get">
		<input type="submit" value="社員を登録する">
	</form>
</body>

</html>