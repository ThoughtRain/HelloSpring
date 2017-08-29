<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<head>
    <title>${msg}</title>
    <script type="text/javascript">
        function hideElement() {
            var url = "${pageContext.request.contextPath}/data/times/json";
            alert("到了")

            $.ajax({
                url: url,
                type: 'get',
                dataType: "json",
                success: function (data) {
                    alert(data)
                }
            });
            console.log()
        }
    </script>
</head>
<body>
<input type="button" value="提交" onclick="hideElement()">
</body>
</html>