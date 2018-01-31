CREATE TABLE employee (
  id NUMBER auto_increment PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  surname VARCHAR(50),
  email VARCHAR(50),
  password_hash VARCHAR(500),
  position VARCHAR(50),
  available_date TIMESTAMP DEFAULT SYSDATE,
  activated BOOLEAN DEFAULT FALSE
);

CREATE TABLE customer (
  id NUMBER auto_increment PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  address VARCHAR(500),
  PHONE_NUMBER VARCHAR(500)
  );

CREATE TABLE task (
  id NUMBER auto_increment PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(500),
  create_date TIMESTAMP DEFAULT SYSDATE,
  end_of_work_date TIMESTAMP DEFAULT SYSDATE,
  customer INT NOT NULL,
  );
