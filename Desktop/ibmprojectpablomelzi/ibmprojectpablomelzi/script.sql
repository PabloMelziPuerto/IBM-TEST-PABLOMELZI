CREATE TABLE proveedores(
	id_proveedor BIGINT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(255),
	fecha_alta DATE,
	id_cliente INT
);

INSERT INTO proveedores(nombre, fecha_alta, id_cliente)VALUES
('Cocacola','2022-01-01',5),
('Pepsi','2022-02-01',5),
('RedBull','2022-03-01',6),
('Fanta','2022-04-01',7),
('Casera','2022-05-01',8),
('Trina','2022-06-01',6);