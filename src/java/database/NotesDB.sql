DROP DATABASE if exists NotesDB;
CREATE DATABASE NotesDB;

USE NotesDB;


DROP TABLE User;

DROP TABLE Notes;

CREATE TABLE User
( 
    username VARCHAR(10) NOT NULL,
    password VARCHAR(10) NOT NULL,
    email VARCHAR(30) NOT NULL,
    active BIT NOT NULL,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    PRIMARY KEY (username)
);

INSERT INTO User values('admin', 'password', 'test@test.com', 1, 'Bob', 'Bobberson');

CREATE TABLE Notes
(
    NoteID NUMBER NOT NULL;
    DateCreated DATE NOT NULL;
    Contents VARCHAR(10000) NOT NULL
    PRIMARY KEY(NoteID)
);