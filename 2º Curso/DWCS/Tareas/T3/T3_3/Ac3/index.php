<?php session_start(); ?>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Index T3.3.3</title>
</head>

<body>
    <div id="container">
        <div id="content">
            <?php
            include $_REQUEST['tarefa'] . '.php';
            ?>
        </div>
</body>

</html>