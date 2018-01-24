CREATE TABLE employee (
  id NUMBER auto_increment PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  surname VARCHAR(50),
  email VARCHAR(50),
  password_hash VARCHAR(500),
  position VARCHAR(50),
  available_date TIMESTAMP,
  activated BOOLEAN DEFAULT FALSE
);
