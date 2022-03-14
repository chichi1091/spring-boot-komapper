create table person(
    id int GENERATED ALWAYS AS IDENTITY(START WITH 1) PRIMARY KEY,
    name varchar(255) not null,
    email varchar(255) not null
);