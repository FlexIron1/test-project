create table CAR
(
    id             SERIAL primary key,
    brand          VARCHAR(150),
    model          VARCHAR(200),
    power          REAL,
    year_of_issue  date,
    assessed_value DEC(20)
);

create table AIRPLANE
(
    id            SERIAL primary key,
    brand         varchar(150),
    model         varchar(200),
    manufacturer  varchar(500),
    year_of_issue date,
    fuelCapacity  INT,
    place         INT
);
