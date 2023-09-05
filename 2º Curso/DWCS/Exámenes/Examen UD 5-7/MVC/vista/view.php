<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Capa Vista</title>
</head>
<body>
    <h1>Base de datos de productos en Tienda de Fotografía</h1>
    <table border="1">
        <tr>
            <th>Id de producto</th>
            <th>Producto</th>
            <th>Precio de producto</th>
            <th>Stock</th>
        </tr>
        <?php foreach ($usuarios as $usuario) : ?>
            <tr>
                <td><?php echo $usuario['idProducto'] ?></td>
                <td><?php echo $usuario['producto'] ?></td>
                <td><?php echo $usuario['precioProducto'] ?></td>
                <td><?php echo $usuario['stockUDs'] ?></td>
            </tr>
        <?php endforeach; ?>
    </table>
</body>
</html>