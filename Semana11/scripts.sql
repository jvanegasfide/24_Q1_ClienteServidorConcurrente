CREATE DATABASE universidad;

CREATE TABLE estudiante (
id int not null,
mail varchar(255) NOT NULL,
telefono varchar(12) NULL,
fechaNacimiento date NULL ,
PRIMARY KEY (id)
);
INSERT INTO estudiante(id,mail,telefono)
VALUES(1,'prueba@fidelitas.org','2222222');

INSERT INTO estudiante (id,mail)
VALUES(2,'prueba2@fidelitas.org');

SELECT * FROM estudiante;

SELECT * FROM estudiante
WHERE id = 1;

