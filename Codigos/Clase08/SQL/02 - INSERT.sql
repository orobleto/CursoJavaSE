-- USAR BASE DE DATOS
USE autosEducacionIT;

-- INSERTAR ESPECIFICANDO LOS CAMPOS
INSERT INTO autoFamiliar (patenteNumero, patenteActiva, marca, categoria, color, puestos)
VALUES  ('ABC-001', 1, 'Audi', 'SEDAN', 'MARRON', 6);

-- INSERTAR SIN ESPECIFICAR CAMPOS 
INSERT INTO autoFamiliar 
VALUES  ('ABC-002', 1, 'Ford', 'Compacto', 'NEGRO', 4);

-- INSERTAR VARIOS REGISTROS A LA VEZ
INSERT INTO autoFamiliar (patenteNumero, patenteActiva, marca, categoria, color, puestos)
VALUES  
('ABC-003', 1, 'TATA', 'SEDAN', 'AMARILLO', 6),
('ABC-004', 1, 'Mercedez', 'SEDAN', 'AZUL', 4),
('ABC-005', 1, 'Ferrari', 'SEDAN', 'ROJO', 2),
('ABC-006', 1, 'Fiat', 'SEDAN', 'VERDE', 4);
