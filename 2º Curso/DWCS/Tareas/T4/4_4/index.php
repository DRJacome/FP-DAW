<?php session_start(); ?>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Acceso a Bases de Datos</title>
  <link href="css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
  <div class="container">
    <br>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4>
          <span class="glyphicon glyphicon-pencil info" aria-hidden="true"></span>
          Ejercicio 4
        </h4>
      </div>
      <div class="panel-body">
        Crea el programa GESTISIMAL (GESTIón SIMplifcada de Almacén) para llevar
        el control de los artículos de un almacén. De cada artículo se debe saber
        el código, la descripción, el precio de compra, el precio de venta y el
        stock (número de unidades). La entrada y salida de mercancía supone
        respectivamente el incremento y decremento de stock de un determinado
        artículo. Hay que controlar que no se pueda sacar más mercancía de la
        que hay en el almacén. El programa debe tener, al menos, las siguientes
        funcionalidades: listado, alta, baja, modificación, entrada de mercancía
        y salida de mercancía.
      </div>
      <div class="panel-footer">
        <a class="btn btn-default" href="pagina.php?ejercicio=4_4_1/04" role="button">Acceder</a>
      </div>
    </div>

    <div class="panel panel-default">
      <div class="panel-heading">
        <h4>
          <span class="glyphicon glyphicon-pencil info" aria-hidden="true"></span>
          Ejercicio 5
        </h4>
      </div>
      <div class="panel-body">
        Modifica el programa anterior añadiendo las siguientes mejoras:
        <ul>
          <li>
            Comprueba la existencia del código en el alta, la baja y la modificación
            de artículos para evitar errores.
          </li>
          <li>
            Cambia la opción "Salida de stock" por "Venta". Esta nueva opción
            permitirá hacer una venta de varios artículos y emitir la factura
            correspondiente. Se debe preguntar por los códigos y las cantidades
            de cada artículo que se quiere comprar. Aplica un 21% de IVA.
          </li>
        </ul>
      </div>
      <div class="panel-footer">
        <a class="btn btn-default" href="pagina.php?ejercicio=4_4_2/05" role="button">Acceder</a>
      </div>
    </div>
  </div>

  <script src="js/jquery-2.1.3.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>

</html>