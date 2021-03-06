DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id BIGINT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  phone VARCHAR(30) NOT NULL,
  UNIQUE(name)
);