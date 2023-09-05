<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Biblioteca binaria</title>
</head>

<body>
    <?php
    function binario($numero) {
        return preg_match_all("/[0-9]/", $numero);
    }
    ?>
</body>

</html>