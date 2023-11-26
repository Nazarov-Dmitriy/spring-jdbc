create table CUSTOMERS(
    id int generated always as identity primary key,
    name varchar(50) not null,
    surname varchar(50) not null,
    age int not null,
    phone_number VARCHAR(12) not null
);

create table ORDERS(
    id int generated always as identity primary key,
    date date not null,
    customer_id int not null references CUSTOMERS(id),
    product_name varchar(50) not null,
    amount int not null
);

insert into CUSTOMERS(name, surname, age, phone_number)
values ('Andrey', 'Grebenin', 22, '+7114154415'),
 ('ivan', 'Vasyliev', 32, '+732132132'),
 ('alexey', 'Barin', 12, '+7132123144');

insert into ORDERS(date, customer_id, product_name, amount)
values ('2023-11-11', 1,'товар 1', 2),
 ('2023-10-02', 2,'товар 2', 3),
 ('2023-12-12', 3,'товар 3', 1);



