CREATE TABLE Agency (
    id integer AUTO_INCREMENT PRIMARY KEY,
    name varchar(200)
);

CREATE TABLE Agent (
    id varchar(9) PRIMARY KEY,
    agency_id integer NOT NULL,
    name varchar(200),
    FOREIGN KEY (agency_id) REFERENCES Agency(id)
);
