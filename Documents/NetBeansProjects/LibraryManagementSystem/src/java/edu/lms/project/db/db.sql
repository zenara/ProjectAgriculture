DROP DATABASE lms;
CREATE DATABASE lms;
USE lms;

CREATE TABLE Member(
    memberId VARCHAR(10) PRIMARY KEY,
    memberName VARCHAR(100),
    address VARCHAR(100),
    contact VARCHAR(100),
    nic VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100)
);



CREATE TABLE Category(
    catId VARCHAR(10) PRIMARY KEY,
    catName VARCHAR(50)
);

INSERT INTO Category VALUES("001","Novels");
INSERT INTO Category VALUES("002","Educational");
INSERT INTO Category VALUES("003","Horror");
INSERT INTO Category VALUES("004","Movies");
INSERT INTO Category VALUES("005","Computer");

CREATE TABLE Book(
    bookId VARCHAR(10) PRIMARY KEY,
    catId VARCHAR(10),
    bookName VARCHAR(100),
    author VARCHAR(100),
    page INT,
    price DECIMAL(10,2),
    location VARCHAR(100),
    description VARCHAR(300),
    CONSTRAINT FOREIGN KEY(catId) REFERENCES Category(catId)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE BookDetail(
    bookDetailId INT PRIMARY KEY AUTO_INCREMENT,
    bookId VARCHAR(10),
    memberId VARCHAR(10),
    issueDate DATE,
    issueTime VARCHAR(100),
    note VARCHAR(100),
    CONSTRAINT FOREIGN KEY(bookId) REFERENCES Book(bookId)     ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(memberId) REFERENCES Member(memberId)     ON  DELETE CASCADE ON  UPDATE CASCADE
);