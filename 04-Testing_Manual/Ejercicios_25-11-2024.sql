-- Ejercicios 24/11
-- Une las tablas de empleados con departamentos y solo muestra las columnas nombre, apellido, edad,
-- salario de empleados y la columna nombre de departamentos.
select e.nombre, e.apellido, e.edad, e.id, d.id, d.nombre
FROM empleados AS e, departames AS d
where e.departamento_id = d.id;

-- Une las tablas ventas con la tabla empleados donde se muestren todas las columnas de ventas exceptuando
-- la columna empleado_id y en su lugar muestres el nombre y apellido de la tabla empleados.
SELECT e.nombre, e.apellido, v.cantidad, v.cliente_id, v.monto_total, v.precio_unitario, v.producto_id
FROM ventas AS v, empleados AS e
Where v.empleado_id = e.id;

-- Une las tablas ventas con la tabla productos donde se muestren todas las columnas de ventas exceptuando
-- la columna producto_id y en su lugar muestres la columna nombre de la tabla productos.
SELECT p.nombre, v.cantidad, v.cliente_id, v.monto_total, v.precio_unitario
FROM productos AS p, ventas AS v
WHERE v.empleado_id = p.id;

-- Une las tablas ventas con la tabla clientes donde se muestren todas las columnas de ventas exceptuando
-- la columna cliente_id y en su lugar muestres la columna nombre de la tabla clientes.
SELECT v.id, v.producto_id, c.nombre AS "Cliente", v.cantidad, v.precio_unitario, v.monto_total, v.empleado_id
FROM ventas AS v, clientes AS c
WHERE v.cliente_id = c.id;

-- Une las tablas ventas con la tablas empleados y departamentos donde se muestren todas las columnas de ventas exceptuando
-- la columna empleado_id y en su lugar muestres el nombre y apellido de la tabla empleados y además muestres la columna nombre de la tabla departamentos.
SELECT v.producto_id, v.cliente_id, v.precio_unitario, v.cantidad, v.monto_total, concat(e.nombre," ", e.apellido) AS "Nombre y Apellido", d.nombre
FROM ventas AS v, empleados AS e, departamentos AS d
WHERE v.empleado_id = e.id AND e.departamento_id = d.id;

-- Une las tablas ventas, empleados, productos y clientes donde se muestren las columnas de la tabla ventas
-- reemplazando sus columnas de FOREIGN KEYs con las respectivas columnas de “nombre” de las otras tablas.
select p.nombre, v.precio_unitario, v.cantidad, v.monto_total, c.nombre, e.nombre
FROM ventas AS v, empleados AS e, productos AS p, clientes as c
WHERE v.empleado_id = e.id and v.producto_id = p.id AND v.cliente = c.id;

-- Calcular el salario máximo de los empleados en cada departamento y mostrar el nombre del departamento
-- junto con el salario máximo.

-- Calcular el monto total de ventas por cada cliente y mostrar el nombre del cliente junto con el monto total de sus compras.
SELECT d.nombre "Departamento", SUM(v.monto_total)
FROM departamentos d, ventas v, empleados e
WHERE v.empleado_id = e.id AND e.departamento_id = d.id
GROUP BY d.nombre;

