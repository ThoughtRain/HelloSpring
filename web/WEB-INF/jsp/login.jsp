<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/14
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<head>
    <title>${name}</title>
    <script type="text/javascript">
        function login() {

            var uersname = $('#uersname').val();
            var password = $('#password').val();
            alert("姓名：" + uersname + "/n密码：" + password)
            var url = "${pageContext.request.contextPath}/data/times/json";
            $.ajax({
                url: url,
                type: 'get',
                dataType: "json",
                data: {uersname: uersname, password: password},
                success: function (data) {
                    alert(data.data.name);
                    alert(data.data.password)
                    if (data.data.name!=uersname){

                        return;
                    }


                }
            });
            console.log();
        }

    </script>
</head>
<body>
<form>
    姓名：<input type="text" value="请输入姓名" id="uersname">
    密码：<input type="text" value="请输入密码" id="password">
    <input type="button" value="提交" onclick="login()"/>

</form>
</body>
</html>
