<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<form method='post'> <!-- handler의 url이다 .jsp는 안붙임-->
	<!--<form action='userOut'  action값이 없어도 정상출력됨 -->
	<label>이름: <input type='text' name='userName'/></label>
	<label>나이: <input type='number' name='age'/></label>
	<label>등록일: <input type='date' name='regDate'/></label>
	<input type='submit'/>
</form> 