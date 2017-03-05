CREATE TABLE CANDIDATE
(
id NUMBER(19,0) NOT NULL,
first_name varchar(255),
last_name varchar(255),
father_name varchar(255),
permanent_address varchar(255),
PRIMARY KEY (id)
);

ALTER TABLE candidate ADD city varchar2(32);
ALTER TABLE candidate ADD DOB varchar2(32);
CREATE SEQUENCE seq_candidate
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;