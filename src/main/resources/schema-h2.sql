CREATE TABLE AUTHORS (
  id int not null AUTO_INCREMENT,
  name VARCHAR not null
);

CREATE TABLE ADVICES (
  id int not null AUTO_INCREMENT,
  author_id int,
  sentence varchar,
  PRIMARY KEY (id),
  FOREIGN KEY (author_id) REFERENCES authors(id)
);

