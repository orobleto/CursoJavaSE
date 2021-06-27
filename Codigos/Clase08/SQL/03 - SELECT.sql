-- USAR BASE DE DATOS
USE autosEducacionIT;

-- SELECCIONAR TODOS LOS REGISTROS CON EL COMODIN ASTERISCO (*) NO RECOMENDADO COLOCAR EN LOS SISTEMAS
SELECT * FROM autoFamiliar;

-- SELECCIONAR ESPECIFICANDO LOS CAMPOS OPCION RECOMENDADA 
SELECT patenteNumero, patenteActiva, marca, categoria, color, puestos FROM autoFamiliar;

-- SELECCIONAR FILTRANDO 
SELECT * FROM autoFamiliar
WHERE patenteActiva = 1;

-- SELECCIONAR FILTRANDO 
SELECT patenteNumero, patenteActiva, marca, categoria, color, puestos FROM autoFamiliar
WHERE puestos > 2 AND categoria = 'SEDAN';
