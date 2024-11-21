insert into productos (nombre, precio)
values ('Telefono Movil', 450.50);

insert into clientes (nombre, direccion)
values ('María Garcia', 'Constitución 456, Luján');

ALTER TABLE empleados modify correo_electronico VARCHAR(50) GENERATED ALWAYS AS (concat(nombre, apellido, '@mail.com')) STORED;

insert into empleados (nombre, apellido, edad, salario, departamento_id)
values ("Luis", "Fernández", 28, 2800.00, 1);

SET SQL_SAFE_UPDATES = 0;
update productos set precio = 1350.00 where nombre = "Laptop";

-- Modifica la dirección del cliente "Juan Pérez" a "Alberti 1789, Mar del Plata" en la tabla "clientes".
update clientes set direccion = "Alberti 1789, Mar del Plata" where nombre = "Juan Pérez";

-- Incrementa el salario de todos los empleados en un 5% en la tabla "empleados".
update empleados set salario = salario * 1.05;

-- Inserta un nuevo producto en la tabla "productos" con el nombre "Tablet" y un precio de 350.00.
insert into productos (nombre, precio) values ("Tablet", 350.00);

-- Inserta un nuevo cliente en la tabla "clientes" con el nombre "Ana López" y la dirección "Beltrán 1452, Godoy Cruz".
INSERT INTO clientes (nombre, direccion) VALUES ("Ana López", "Beltrán 1452, Godoy Cruz");

-- Inserta un nuevo empleado en la tabla "empleados" con el nombre "Marta", apellido "Ramírez", edad 32, salario 3100.00 y que pertenezca al departamento “ventas”.
insert into  empleados (nombre, apellido, edad, salario, departamento_id)
VALUES ("Marta", "Ramírez", 32, 3100.00, 1);

-- Actualiza el precio del producto "Teléfono móvil" a 480.00 en la tabla "productos".
update productos set precio = 480.00 where nombre = "Teléfono móvil";

-- Modifica la dirección del cliente "María García" a "Avenida 789, Ciudad del Este" en la tabla "clientes".
update clientes set direccion = "Avenida 789, Ciudad del Este" where nombre = "María García";

-- Incrementa el salario de todos los empleados en el departamento de "Ventas" en un 7% en la tabla "empleados".
update empleados set salario = salario * 1.07 where departamento_id = 1;

-- Inserta un nuevo producto en la tabla "productos" con el nombre "Impresora" y un precio de 280.00.
insert into productos (nombre, precio) VALUES ("Impresora", 280.00);

INSERT INTO productos (nombre, precio) VALUES ("Impresora", 280.00);

INSERT INTO clientes (nombre, direccion) VALUES ("Carlos Sánchez", "Saavedra 206, Las Heras");

INSERT INTO empleados (nombre, apellido, edad, salario, departamento_id) VALUES ('Lorena', 'Guzmán', 26, 2600.00, 1);

INSERT INTO ventas (producto_id, cliente_id, cantidad, empleado_id) VALUES (1,1,2,1);

-- distinct

-- SELECT DISTINCT nombre FROM empleados;

-- SELECT DISTINCT correo_electronico FROM empleados;

-- SELECT DISTINCT edad FROM empleados;

-- Operadores relacionales

-- SELECT nombre FROM empleados WHERE salario > 3200.00;

-- SELECT nombre FROM empleados WHERE edad = 28;

-- SELECT nombre FROM empleados WHERE salario < 2700.00;

-- SELECT * FROM ventas WHERE cantidad > 2;

-- SELECT * FROM ventas WHERE precio_unitario = 480.00;

-- SELECT * FROM ventas WHERE monto_total < 1000.00;

-- SELECT * FROM ventas WHERE empleado_id = 2;

-- Operadores lógicos

-- SELECT nombre FROM empleados WHERE departamento_id = 1 AND salario > 3000.00;

-- SELECT nombre FROM empleados WHERE edad = 32 OR departamento_id = 3;

-- SELECT * FROM ventas WHERE producto_id = 1 AND cantidad >= 2;

-- SELECT * FROM ventas WHERE cliente_id = 1 OR empleado_id = 2;

-- SELECT * FROM ventas WHERE cliente_id = 2 AND cantidad > 2;

-- SELECT * FROM ventas WHERE empleado_id = 1 AND monto_total > 2000.00;