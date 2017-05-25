create sequence city_seq;
create sequence country_seq;
CREATE TABLE country (
  id         IDENTITY PRIMARY KEY,
  name VARCHAR(100) NOT NULL
);
CREATE TABLE city (
  id         IDENTITY PRIMARY KEY,
  country_id INTEGER NOT NULL,
  name VARCHAR(100) NOT NULL,
   FOREIGN KEY (country_id) REFERENCES country(id)
);

