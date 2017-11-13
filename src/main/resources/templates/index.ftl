<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sample</title>

</head>
<body>
<h1> Sample </h1>
<script
        src="https://code.jquery.com/jquery-3.2.1.min.js"
        integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
        crossorigin="anonymous"></script>
<script>
    $( document ).ready(function(){
       getData();
    });



    function getData(){
        $.ajax({
            url: "/test",
            type: "get",
            success: function () {
                alert("success");
            }, error : function () {
                alert("error");
            }, done : function (){
                alert("done");
            }
        });
    }

</script>
</body>
</html>