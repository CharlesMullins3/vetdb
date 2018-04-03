use vetdb;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS OWNER;
DROP TABLE IF EXISTS BILL;
DROP TABLE IF EXISTS PET;
DROP TABLE IF EXISTS PAYS;
DROP TABLE IF EXISTS OWNS;
DROP TABLE IF EXISTS MED_REC;
DROP TABLE IF EXISTS HAS_MEDS;
DROP TABLE IF EXISTS APPOINTMENT;
DROP TABLE IF EXISTS VETERINARIAN;
DROP TABLE IF EXISTS SCHEDULED;
DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS ROLE;
DROP TABLE IF EXISTS PERMISSIONS;
drop table if exists MEDICAL_REC;
drop table if exists HAS_RECS;


Create table if not exists OWNER (
fname 		varchar(15) 	NOT NULL,
lname 		varchar(15)		NOT NULL,
address 	varchar(30) 	NOT NULL,
phone		varchar(10) 	NOT NULL,
owner_id 	int(10) 		NOT NULL AUTO_INCREMENT,
user_id		int(5),
PRIMARY KEY(OWNER_ID),
foreign key(user_id) references USERS(user_id)
);

create table if not exists BILL(
bill_id 	int(15) 		NOT NULL AUTO_INCREMENT,
balance 	decimal(7,2) 	NOT NULL,
tot_amount 	decimal(7,2) 	NOT NULL,
due_date 	date 			NOT NULL, 
PRIMARY KEY(bill_id));

create table if not exists PET(
pet_id 		int(10) 		NOT NULL AUTO_INCREMENT,
petname 	varchar(15) 	NOT NULL,
sex 		char		    NOT NULL,
species 	varchar(10) 	NOT NULL,
age int NOT NULL,
primary key(pet_id)
);

create table if not exists PAYS(
bill_id 	int(15) 		NOT NULL,
owner_id	int(10) 		NOT NULL,
primary key(bill_id),
foreign key(bill_id) references BILL(bill_id) on delete cascade,
foreign key(owner_id) references OWNER(owner_id)
); 

create table if not exists OWNS(
owner_id 	int(10) 		NOT NULL,
pet_id 		int(10) 		NOT NULL,
primary key(owner_id,pet_id),
foreign key (owner_id) references OWNER(owner_id),
foreign key (pet_id) references PET(pet_id) on delete cascade
);

create table if not exists MED_REC (
med_id 		int(10) 		NOT NULL AUTO_INCREMENT,
per_date 	date 			NOT NULL,
medicine 	varchar(15) 	NOT NULL,
refills		int				NOT NULL,
dosage    varchar(10)  NOT NULL,
instructions varchar(50) NOT NULL,
Primary key(med_id));

create table if not exists MEDICAL_REC (
rec_id      int(10) 		NOT NULL AUTO_INCREMENT,
recdate 	date 			NOT NULL,
issue 	varchar(20) 	NOT NULL,
description		varchar(50)			NOT NULL,
Primary key(rec_id)
);

create table if not exists HAS_MEDS ( 
pet_id 		int(10) 		NOT NULL,
med_id 		int(10) 		NOT NULL,
primary key(pet_id, med_id),
foreign key(pet_id) references PET(pet_id) on delete cascade,
foreign key(med_id) references MED_REC(med_id));

create table if not exists APPOINTMENT (
apt_id 		int(15) 		NOT NULL auto_increment,
app_date 	date 			NOT NULL,
app_time 	time 			NOT NULL,
reason		varchar(100) 	NOT NULL,
primary key(apt_id));

create table if not exists VETERINARIAN(
name 		varchar(15)		 NOT NULL,
vet_id 		int(5) 			 NOT NULL	AUTO_INCREMENT,
issue_date 	date 			 NOT NULL,
license_num int(4) 			 NOT NULL,
years_of_experience int(2) 	 NOT NULL,
area_of_expertise varchar(15) NOT NULL,
address 	varchar(40) 	 NOT NULL,
user_id		int(5),
primary key(vet_id),
foreign key(user_id) references USERS(user_id)
);

create table if not exists SCHEDULED (
vet_id 		int(5) 		NOT NULL,
pet_id 		int(10) 	NOT NULL,
apt_id 		int(15) 	NOT NULL,
primary key(vet_id, pet_id, apt_id),
foreign key (pet_id) references PET(pet_id) on delete cascade,
foreign key(apt_id) references APPOINTMENT(apt_id));

create table if not exists USERS(
user_id 	int(5) 		NOT NULL AUTO_INCREMENT,
username	varchar(20) NOT NULL,
password	varchar(20) NOT NULL,
unique(username),
primary key(user_id));

create table if not exists ROLE(
role_id		int(5)		NOT NULL AUTO_INCREMENT,
role_name	varchar(25)	NOT NULL,
primary key(role_id));

create table if not exists PERMISSIONS(
user_id		int(5)		NOT NULL,
role_id		int(5)		NOT NULL,
primary key(user_id,role_id),
foreign key(user_id) references USERS(user_id),
foreign key(role_id) references ROLE(role_id));

create table if not exists HAS_RECS(
pet_id		int(10)		NOT NULL,
rec_id		int(10)		NOT NULL,
primary key(pet_id,rec_id),
foreign key (pet_id) references PET(pet_id) on delete cascade,
foreign key(rec_id) references MEDICAL_REC(rec_id)
);


/*ADD OWNER DATA*/ 
INSERT INTO OWNER (fname,lname,address,phone,user_id)
VALUES('Melvin','Gaye','316 Garden Rd Towson MD 21286',4435555555,1),     #Owner 1
	  ('Charles','Winston','314 Garden Rd Towson MD 21286',4435556666,2), #Owner 2
	  ('Chris','Ratcliff','305 Garden Rd Towson MD 21286',4435557777,3),  #Owner 3
	  ('Troy','Stuntman','313 Garden Rd Towson MD 21286',4435558888,4),   #Owner 4
	  ('Leon','Pullman','216 Garden Rd Towson MD 21286',4435559999,5),	  #Owner 5
	  ('Lacy','Goldstein','116 Garden Rd Towson MD 21286',4435551010,6);  #Owner 6
      
/*ADD MEDICAL RECORDS*/
INSERT INTO MEDICAL_REC (recdate, issue, description)
VALUES('2018-05-03', 'shot', 'animal recived a rabies shot'),
	  ('2017-05-01', 'injury', 'stung by a bee');

INSERT INTO HAS_RECS (pet_id,rec_id)
values(1,1),
      (1,2);


/*ADD BILL DATA*/ 
INSERT INTO BILL(balance,tot_amount,due_date)
VALUES(2000.02,3000.00,'2018-04-03'),	#Bill 1
	  (2900.02,7764.00,'2018-05-03'),	#Bill 2
	  (20.20,150.50,'2018-10-03'),		#Bill 3
	  (1776.00,1836.00,'2018-12-03'),	#Bill 4
	  (1664.02,2003.00,'2018-04-28'),	#Bill 5
	  (1738.00,5025.00,'2018-04-30'),	#Bill 6
      (230.00,1200,'2018-02-23');		#Bill 7


/*ADD PET DATA*/ 
INSERT INTO PET(petname,sex,species,age)
VALUES('Maxxie','M','Dog',2),		#Pet 1
	  ('Minnie','F','Snake',1),		#Pet 2
	  ('Maggie','F','Lizard',9),	#Pet 3
	  ('Mollie','M','Bird',8),		#Pet 4
	  ('Mezzie','F','Cat',10),		#Pet 5
	  ('Sprite','M','Dog',1),		#Pet 6
      ('Snuffles','M','Dog',2);		#Pet 7



/*ADD PAYS DATA*/ 
INSERT INTO PAYS(bill_id,owner_id)
VALUES(1,1),
	  (2,2),
	  (3,3),
	  (4,4),
	  (5,5),
	  (6,6),
      (7,5); 


/*ADD OWNS DATA*/ 
INSERT INTO OWNS(owner_id,pet_id)
VALUES(1,1),
	  (2,2),
	  (3,3),
	  (4,4),
	  (5,5),
      (5,7),
	  (6,6);


/*ADD MED_REC DATA*/ 
INSERT INTO MED_REC (per_date,medicine,refills, dosage, instructions)
VALUES('2013-4-11','Fotrane',5, '20 mg', 'give one pill every 8 hours'),  #Med 1
	  ('2017-2-25','Advil',1, '20 mg', 'give one pill every 8 hours'),	#Med 2
	  ('2016-8-11','Cialis',4, '20 mg', 'give one pill every 8 hours'),	#Med 3
	  ('2017-2-11','Muxol',4, '20 mg', 'give one pill every 8 hours'),	#Med 4
	  ('2015-12-11','Lotrane',9, '20 mg', 'give one pill every 8 hours');	#Med 5



/*ADD HAS_MEDS DATA*/ 
INSERT INTO HAS_MEDS (pet_id,med_id)
VALUES(1,1),
	  (2,2),
	  (3,3),
	  (4,5),
	  (5,5),
	  (6,2);


/*ADD APPOINTMENT DATA*/ 
INSERT INTO APPOINTMENT (app_date,app_time,reason)
VALUES('2017-01-01','12:30:00','Stomach Virus'),	#Appointment 1
      ('2017-01-05','02:30:00','Stomach Virus'),	#Appointment 2
	  ('2017-01-28','03:30:00','Stomach Hurts'),	#Appointment 3
	  ('2017-02-01','11:30:00','Stomach Pain'),		#Appointment 4
	  ('2017-01-01','01:30:00','Stomach Ache'),		#Appointment 5
	  ('2017-05-01','12:30:00','Stomach Problems');	#Appointment 6


/*ADD VETERINARIAN DATA*/ 
INSERT INTO VETERINARIAN(name,issue_date,license_num,years_of_experience,area_of_expertise,address,user_id)
VALUES('McKraken','1980-05-23',9991,30,'Diet','1312 Light St Baltimore MD 21213',7),			#Vet 1
	  ('McGuise','1980-05-23',9992,25,'Shots','112 Ford St Baltimore MD 21214',8),				#Vet 2
	  ('McLouise','1980-05-23',9993,40,'Exercise','132 Berry St Baltimore MD 21203',9),			#Vet 3
	  ('McPhil','1980-05-23',9994,10,'Prescription','312 Bond St Baltimore MD 21217',10),		#Vet 4
	  ('McBrien','1980-05-23',9995,30,'Surgery','12 Light St Baltimore MD 21133',11),			#Vet 5
	  ('McZhua','1980-05-23',9996,15,'General Health','11 Light St Baltimore MD 21213',12);		#Vet 6



/*ADD SCHEDULED DATA*/ INSERT INTO SCHEDULED (vet_id,pet_id,apt_id)
VALUES(1,1,1),
	  (2,2,2),
	  (3,3,3),
	  (4,4,4),
	  (5,5,5),
	  (6,6,6);
      
	
    

#Insert Owner user
insert into USERS (username,password)
values ('melvin1','qwerty'),	   	#User 1
	   ('charlesW','123321'),	   	#User 2
       ('chris','333'),			   	#User 3
	   ('troyS','123'),				#User 4
       ('leonP','321'),				#User 5
       ('lacyG','111');				#User 6



#Insert Vet user
insert into USERS (username,password)
values ('mckraken3','123456789'),	#User 7
	   ('mcguise5','snowball44'),	#User 8
       ('mcloise11','raccoon'),		#User 9
       ('mcphil','789'),			#User 10
       ('mcbrien','135'),			#User 11
       ('mczhua','246');			#User 12
       
#Insert Employee users
insert into USERS (username,password) 
values ('jsmith13','rover1'),	   	#User 13
	   ('jane2','apples'),		   	#User 14
       ('mwilliams','ilikecats');  	#User 15
       
#add admins
insert into USERS (username,password) 
values ('admin','pword'); #User 16
       
       
       
       
#Insert Roles
insert into ROLE (role_name)
values ('Employee User'),		#Role 1
	   ('Owner User'), 			#Role 2	
	   ('Veterinarian User'), 	#Role 3
	   ('Administrator'); 		#Role 4

       
#Specify Users and Roles they can perform
insert into PERMISSIONS (user_id,role_id)
values 	(1,2), #Owners
		(2,2),
        (3,2),
        (4,2),
        (5,2),
        (6,2),
        
        (7,3), #Vets
        (8,3),
        (9,3),
        (10,3),
        (11,3),
        (12,3),
        
        
        (13,1), #Employees
        (14,1),
        (15,1),
        
        (16,4); #Admin
        
        

SET FOREIGN_KEY_CHECKS = 1;
