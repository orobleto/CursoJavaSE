-- USAR BASE DE DATOS
USE autosEducacionIT;

-- ACTUALIZAR TODOS LOS REGISTROS, NO RECOMENDADO SIEMPRE SE DEBE ESPECIFICAR QUE REGISTROS ACTUALIZAR
UPDATE autoFamiliar SET patenteActiva = 0;

-- ACTUALIZAR LOS REGISTROS QUE SE ESPECIFICAN
UPDATE autoFamiliar SET patenteActiva = 1
WHERE patenteActiva = 0;

-- ACTUALIZAR VARIOS CAMPOS  
UPDATE autoFamiliar SET patenteActiva = 0, puestos = 4
WHERE patenteActiva = 1;