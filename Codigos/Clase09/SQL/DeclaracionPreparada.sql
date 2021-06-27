-- USAR BASE DE DATOS
USE autosEducacionIT;

-- INSERTAR ESPECIFICANDO LOS CAMPOS PREPARANDO LA 
PREPARE INSERTAR FROM "INSERT INTO autosEducacionIT.autoFamiliar 
(patenteNumero, patenteActiva, marca, categoria, color, puestos)
VALUES  (?, ?, ?, ?, ?, ?);";

-- SETEAMOS LAS VARIABLES 
SET @patenteNumero  = 'ABC-001';
SET @patenteActiva = 1;
SET @marca = 'Audi';
SET @categoria = 'SEDAN';
SET @Color = 'ROJO';
SET @puestos =  6;

-- EJECUTAR LA CONSULTA PREPARADA
EXECUTE INSERTAR USING @patenteNumero, @patenteActiva, @marca, @categoria, @Color, @puestos;

-- SETEAMOS LAS VARIABLES 
SET @patenteNumero  = 'ZXM-901';
SET @patenteActiva = 1;
SET @marca = 'Ford';
SET @categoria = 'COMPACTO';
SET @Color = 'NEGRO';
SET @puestos =  4;

-- EJECUTAR LA CONSULTA PREPARADA
EXECUTE INSERTAR USING @patenteNumero, @patenteActiva, @marca, @categoria, @Color, @puestos;


