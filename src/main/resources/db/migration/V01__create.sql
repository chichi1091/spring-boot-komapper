create table person
(
    id    int GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY,
    name  varchar(255) not null,
    email varchar(255) not null
);

create table `group`
(
    id   int GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY,
    name varchar(255) not null
);

create table group_member
(
    id        int GENERATED ALWAYS AS IDENTITY (START WITH 1) PRIMARY KEY,
    group_id  int not null,
    member_id int not null
);