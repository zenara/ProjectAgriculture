CREATE TABLE ADMIN(
    nic VARCHAR(20) PRIMARY KEY,
    username VARCHAR(20),
    password VARCHAR(50)
);

INSERT INTO ADMIN VALUES("98737397923","admin","admin");


CREATE TABLE ADAZONE(
    adaid INT PRIMARY KEY AUTO_INCREMENT,
    adaname VARCHAR(50)
);

CREATE TABLE DISTRICT(
    districtid INT PRIMARY KEY AUTO_INCREMENT,
    adaid INT,
    districtname VARCHAR(50),
    CONSTRAINT FOREIGN KEY(adaid) REFERENCES ADAZONE(adaid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE DS(
    dsid INT PRIMARY KEY AUTO_INCREMENT,
    districtid INT,
    dsname VARCHAR(50),
    CONSTRAINT FOREIGN KEY(districtid) REFERENCES DISTRICT(districtid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE ASCENTER(
    ascid INT PRIMARY KEY AUTO_INCREMENT,
    dsid INT,
    ascname VARCHAR(50),
    CONSTRAINT FOREIGN KEY(dsid) REFERENCES DS(dsid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE AILIST(
    aiid INT AUTO_INCREMENT UNIQUE AUTO_INCREMENT,
    adaid INT,
    districtid INT,
    dsid INT,
    ascid INT,
    airange VARCHAR(50),
    ainame VARCHAR(100),
    nic VARCHAR(20) PRIMARY KEY,
    telephoneno VARCHAR(20),
    email VARCHAR(50),
    CONSTRAINT FOREIGN KEY(adaid) REFERENCES ADAZONE(adaid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(districtid) REFERENCES DISTRICT(districtid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(dsid) REFERENCES DS(dsid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(ascid) REFERENCES ASCENTER(ascid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE AGEGROUP(
    agegroupid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    agegroupname VARCHAR(50)
);

CREATE TABLE VARIETY(
    varietyid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    varietyname VARCHAR(50),
    agegroupid INT,
    CONSTRAINT FOREIGN KEY(agegroupid) REFERENCES AGEGROUP(agegroupid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE YEARS(
    yearid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    yearref VARCHAR(20)
);

CREATE TABLE SEASONS(
    seasonid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    seasonname VARCHAR(20)
);

CREATE TABLE MONTHS(
    monthid INT PRIMARY KEY AUTO_INCREMENT,
    monthname VARCHAR(20),
    seasonid INT,
    CONSTRAINT FOREIGN KEY(seasonid) REFERENCES SEASONS(seasonid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE MAJORPADDY(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    yearid INT,
    monthid INT,
    varietyid INT,
    monthlyprogress FLOAT,
    CONSTRAINT FOREIGN KEY(yearid) REFERENCES YEARS(yearid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(monthid) REFERENCES MONTHS(monthid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(varietyid) REFERENCES VARIETY(varietyid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE MINORPADDY(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    yearid INT,
    monthid INT,
    varietyid INT,
    monthlyprogress FLOAT,
    CONSTRAINT FOREIGN KEY(yearid) REFERENCES YEARS(yearid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(monthid) REFERENCES MONTHS(monthid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(varietyid) REFERENCES VARIETY(varietyid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

CREATE TABLE RAINFEDPADDY(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    yearid INT,
    monthid INT,
    varietyid INT,
    monthlyprogress FLOAT,
    CONSTRAINT FOREIGN KEY(yearid) REFERENCES YEARS(yearid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(monthid) REFERENCES MONTHS(monthid)
    ON  DELETE CASCADE ON  UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY(varietyid) REFERENCES VARIETY(varietyid)
    ON  DELETE CASCADE ON  UPDATE CASCADE
);

insert into years(yearref) values("1992/1993");
insert into years(yearref) values("1993/1994");
insert into years(yearref) values("1994/1995");
insert into years(yearref) values("1995/1996");
insert into years(yearref) values("1996/1997");
insert into years(yearref) values("1997/1998");

insert into seasons(seasonname) values("Yala");
insert into seasons(seasonname) values("Maha");

insert into months(monthname,seasonid) values("January",2);
insert into months(monthname,seasonid) values("February",2);
insert into months(monthname,seasonid) values("March",1);
insert into months(monthname,seasonid) values("April",1);
insert into months(monthname,seasonid) values("May",1);
insert into months(monthname,seasonid) values("June",1);
insert into months(monthname,seasonid) values("July",1);
insert into months(monthname,seasonid) values("August",1);
insert into months(monthname,seasonid) values("September",2);
insert into months(monthname,seasonid) values("October",2);
insert into months(monthname,seasonid) values("November",2);
insert into months(monthname,seasonid) values("December",2);