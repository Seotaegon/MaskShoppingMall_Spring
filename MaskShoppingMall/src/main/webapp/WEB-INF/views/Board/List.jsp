<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.myspring.shopping.Bean.BoardBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>

	<table>
	  <tr>
	    <td align="right">
	       <a>글쓰기</a>
	    </td>
	  </tr>
	</table>
	
	<table>
		<tr height="30"> 
	      <td align="center"  width="50"  >번 호</td> 
	      <td align="center"  width="250" >제   목</td> 
	      <td align="center"  width="100" >작성자</td>
	      <td align="center"  width="250" >작성일</td>
	      <td align="center"  width="50" >조 회</td>  
	    </tr>
	    <c:forEach items="${list}" var="list">
	    	<tr>
	    		<td><c:out value="${list.num}" /></td>
	    		<td><c:out value="${list.subject}" /></td>
	    		<td><c:out value="${list.writer}" /></td>
	    		<td><fmt:formatDate value="${list.reg_date}" pattern="yyyy-mm-dd" /></td>
	    		<td><c:out value="${list.raedcount}" /></td>
	    	</tr>
	    </c:forEach>
	</table>

</body>
</html>