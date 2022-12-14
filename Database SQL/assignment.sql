-- Generated by Oracle SQL Developer Data Modeler 4.1.3.901
--   at:        2018-06-15 11:27:45 BST
--   site:      Oracle Database 11g
--   type:      Oracle Database 11g




CREATE TABLE branch
  (
    branch_id                  INTEGER  ,
    branch_name                VARCHAR2 (255 CHAR) ,
    branch_address             VARCHAR2 (255 CHAR) ,
    branch_postcode            VARCHAR2 (6 CHAR) ,
    allocated_manager_id       INTEGER ,
    switchboard_fk             INTEGER ,
    switchboard_switchboard_id INTEGER 
  ) ;
ALTER TABLE branch ADD CONSTRAINT branch_PK PRIMARY KEY ( branch_id ) ;

INSERT INTO branch VALUES(1, 'Erdington', '123 Rainbow Road', 'MU54RM', 1, 1, 1);
INSERT INTO branch VALUES(2, 'Smethwick', '21 Prince Road', 'UH66JG', 2, 1, 1);
INSERT INTO branch VALUES(3, 'Solihull ', '46 Kings Street', 'HG78GF', 3, 1, 1);
INSERT INTO branch VALUES(4, 'Sparkhill', '2 Fancy Road', 'JF76HF', 4, 1, 1);

CREATE TABLE customer
  (
    Customer_id INTEGER ,
    Name        VARCHAR2 (50 CHAR) ,
    DOB         DATE ,
    Address     VARCHAR2 (100 CHAR) ,
    Phone       VARCHAR2 (11 CHAR)
  ) ;
ALTER TABLE customer ADD CONSTRAINT customer_PK PRIMARY KEY ( Customer_id ) ;

INSERT INTO customer VALUES(NULL, 'John', TO_DATE('1979/06/05', 'YYYY/MM/DD'), '67 Prince Road', '07746283746');
INSERT INTO customer VALUES(NULL, 'Phill', TO_DATE('1954/05/04', 'YYYY/MM/DD'), '34 Prince Road', '03746571836');
INSERT INTO customer VALUES(NULL, 'Steve', TO_DATE('1999/04/03', 'YYYY/MM/DD'), '54 Random Road', '07736472634');
INSERT INTO customer VALUES(NULL, 'Bill', TO_DATE('1988/03/02', 'YYYY/MM/DD'), '25 Prince Road', '07763746582');
INSERT INTO customer VALUES(NULL, 'Adam', TO_DATE('1979/02/01', 'YYYY/MM/DD'), '25 Random Road', '07763728164');


CREATE TABLE delivery
  (
    driver_id                 INTEGER  ,
    employee_id_fk            INTEGER ,
    license_plate             VARCHAR2 (8 CHAR) ,
    date_license_obtained     DATE ,
    expiry                    DATE ,
    renewal_date_of_insurance DATE
  ) ;
ALTER TABLE delivery ADD CONSTRAINT delivery_PK PRIMARY KEY ( driver_id ) ;

INSERT INTO delivery VALUES(1, 1, 'BL76DFH', TO_DATE('2017/03/04', 'YYYY/MM/DD'), TO_DATE('2018/07/14', 'YYYY/MM/DD'), TO_DATE('2018/08/16', 'YYYY/MM/DD'));
INSERT INTO delivery VALUES(2, 2, 'CL76JGF', TO_DATE('2016/01/06', 'YYYY/MM/DD'), TO_DATE('2019/03/07', 'YYYY/MM/DD'), TO_DATE('2018/08/15', 'YYYY/MM/DD'));
INSERT INTO delivery VALUES(3, 3, 'FL76ERY', TO_DATE('2015/07/04', 'YYYY/MM/DD'), TO_DATE('2018/05/09', 'YYYY/MM/DD'), TO_DATE('2018/08/14', 'YYYY/MM/DD'));
INSERT INTO delivery VALUES(4, 4, 'GL76JRT', TO_DATE('2013/05/09', 'YYYY/MM/DD'), TO_DATE('2019/06/05', 'YYYY/MM/DD'), TO_DATE('2018/08/13', 'YYYY/MM/DD'));
INSERT INTO delivery VALUES(5, 5, 'QL76HFD', TO_DATE('2016/02/02', 'YYYY/MM/DD'), TO_DATE('2018/07/21', 'YYYY/MM/DD'), TO_DATE('2018/08/12', 'YYYY/MM/DD'));

CREATE TABLE employee
  (
    Employee_id        INTEGER  ,
    Name               VARCHAR2 (50 CHAR) ,
    DOB                DATE ,
    Address            VARCHAR2 (100 CHAR) ,
    Email              VARCHAR2 (255 CHAR) ,
    Employ_date        DATE ,
    job_job_id         INTEGER  ,
    salary_salary_id   INTEGER  ,
    manager_id_fk      INTEGER ,
    manager_manager_id INTEGER  ,
    delivery_driver_id INTEGER  ,
    manager_branch_id  INTEGER  ,
    manager_id         INTEGER 
  ) ;
CREATE UNIQUE INDEX employee__IDX ON employee
  (
    delivery_driver_id ASC
  )
  ;
ALTER TABLE employee ADD CONSTRAINT employee_PK PRIMARY KEY ( salary_salary_id, job_job_id, manager_manager_id, manager_branch_id ) ;

INSERT INTO employee VALUES(1, 'Jason', TO_DATE('1954/06/14', 'YYYY/MM/DD'), '76 James Street', 'Jason123@hotmail.com', TO_DATE('2017/05/14', 'YYYY/MM/DD'), 1, 1, 1, 1, 1, 1, 1);
INSERT INTO employee VALUES(2, 'Karen ', TO_DATE('1954/06/13', 'YYYY/MM/DD'), '23 James Street', 'Karen@hotmail.com', TO_DATE('2017/05/13', 'YYYY/MM/DD'), 2, 2, 2, 2, 2, 2, 2);
INSERT INTO employee VALUES(3, 'Bob', TO_DATE('1954/06/12', 'YYYY/MM/DD'), '43 James Street', 'Bob@hotmail.com', TO_DATE('2017/05/12', 'YYYY/MM/DD'), 3, 3, 3, 3, 3, 3, 3);
INSERT INTO employee VALUES(4, 'Clide', TO_DATE('1954/06/11', 'YYYY/MM/DD'), '54 James Street', 'Clide@hotmail.com', TO_DATE('2017/05/11', 'YYYY/MM/DD'), 4, 4, 4, 4, 4, 4, 4);
INSERT INTO employee VALUES(5, 'Devon', TO_DATE('1954/06/10', 'YYYY/MM/DD'), '23 James Street', 'Devon@hotmail.com', TO_DATE('2017/05/10', 'YYYY/MM/DD'), 5, 5, 5, 5, 5, 5, 5);

CREATE TABLE equipment
  (
    itemID            VARCHAR2 (255 CHAR) ,
    service_SID       VARCHAR2 (255 CHAR) ,
    date_last_service DATE ,
    equipment_ID      NUMBER  ,
    type_branch_id    INTEGER 
  ) ;
ALTER TABLE equipment ADD CONSTRAINT equipment_PK PRIMARY KEY ( equipment_ID ) ;

INSERT INTO equipment VALUES(1, 1, TO_DATE('2018/06/08', 'YYYY/MM/DD'), 1, 1);
INSERT INTO equipment VALUES(2, 2, TO_DATE('2018/06/07', 'YYYY/MM/DD'), 2, 2);
INSERT INTO equipment VALUES(3, 3, TO_DATE('2018/06/06', 'YYYY/MM/DD'), 3, 3);
INSERT INTO equipment VALUES(4, 4, TO_DATE('2018/06/05', 'YYYY/MM/DD'), 4, 4);
INSERT INTO equipment VALUES(5, 5, TO_DATE('2018/06/04', 'YYYY/MM/DD'), 5, 5);

CREATE TABLE equipment_type
  (
    equip_id         VARCHAR2 (255 CHAR) ,
    name             VARCHAR2 (255 CHAR) ,
    description      VARCHAR2 (255 CHAR) ,
    hire_rate_daily  NUMBER ,
    branch_branch_id INTEGER 
  ) ;
ALTER TABLE equipment_type ADD CONSTRAINT equipment_type_PK PRIMARY KEY ( branch_branch_id ) ;

INSERT INTO equipment_type VALUES(1, 'Hammer', 'Hit things', 10, 1);
INSERT INTO equipment_type VALUES(2, 'Saw', 'Saw things', 10, 2);
INSERT INTO equipment_type VALUES(3, 'Drill', 'Drill things', 10, 3);
INSERT INTO equipment_type VALUES(4, 'Screwdriver', 'Screw Screws', 10, 4);
INSERT INTO equipment_type VALUES(5, 'Spanner', 'Turn things', 10, 5);

CREATE TABLE hire_transaction
  (
    trans_id             INTEGER ,
    employee_fk          INTEGER ,
    customer_fk          INTEGER ,
    date_hired           DATE ,
    overall_price        NUMBER ,
    employee_salary_id   INTEGER  ,
    employee_job_id      INTEGER  ,
    employee_manager_id  INTEGER  ,
    employee_branch_id   INTEGER  ,
    customer_Customer_id INTEGER  ,
    employee_job_job_id  INTEGER  
  ) ;
ALTER TABLE hire_transaction ADD CONSTRAINT hire_transaction_PK PRIMARY KEY ( trans_id, customer_Customer_id, employee_job_id ) ;

INSERT INTO hire_transaction VALUES(1, 2, 1, TO_DATE('2018/06/08', 'YYYY/MM/DD'), 30, 1,1,1,1,1,1);
INSERT INTO hire_transaction VALUES(2, 4, 2, TO_DATE('2018/06/07', 'YYYY/MM/DD'), 30, 2,2,2,2,2,2);
INSERT INTO hire_transaction VALUES(3, 5, 3, TO_DATE('2018/06/06', 'YYYY/MM/DD'), 30, 3,3,3,3,3,3);
INSERT INTO hire_transaction VALUES(4, 3, 4, TO_DATE('2018/06/05', 'YYYY/MM/DD'), 30, 4,4,4,4,4,4);
INSERT INTO hire_transaction VALUES(5, 1, 5, TO_DATE('2018/06/04', 'YYYY/MM/DD'), 30, 5,5,5,5,5,5);

CREATE TABLE job
  (
    job_id          INTEGER  ,
    job_number      INTEGER  ,
    job_title       VARCHAR2 (255 CHAR)  ,
    job_description VARCHAR2 (255 BYTE)
  ) ;
ALTER TABLE job ADD CONSTRAINT job_PK PRIMARY KEY ( job_id ) ;

INSERT INTO job VALUES(1,1,'Casheer', 'Handles Money');
INSERT INTO job VALUES(2,2,'Stacker', 'Stack Items');
INSERT INTO job VALUES(3,3,'Casheer', 'Handles Money');
INSERT INTO job VALUES(4,4,'Stacker', 'Stack Items');
INSERT INTO job VALUES(5,5,'Stock Control', 'Count Stock');

CREATE TABLE LINK
  (
    link_id                      VARCHAR2 (255 CHAR) ,
    date_hired                   DATE ,
    datetoreturne                DATE ,
    date_returned                DATE ,
    priceofhire                  NUMBER ,
    hiretran_fk                  VARCHAR2 (255 CHAR) ,
    equipment_fk                 VARCHAR2 (255 CHAR) ,
    hire_transaction_trans_id    INTEGER  ,
    hire_salary_id               INTEGER  ,
    hire_transaction_job_id      INTEGER  ,
    hire_manager_id              INTEGER  ,
    hire_branch_id               INTEGER  ,
    hire_transaction_Customer_id INTEGER  ,
    equipment_equipment_ID       NUMBER  ,
    manager_id                   INTEGER 
  ) ;
ALTER TABLE LINK ADD CONSTRAINT link_PK PRIMARY KEY ( hire_transaction_trans_id, hire_transaction_job_id, hire_transaction_Customer_id, manager_id ) ;

INSERT INTO LINK VALUES('1', TO_DATE('2018/06/14', 'YYYY/MM/DD'), TO_DATE('2018/07/14', 'YYYY/MM/DD'), NULL, 15, '1', '1', 1, 1, 1, 1, 1, 1, 1,1);
INSERT INTO LINK VALUES('2', TO_DATE('2018/06/13', 'YYYY/MM/DD'), TO_DATE('2018/07/13', 'YYYY/MM/DD'), NULL, 15, '2', '2', 2, 2, 2, 2, 2, 2, 2,2);
INSERT INTO LINK VALUES('3', TO_DATE('2018/06/12', 'YYYY/MM/DD'), TO_DATE('2018/07/12', 'YYYY/MM/DD'), NULL, 15, '3', '2', 3, 3, 3, 3, 3, 3, 3,3);
INSERT INTO LINK VALUES('4', TO_DATE('2018/06/11', 'YYYY/MM/DD'), TO_DATE('2018/07/11', 'YYYY/MM/DD'), NULL, 15, '4', '2', 4, 4, 4, 4, 4, 4, 4,4);
INSERT INTO LINK VALUES('5', TO_DATE('2018/06/10', 'YYYY/MM/DD'), TO_DATE('2018/07/10', 'YYYY/MM/DD'), NULL, 15, '5', '2', 5, 5, 5, 5, 5, 5, 5,5);

CREATE TABLE manager
  (
    manager_id       INTEGER  ,
    manager_name     VARCHAR2 (255 CHAR) ,
    branch_branch_id INTEGER  
  ) ;
ALTER TABLE manager ADD CONSTRAINT manager_PK PRIMARY KEY ( branch_branch_id, manager_id1 ) ;

INSERT INTO manager VALUES(1, 'James', 1);
INSERT INTO manager VALUES(2, 'Philip', 2);
INSERT INTO manager VALUES(3, 'Steven', 3);
INSERT INTO manager VALUES(4, 'Josh', 4);

CREATE TABLE salary
  (
    salary_id           INTEGER  ,
    salary_amount       NUMBER 
  ) ;
ALTER TABLE salary ADD CONSTRAINT salary_PK PRIMARY KEY ( salary_id ) ;

INSERT INTO salary VALUES(1, 10000);
INSERT INTO salary VALUES(2, 13000);
INSERT INTO salary VALUES(3, 19000);
INSERT INTO salary VALUES(4, 14000);
INSERT INTO salary VALUES(6, 18000);

CREATE TABLE switchboard
  (
    switchboard_id INTEGER  ,
    phone_number_1 INTEGER ,
    phone_number_2 INTEGER ,
    phone_number_3 INTEGER
  ) ;
ALTER TABLE switchboard ADD CONSTRAINT switchboard_PK PRIMARY KEY ( switchboard_id ) ;

INSERT INTO switchboard VALUES(1, 04562456345, 02453536753, 02485748573);
INSERT INTO switchboard VALUES(2, 03748573625, 05748572635, 04958673625);
INSERT INTO switchboard VALUES(3, 01827465726, 01746583746, 01738574637);
INSERT INTO switchboard VALUES(4, 01847561627, 01827361518, 01928371536);
INSERT INTO switchboard VALUES(5, 01728461525, 01927364515, 03947857364);

ALTER TABLE branch ADD CONSTRAINT branch_switchboard_FK FOREIGN KEY ( switchboard_switchboard_id ) REFERENCES switchboard ( switchboard_id ) ;

ALTER TABLE employee ADD CONSTRAINT employee_delivery_FK FOREIGN KEY ( delivery_driver_id ) REFERENCES delivery ( driver_id ) ;

ALTER TABLE employee ADD CONSTRAINT employee_job_FK FOREIGN KEY ( job_job_id ) REFERENCES job ( job_id ) ;

ALTER TABLE employee ADD CONSTRAINT employee_manager_FK FOREIGN KEY ( manager_branch_id, manager_id ) REFERENCES manager ( branch_branch_id, manager_id1 ) ;

ALTER TABLE equipment ADD CONSTRAINT equipment_equipment_type_FK FOREIGN KEY ( type_branch_id ) REFERENCES equipment_type ( branch_branch_id ) ;

ALTER TABLE equipment_type ADD CONSTRAINT equipment_type_branch_FK FOREIGN KEY ( branch_branch_id ) REFERENCES branch ( branch_id ) ;

ALTER TABLE hire_transaction ADD CONSTRAINT hire_transaction_customer_FK FOREIGN KEY ( customer_Customer_id ) REFERENCES customer ( Customer_id ) ;

ALTER TABLE hire_transaction ADD CONSTRAINT hire_transaction_employee_FK FOREIGN KEY ( employee_job_job_id, employee_manager_id1 ) REFERENCES employee ( salary_salary_id, job_job_id, manager_manager_id, manager_branch_id ) ;

ALTER TABLE LINK ADD CONSTRAINT link_hire_transaction_FK FOREIGN KEY ( hire_transaction_trans_id, hire_transaction_Customer_id, hire_transaction_job_id ) REFERENCES hire_transaction ( trans_id, customer_Customer_id, employee_job_id ) ;

ALTER TABLE manager ADD CONSTRAINT manager_branch_FK FOREIGN KEY ( branch_branch_id ) REFERENCES branch ( branch_id ) ;

ALTER TABLE salary ADD CONSTRAINT salary_employee_FK FOREIGN KEY ( employee_job_job_id, employee_manager_id ) REFERENCES employee ( salary_salary_id, job_job_id, manager_manager_id, manager_branch_id ) ;

CREATE SEQUENCE customer_Customer_id_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER customer_Customer_id_TRG BEFORE
  INSERT ON customer FOR EACH ROW WHEN (NEW.Customer_id IS NULL) BEGIN :NEW.Customer_id := customer_Customer_id_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE equipment_equipment_ID_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER equipment_equipment_ID_TRG BEFORE
  INSERT ON equipment FOR EACH ROW WHEN (NEW.equipment_ID IS NULL) BEGIN :NEW.equipment_ID := equipment_equipment_ID_SEQ.NEXTVAL;
END;
/


-- Oracle SQL Developer Data Modeler Summary Report: 
-- 
-- CREATE TABLE                            12
-- CREATE INDEX                             1
-- ALTER TABLE                             23
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           1
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          1
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
