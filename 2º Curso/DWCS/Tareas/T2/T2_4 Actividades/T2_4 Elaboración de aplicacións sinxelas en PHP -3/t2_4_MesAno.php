<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>t2_4_MesAno</title>
</head>

<body>
    <?php
    $numero = $_POST['numMes'];
    if ($numero > 0 && $numero <= 12) {
        switch ($numero) {
            case '1':
                $mes = "Enero.";
                break;
            case '2':
                $mes = "Febrero.";
                break;
            case '3':
                $mes = "Marzo.";
                break;
            case '4':
                $mes = "Abril.";
                break;
            case '5':
                $mes = "Mayo.";
                break;
            case '6':
                $mes = "Junio.";
                break;
            case '7':
                $mes = "Julio.";
                break;
            case '8':
                $mes = "Agosto.";
                break;
            case '9':
                $mes = "Septiembre.";
                break;
            case '10':
                $mes = "Octubre.";
                break;
            case '11':
                $mes = "Noviembre.";
                break;
            case '12':
                $mes = "Diciembre.";
                break;
            default:
                $mes = "Número incorrecto. Introduce un número entre 1 y 12.";
                break;
        }
    } else {
        echo "Número incorrecto. Introduce un número entre 1 y 12.";
    }
    echo "Mes seleccionado: " . $mes;
    ?>
    <br>
    <a href="index_t2_4.html">Volver</a>
</body>

</html>