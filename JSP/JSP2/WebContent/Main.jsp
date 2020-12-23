<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<center>
		<table border="1" width="800">
			
			<!-- JSP:include tag는 지시어(include)의) 확장된 개념-->
			<!-- JSP:include tag는 지시어와 달리 Parameter Value를 넘겨줄 수 있다. -->
			
			<!-- JSP:include는 해당 파일은 먼저 compile한 후, 그 결과값이 해당 화면에 출력되는 것 -->
				
			<!-- 지시어 include는 넘어온 후 compile되는 차이점이 있다. -->
			
			<!-- top -->
			<tr height="150">
				<td align="center" colspan="2">
					<jsp:include page="Top.jsp"/>
				</td>
			</tr>
			
			<!-- Left -->
			<tr height="400">
				<td align="center">
					<jsp:include page="Left.jsp"/>
				</td>
			
			<!-- Center -->
				<td align="center" width="600">
					<jsp:include page="Center.jsp"/>
				</td>
			</tr>
			
			<!-- Bottom -->
			<tr height="100">
				<td align="center" colspan="2">
					<jsp:include page="Bottom.jsp"/>
				</td>
			</tr>
		</table>
	
	</center>
</body>
</html>