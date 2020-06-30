<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.clpudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$.ajax({
			dataType: "json",
			url: "https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/storesByGeo/json",
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
<head>
<meta charset="UTF-8">
<title>마스크 API</title>
</head>
<body>
	<a>마스크 정보</a>
	<div style="width=1100px;margin:0 auto;">
		<div id="example"></div>
	</div>
</body>
</html>