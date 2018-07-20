<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<title>View And Update</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body >
	<div align="center">
		<h2>Session Details to Update</h2>
		<table>
			
			 <c:forEach var="CourseList" items="${courses}">  
			 <form:form  action="update" method="post"  modelAttribute="course">
			<tr>
			<td><label>${ CourseList.courseName }</label></td>
			<td><form:input path="courseName" value="${ CourseList.courseName }" type="hidden"/></td>
			<td><form:input path="duration" type="text" value="${CourseList.duration}"/></td>
			<%-- <td><form:input path="faculty" type="text" value="${CourseList.faculty}"/></td> --%>
			<td>
			<form:select path="faculty"  >
    <option ${CourseList.faculty == "sachin" ? 'selected="selected"' : ''}   value="sachin">sachin</option>
    <option ${CourseList.faculty == "ram" ? 'selected="selected"' : ''} value="ram">ram</option>
    <option ${CourseList.faculty == "rahim" ? 'selected="selected"' : ''} value="rahim">rahim</option>
  </form:select></td>
			<td><input type="submit" value="update"/></td>
			</form:form>
			 </c:forEach>
			
		</table>
	</div>
</body>
</html>