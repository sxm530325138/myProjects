<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@taglib prefix="s"  uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>


	<form action="UserAction" method="post" name="reg">
		用户：<input type="text" name="u.name" /><br /> 
		密码：<input type="password" name="u.password" /><br /> 
		工资：<input type="text" name="u.salary" /><br /> 
		性别：<input type="radio" name="u.sex" checked value="true"/>男
		    <input type="radio" name="u.sex"  value="false"/>女 <br/>
		爱好：<input type="checkbox" name="u.favs"  value="eat"/>吃
		    <input type="checkbox" name="u.favs" value="drink"/>喝
		    <input type="checkbox" name="u.favs" value="play"/>玩
		    <input type="checkbox" name="u.favs" value="happy"/>乐
		    <br/>
		展示：<input type="radio" name="show" checked value="true"/>html
		    <input type="radio" name="show"  value="false"/>json
		    <br/>
		    <s:fielderror name="u.name"></s:fielderror>
		<input type="submit">
		
	</form>
</body>
</html>