DROP TABLE IF EXISTS persona;

CREATE TABLE persona (
  id_persona INT AUTO_INCREMENT  PRIMARY KEY,
  nombres VARCHAR(250) NOT NULL,
  apellido_paterno VARCHAR(250) NOT NULL,
  apellido_materno VARCHAR(250) NOT NULL
);

INSERT INTO persona (nombres, apellido_paterno, apellido_materno) VALUES ('Fabián Andrés', 'Acosta', 'Meca');
INSERT INTO persona (nombres, apellido_paterno, apellido_materno) VALUES ('Sebastián Gabriel', 'Acosta', 'Meca');
INSERT INTO persona (nombres, apellido_paterno, apellido_materno) VALUES ('Jorge Andrés', 'Acosta', 'Pingo');
INSERT INTO persona (nombres, apellido_paterno, apellido_materno) VALUES ('Rosa Elena', 'Meca', 'Gallardo');