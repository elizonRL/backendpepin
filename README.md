# segurosBackend
Este Proyectp utiliza sping boot para ser ejecutado, Desarrollado en java ☕
utiliza mySQL para persistencia de datos con las siginetes tablas:
`cleinte`, `poliza`, `vehiculo`, la consulta se realiza por medio del sigiente pocedimento al mecenado\
[SQL]
```
delimiter $$
CREATE PROCEDURE obtener_poliza_por_numero(IN num_poliza VARCHAR(255))\
BEGIN
  SELECT
    pc.*,
    v.marca,
    v.modelo,
    v.placa
  FROM (
    SELECT *
    FROM poliza
    WHERE num_poliza = num_poliza
  ) pc
  JOIN poliza_vehiculo pv ON pc.id = pv.poliza_id
  JOIN vehiculo v ON pv.vehiculo_id = v.id;
END$$
...
````
el nombre de la base de datos es `mydb`
el puerto que utiliza es el 8081 
`la url:http://localhost:8081/poliza?num_poliza=123456`
Este es un ejempo de una consulta que se puede realizarla copnsulta, tambien se debe pasar el parametro `num_poliza`

## tablas de la base de datos 
```
CREATE TABLE cliente (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  apellido VARCHAR(100) NOT NULL,
  cedula VARCHAR(10) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE poliza (
  id INT NOT NULL AUTO_INCREMENT,
  cliente_id INT NOT NULL,
  fecha_inicio DATE NOT NULL,
  fecha_fin DATE NOT NULL,
  tipo_poliza VARCHAR(100) NOT NULL,
  prima DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (cliente_id) REFERENCES cliente (id)
);

CREATE TABLE vehiculo (
  id INT NOT NULL AUTO_INCREMENT,
  poliza_id INT NOT NULL,
  marca VARCHAR(100) NOT NULL,
  modelo VARCHAR(100) NOT NULL,
  placa VARCHAR(10) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (poliza_id) REFERENCES poliza (id)
);
````
