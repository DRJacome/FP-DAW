-- Ejemplo de transacción:
-- Traspaso de dinero entre dos cuentas corrientes de un banco;
-- Cliente A con 5000 € transfiere 1000 € a cliente B que tiene 2000 €.

-- Comprobación inicial de datos.
select * from clientes
where numCuenta in ('clienteA', 'clienteB');

-- Empieza la transacción
BEGIN TRAN
    update clientes
    set saldo - = 1000
    where numCuenta = 'clienteA';

    update clientes
    set saldo + = 1000
    where numCuenta = 'clienteB';

    select *
    from clientes
    where numCuenta in ('clienteA', 'clienteB');    

-- Si todos los pasos tuvieron éxito,
    if (@@ERROR = 0) 
    -- se hacen los cambios persistentes en la base de datos;
BEGIN
    COMMIT
    -- Fin transacción exitosa.
END
-- Si no,
    else 
    -- Se desacen los cambios relalizados;
BEGIN
    ROLLBACK
    -- Transacción cancelada.
END

-- Comprobación final de datos.
select * from clientes
where numCuenta in ('clienteA', 'clienteB');