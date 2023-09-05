<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $diasSemana = $_POST['diaSemana'];
    switch ($diasSemana) {
        case 'lunes':
            $dia = "Hoxe é luns e tomei un café ás 8:00h.";
            break;
        case 'martes':
            $dia = "Hoxe é martes e choveu toda a mañá.";
            break;
        case 'miércoles':
            $dia = "Hoxe é mércores e vou traballar con php.";
            break;
        case 'jueves':
            $dia = "Hoxe é xoves e teño que vir pola tarde.";
            break;
        case 'viernes':
            $dia = "Hoxe é venres e xa case estou na fin de semana.";
            break;
        case 'sábado':
            $dia = "Hoxe é sábado e vou formatear o ordenador.";
            break;
        case 'domingo':
            $dia = "Hoxe é domingo e vou descansar pescando no río.";
            break;
        default:
            $dia = "Día incorrecto.";
            break;
    }
    echo $dia;
    ?>
    <a href="index_t2_4.html"></a>
</body>

</html>