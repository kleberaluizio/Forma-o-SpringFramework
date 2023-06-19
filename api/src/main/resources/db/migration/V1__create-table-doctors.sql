CREATE TABLE doctors(
    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    specialty varchar(100) not null,
    street varchar(100) not null,
    neighbourhood varchar(100) not null,
    cep varchar(9) not null,
    extra varchar(100),
    number varchar(20),
    state char(2) not null,
    city varchar(100) not null,
    PRIMARY KEY (id)
);