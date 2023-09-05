<?php
   $username = 'root';
   $password = '';
   $db = new PDO('mysql:host=localhost;dbname=uazon', $username, $password);
   $result = $db->query('SELECT titulo, precio FROM libros');
   $libros = array();
   while ($libro = $result->fetch())
      $libros[] = $libro;
?>