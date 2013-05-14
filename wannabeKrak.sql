drop table PERSONDATA;

create table PERSONDATA(
    ID int primary key,
    FIRST_NAME varchar(20),
    LAST_NAME varchar(30),
    STREET varchar(50),
    CITY varchar(20),
    ZIPCODE varchar(4),
    PHONE varchar(10)
);

insert into PERSONDATA
values( 1, 'Per', 'Nielsen', 'Adelgade 8', 'København', '2300', '39562436' ),
( 2, 'Birgitte', 'Lærke', 'Borgergade 85', 'København', '2300', '10658435'),
( 3, 'Hanne', 'Troelsen', 'Syrumsvej 52', 'Lyngby', '1337', '64372812'),
( 4, 'Kurt', 'Phillipsen', 'Kilesensvej 32', 'Valby', '2500', '86573526'),
( 5, 'Børge', 'Bjarke', 'Kedsommelighedsvej 2', 'Dødsby', '1111', '64738201');