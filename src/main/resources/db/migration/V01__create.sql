create table person
(
    id    int GENERATED ALWAYS AS IDENTITY (START WITH 3) PRIMARY KEY,
    name  varchar(255) not null,
    email varchar(255) not null
);

create table team
(
    id   int GENERATED ALWAYS AS IDENTITY (START WITH 3) PRIMARY KEY,
    name varchar(255) not null
);

create table team_member
(
    id        int GENERATED ALWAYS AS IDENTITY (START WITH 4) PRIMARY KEY,
    team_id  int not null,
    member_id int not null
);
