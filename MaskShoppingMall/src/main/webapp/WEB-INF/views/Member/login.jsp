<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>AOM</title>
</head>
 <body cellpadding="0" cellspacing="0" marginleft="0" margintop="0" width="100%" height="100%" align="center">
   <div class="card align-middle" style="width:20rem; border-radius:20px;">
      <div class="card-title" style="margin-top:30px;">
         <h2 class="card-title text-center" style="color:#113366;">AOM</h2>
      </div>
      <div class="card-body">
      <form role="form" class="form-signin" method="post" autocomplete="off">
        <h5 class="form-signin-heading">로그인</h5>
        <label for="inputEmail" class="sr-only">Your ID</label>
        <input type="email" id="userId" name="userId" class="form-control" placeholder="Your ID" required="required" autofocus><BR>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="userPass" name="userPass" class="form-control" placeholder="Password" required="required"><br>
        <div class="checkbox">

		<p><a href="#">아이디/비밀번호 찾기</a></p>
		<p><a href="#">회원가입</a></p>
          
        </div>
        <button id="signin_btn" name="signin_btn" class="btn btn-lg btn-primary btn-block" type="submit">로 그 인</button>
        	<c:if test="${msg == false}">
					<p style="color: #f00;">로그인에 실패했습니다.</p>
			</c:if>
      </form>
      
      </div>
   </div>

   <div class="modal">
   </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
  </body>
</html>