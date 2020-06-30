<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마스크 API</title>
<script type="text/javascript">
$(document).ready(function(){
	 $.ajax({
	        dataType: "json",
			url :"https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/storesByGeo/json",
	        mimeType: "application/json",
	        success: function(result){
	            var tableData = "<table class='table table-bordered'><th>약국주소</th><th>약국이름</th><th>제공시간</th>";
				var dataSet=[];
				for(key in result) {
				    if(result.hasOwnProperty("stores")) {
				        var dataSet = result[key];
				    }
				}
	            $.each(dataSet, function(index, key) {
           			tableData += '<tr>';
 		            tableData += '<td>'+key.addr+'</td>';
 		            tableData += '<td>'+key.name+'</td>';
 		            tableData += '<td>'+key.stock_at+'</td>';
 		            tableData += '</tr>';
	            });
	            tableData += "</table>"
	            $("#example").append(tableData);
	        }
	    });
});
</script>
</head>
<body>
	<div style="width:1100px;margin:0 auto;">
		<div id="example"></div>
	</div>
</body>
</html>