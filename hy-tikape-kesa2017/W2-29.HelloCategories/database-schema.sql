CREATE TABLE Category (
    id integer AUTO_INCREMENT PRIMARY KEY,
    name varchar(200)
);

CREATE TABLE Item (
    id integer AUTO_INCREMENT PRIMARY KEY,
    category_id integer NOT NULL,
    name varchar(200),
    FOREIGN KEY (category_id) REFERENCES Category(id)
);
