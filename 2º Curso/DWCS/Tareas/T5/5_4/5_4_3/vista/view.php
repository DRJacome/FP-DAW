<html>

<head>
    <title>T5.4.3</title>
</head>

<body>
    <h1>Base de datos de usuarios registrados</h1>
    <table border="1">
        <tr>
            <th>DNI</th>
            <th>Nombre de usuario</th>
            <th>Contraseña</th>
        </tr>
        <?php foreach ($usuarios as $usuario) : ?>
            <tr>
                <td><?php echo $usuario['dni'] ?></td>
                <td><?php echo $usuario['nombre']?></td>
                <td><?php echo $usuario['contrasena']?></td>
            </tr>
        <?php endforeach; ?>
    </table>
</body>

</html>