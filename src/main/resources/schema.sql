DROP TABLE IF EXISTS users;

CREATE TABLE  users (
  id bigint  PRIMARY KEY NOT NULL,
  name varchar(100) NOT NULL,
  lastName varchar(100) NOT NULL,
  patronymic varchar(100) NOT NULL,
  email varchar(100) NOT NULL,
  password varchar(100) NOT NULL
);

DROP TABLE IF EXISTS car;
CREATE TABLE  car (
  id bigint  PRIMARY KEY NOT NULL,
  mark varchar(100) NOT NULL,
  model varchar(100) NOT NULL,
  price bigint
);

DROP TABLE IF EXISTS house;
CREATE TABLE  house (
  id bigint  PRIMARY KEY NOT NULL,
  square decimal NOT NULL,
  address varchar(100) NOT NULL
);

DROP TABLE IF EXISTS property_right;
CREATE TABLE  property_right (
  id bigint  PRIMARY KEY NOT NULL,
  userId bigint  NOT NULL,
  carId bigint  NOT NULL,
  houseId bigint NOT NULL,
  description varchar(100) NOT NULL,
  documentType varchar(100) NOT NULL
);

insert into house (id, square, address) values (1, 100.5, 'address');
insert into house (id, square, address) values (2, 100.5, 'address');
insert into house (id, square, address) values (3, 100.5, 'address');
insert into house (id, square, address) values (4, 100.5, 'address');

insert into users (id, name, lastName, patronymic, email, password) values (1, 'Vitalii', 'Musiienko', 'Sergiyovich', 'email@mail.com', '123');
insert into users (id, name, lastName, patronymic, email, password) values (2, 'test2', 'test2', 'test2', 'test2', 'test2');
insert into users (id, name, lastName, patronymic, email, password) values (3, 'test3', 'test3', 'test3', 'test3', 'test3');
insert into users (id, name, lastName, patronymic, email, password) values (4, 'test4', 'test4', 'test4', 'test4', 'test4');

INSERT into car (id, mark, model, price) values (1, 'mark 1', 'model 1', 100);
INSERT into car (id, mark, model, price) values (2, 'mark 2', 'model 2', 100);
INSERT into car (id, mark, model, price) values (3, 'mark 3', 'model 3', 100);
INSERT into car (id, mark, model, price) values (4, 'mark 4', 'model 4', 100);
INSERT into car (id, mark, model, price) values (5, 'mark 5', 'model 5', 100);
