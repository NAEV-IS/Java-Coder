CREATE DATABASE coderhouse;
USE coderhouse;

CREATE SCHEMA workshop;
USE workshop;

CREATE TABLE clientes (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(75) NOT NULL,
  apellido VARCHAR(75) NOT NULL,
  dni VARCHAR(11) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE facturacion (
  id INT NOT NULL AUTO_INCREMENT,
  cliente_id INT NOT NULL,
  fecha_creacion DATETIME NOT NULL,
  total DOUBLE NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (cliente_id) REFERENCES clientes (id)
);

CREATE TABLE facturacion_detalles (
  id INT NOT NULL AUTO_INCREMENT,
  facturacion_id INT NOT NULL,
  producto_id INT NOT NULL,
  cantidad INT NOT NULL,
  precio DOUBLE NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (facturacion_id) REFERENCES facturacion (id),
  FOREIGN KEY (producto_id) REFERENCES productos (id)
);

CREATE TABLE productos (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(150) NOT NULL,
  codigo VARCHAR(50) NOT NULL,
  stock INT NOT NULL,
  precio DOUBLE NOT NULL,
  PRIMARY KEY (id)
);
