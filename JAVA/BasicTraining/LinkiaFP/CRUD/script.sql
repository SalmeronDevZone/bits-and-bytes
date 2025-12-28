CREATE DATABASE colegio;
USE colegio;

CREATE TABLE Curso (
    id_clase INT AUTO_INCREMENT PRIMARY KEY,
    curso VARCHAR(100) NOT NULL
);

CREATE TABLE Alumno (
    id_alumno INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT NOT NULL,
    id_clase INT,
    telefono VARCHAR(15),
    FOREIGN KEY (id_clase) REFERENCES Curso(id_clase)
);
