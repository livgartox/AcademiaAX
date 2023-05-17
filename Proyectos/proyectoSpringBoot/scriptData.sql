INSERT INTO CATEGORIAS (id_categoria, descripcion, estado) VALUES 
(1, 'Categoria 1', true), 
(2, 'Categoria 2', true), 
(3, 'Categoria 3', false), 
(4, 'Categoria 4', true), 
(5, 'Categoria 5', false);


INSERT INTO PRODUCTOS (id_producto, nombre, id_categoria, codigo_barras, precio_venta, cantidad_stock, estado) VALUES 
(1, 'Producto 1', 1, '123456789', 10.00, 50, true), 
(2, 'Producto 2', 2, '987654321', 20.00, 25, false), 
(3, 'Producto 3', 3, '456789123', 5.00, 100, true), 
(4, 'Producto 4', 4, '789123456', 15.00, 75, false), 
(5, 'Producto 5', 5, '321654987', 12.50, 30, true);

INSERT INTO CLIENTES (id, nombre, apellidos, celular, direccion, correo_electronico) VALUES 
('1', 'Cliente 1', 'Apellido 1', 1234567890, 'Direccion 1', 'cliente1@ejemplo.com'), 
('2', 'Cliente 2', 'Apellido 2', 0987654321, 'Direccion 2', 'cliente2@ejemplo.com'), 
('3', 'Cliente 3', 'Apellido 3', 4567891230, 'Direccion 3', 'cliente3@ejemplo.com'), 
('4', 'Cliente 4', 'Apellido 4', 7891234560, 'Direccion 4', 'cliente4@ejemplo.com'), 
('5', 'Cliente 5', 'Apellido 5', 3216549870, 'Direccion 5', 'cliente5@ejemplo.com');

INSERT INTO COMPRAS (id_compra, id_cliente, fecha, medio_pago, comentario, estado) VALUES 
(1, '1', '2022-03-14 12:00:00', 'T', 'Comentario 1', 'A'), 
(2, '2', '2022-03-14 13:00:00', 'E', 'Comentario 2', 'A'), 
(3, '3', '2022-03-14 14:00:00', 'T', 'Comentario 3', 'I'), 
(4, '4', '2022-03-14 15:00:00', 'E', 'Comentario 4', 'A'), 
(5, '5', '2022-03-14 16:00:00', 'T', 'Comentario 5', 'I');


INSERT INTO COMPRAS_PRODUCTOS (id_compra, id_producto, cantidad, total, estado) VALUES 
(1, 1, 2, 20.00, true), 
(1, 2, 1, 20.00, true), 
(2, 3, 5, 25.00,true);

