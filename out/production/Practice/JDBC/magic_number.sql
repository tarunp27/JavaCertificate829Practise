DELIMITER $$
CREATE PROCEDURE magic_number(OUT rand INT ) 
BEGIN 
SELECT rand()*10000 INTO rand;
END$$
DELIMITER ;