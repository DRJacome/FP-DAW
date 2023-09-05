<?php session_start(); ?>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Recuperación de datos</title>
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/index.css" rel="stylesheet">
</head>

<body>
  <br>
  <div class="container">
    <div class="panel panel-default">
      <h2 class="tituloH2">Ejercicios de recuperación de datos de BD</h2>
      <div class="panel-heading">
        <h4>
          <span class="glyphicon glyphicon-pencil info" aria-hidden="true"></span>
          Ejercicio 1
        </h4>
      </div>
      <div class="panel-body">
        Crea una aplicación web que permita hacer listado, alta, baja y modificación
        sobre la tabla cliente de la base de datos banco.
        <ul>
          <li>Para realizar el listado bastará un SELECT, tal y como se ha visto en los ejemplos.</li>
          <li>El alta se realizará mediante un formulario donde se especificarán todos los campos
            del nuevo registro. Luego esos datos se enviarán a una página que ejecutará INSERT.
          </li>
          <li>Para realizar una baja, el usuario hará clic en el botón <b>Eliminar</b>
            que está situado en la fila del cliente que quiere borrar. Se deberá
            enviar el DNI del cliente y ejecutar DELETE para borrar el registro
            cuyo DNI coincida con el introducido.
          </li>
          <li>La modificación se realiza mediante UPDATE. El usuario hará clic
            en el botón <b>Modificar</b> que está situado en la fila del cliente
            del que quiere cambiar alguna información.
          </li>
        </ul>
      </div>
      <div class="panel-footer">
        <a class="btn btn-default" href="pagina.php?ejercicio=4_3_1/01" role="button">Acceder</a>
      </div>
    </div>

    <div class="panel panel-default">
      <div class="panel-heading">
        <h4>
          <span class="glyphicon glyphicon-pencil info" aria-hidden="true"></span>
          Ejercicio 2
        </h4>
      </div>
      <div class="panel-body">
        Modifica el programa anterior añadiendo las siguientes mejoras:
        <ul>
          <li>
            El listado debe aparecer paginado en caso de que haya muchos clientes.
          </li>
          <li>
            Al hacer un alta, se debe comprobar que no exista ningún cliente
            con el DNI introducido en el formulario.
          </li>
          <li>
            La opción de borrado debe pedir confirmación.
          </li>
          <li>
            Cuando se realice la modificación de los datos de un cliente, los
            campos que no se han cambiado deberán permanecer inalterados en la
            base de datos.
          </li>
        </ul>
      </div>
      <div class="panel-footer">
        <a class="btn btn-default" href="pagina.php?ejercicio=4_3_2/02" role="button">Acceder</a>
      </div>
    </div>

    <div class="panel panel-default">
      <div class="panel-heading">
        <h4>
          <span class="glyphicon glyphicon-pencil info" aria-hidden="true"></span>
          Ejercicio 3
        </h4>
      </div>
      <div class="panel-body">
        Modifica la tienda virtual realizada anteriormente de tal forma que
        todos los datos de los artículos se guarden en una base de datos.
      </div>
      <div class="panel-footer">
        <a class="btn btn-default" href="pagina.php?ejercicio=4_3_3/03" role="button">Acceder</a>
      </div>
    </div>
  </div>
  <script src="js/jquery-2.1.3.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>

</html>