create table airplane
(
    id            BIGSERIAL not null,
    brand         VARCHAR(255),
    manufacturer  VARCHAR(255),
    model         VARCHAR(255),
    place         INTEGER,
    fuel_capacity INTEGER,
    year_of_issue INTEGER,
    PRIMARY KEY (id)
);
create table airplane_value
(
    airplane_id BIGINT not null,
    value       NUMERIC(19, 2)
);
create table car
(
    id            BIGSERIAL NOT NULL,
    brand         VARCHAR(255),
    model         VARCHAR(255),
    power         REAL,
    year_of_issue SMALLINT,
    PRIMARY KEY (id)
);
create table car_value
(
    car_id BIGINT NOT NULL,
    value  NUMERIC(19, 2)
);
alter table if exists airplane_value
    ADD CONSTRAINT airplane_value_airplane_fk FOREIGN KEY (airplane_id) REFERENCES airplane;
alter table if exists car_value
    add CONSTRAINT car_value_car_fk FOREIGN KEY (car_id) REFERENCES car;
