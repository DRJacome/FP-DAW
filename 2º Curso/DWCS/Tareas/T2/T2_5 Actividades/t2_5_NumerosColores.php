<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>t2_5_NumerosColores</title>
</head>

<body>
    <h3>Actividade 3. Realiza un programa que pida 8 números enteiros 
        e que logo amose esos números con cores: os pares dunha cor 
        e os impares doutro.</h3>
    <?php
    if (!isset($_POST['n'])) {
        $contadorNumeros = 0;
        $numeroTexto = "";
    } else {
        $contadorNumeros = $_POST['contadorNumeros'];
        $numeroTexto = $_GET['numeroTexto'];
    }

    if ($contadorNumeros < 9) {
        // Si $n exite, inicializará les 3 variables.
        if (isset($_POST['n'])) {
            $contadorNumeros = $_POST['contadorNumeros'];
            $n = $_POST['n'];
            $numeroTexto = $_POST['numeroTexto'];
            // $numeroTexto está vacío, se asignará el valor de $n a $numeroTexto.
            if ($numeroTexto == "") {
                $numeroTexto = $n;
            } else {
                // Si no, se almacena en $numeroTexto el valor de $numeroTexto en esa iteración
                // y concatenado con un espacio en blanco y el valor de $n.
                $numeroTexto = $numeroTexto . ' ' . $n;
            }
        }
        $contadorNumeros++;
    }
    if (!isset($_POST['n']) || ($contadorNumeros < 16)) {
    ?>
        <form action="t2_5_NumerosColores.php" method="post">
            <input type="hidden" name="ejercicio" value="06">
            Introduce un número:<br><br>
            <input type="number" name="n" autofocus="" required=""><br><br>
            <input type="hidden" name="contadorNumeros" value="<?php echo $contadorNumeros; ?>">
            <input type="hidden" name="numeroTexto" value="<?php echo $numeroTexto; ?>">
            <input type="submit" value="Enviar">
        </form>
    <?php
    }

    if ($contadorNumeros == 9) {
        $numero = explode(" ", $numeroTexto);

        foreach ($numero as $n) {
            if ($n % 2 == 0) {
              echo "<span style=\"color: magenta;\">$n&nbsp;&nbsp;</span>";
            } else {
              echo "<span style=\"color: green;\">$n&nbsp;&nbsp;</span>";
            }
          }
      
          echo "<span style=\"color: magenta;\"><br>pares<br></span>";
          echo "<span style=\"color: green;\">impares</span>";
        }
    ?>
</body>

</html>