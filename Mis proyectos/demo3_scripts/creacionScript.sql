CREATE database proyectoSecreto1;

USE proyectoSecreto1;

CREATE table info_user(
	user_id int auto_increment primary key,
    user_name varchar(50) not null,
    user_last_name varchar(50) not null,
    birthday date not null,
    email varchar(70) not null,
    password_user varchar(30) not null
);


INSERT INTO info_user(user_name,user_last_name,birthday,email,password_user)
VALUES ("Olivia","García","1998-04-19","olitoxqui@gmail.com","Olivia");

SELECT * FROM info_user;

CREATE TABLE productos(
id_producto int auto_increment primary key,
nombre_producto VARCHAR(50) NOT NULL ,
descripcion VARCHAR(50) NOT NULL,
cantidad_stock INT NOT NULL,
precio float NOT NULL
);

INSERT INTO productos(nombre_producto,descripcion,cantidad_stock,precio)
VALUES('producto1','descripción producto 1',3,30);

SELECT * FROM productos;

#ALTER TABLE productos
#add column id_artista int NOT NULL;

UPDATE proyectosecreto1.productos
SET id_artista=1
WHERE id_producto=1;


