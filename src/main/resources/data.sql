USE encuestabd;

-- ENCUESTA

INSERT INTO tab_encuesta(nombres,apellidos,edad,profesion,lugartrabajo,eleccion) VALUES ('Mariano','Linares',18,'ARQUITECTO DE SOFTWARE','LIMA','JAVA');
INSERT INTO tab_encuesta(nombres,apellidos,edad,profesion,lugartrabajo,eleccion) VALUES ('Lucia','Arista',20,'DESARROLLADORA','HUARAZ','C#');
INSERT INTO tab_encuesta(nombres,apellidos,edad,profesion,lugartrabajo,eleccion) VALUES ('Ana','Bermudez',30,'INGENIERA','CUZCO','JAVA');
INSERT INTO tab_encuesta(nombres,apellidos,edad,profesion,lugartrabajo,eleccion) VALUES ('Carla','Cisneros',24,'INGENIERA','LIMA','C#');
INSERT INTO tab_encuesta(nombres,apellidos,edad,profesion,lugartrabajo,eleccion) VALUES ('Dante','Figueroa',29,'DESARROLLADOR','LIMA','JAVA');

-- USUARIO

INSERT INTO tab_usuario(usuario,password,rol) VALUES ('admin','admin','ADMIN');
INSERT INTO tab_usuario(usuario,password,rol) VALUES ('rponce','123456','USER');

COMMIT;


   