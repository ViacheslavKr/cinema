insert into MOVIE values(1, 7200,'Back to future 1');
insert into MOVIE values(2, 7000,'Back to future 2');
insert into MOVIE values(3, 6500,'Back to future 3');
insert into MOVIE values(4, 6000,'Avatar');
insert into MOVIE values(5, 8000,'Titanic');

insert into CINEMA values(1, 'Berkovetska  6', 'Lavina');
insert into CINEMA values(2, 'Hetmana 1', 'Cosmopolit');
insert into CINEMA values(3, 'Lypkivskog 6', 'Ultramarin');
insert into CINEMA values(4, 'Obolonskiy pr 5', 'Oskar');
insert into CINEMA values(5, 'Hnata Yury 9', 'Leipzyg');
insert into CINEMA values(6, 'Peremohy ave 100', 'Ekran');


insert into SHOWING values(1,{ts '2019-06-01 10:00:00.0'},{ts '2019-06-01 12:00:00.0'}, 1,1);
insert into SHOWING values(2,{ts '2019-06-01 12:10:00.0'},{ts '2019-06-01 14:00:00.0'}, 1,1);
insert into SHOWING values(3,{ts '2019-06-01 15:10:00.0'},{ts '2019-06-01 17:00:00.0'}, 1,1);
insert into SHOWING values(4,{ts '2019-06-01 18:10:00.0'},{ts '2019-06-01 19:00:00.0'}, 1,1);
insert into SHOWING values(5,{ts '2019-06-01 21:10:00.0'},{ts '2019-06-01 23:00:00.0'}, 1,1);
insert into SHOWING values(6,{ts '2019-06-01 23:10:00.0'},{ts '2019-06-01 23:30:00.0'}, 1,1);
insert into SHOWING values(7,{ts '2019-06-01 23:40:00.0'},{ts '2019-06-02 00:30:00.0'}, 1,1);
insert into SHOWING values(8,{ts '2019-06-02 10:00:00.0'},{ts '2019-06-02 12:00:00.0'}, 1,1);
insert into SHOWING values(9,{ts '2019-06-02 12:10:00.0'},{ts '2019-06-02 14:00:00.0'}, 1,1);
insert into SHOWING values(10,{ts '2019-06-05 15:10:00.0'},{ts '2019-06-05 17:00:00.0'}, 1,1);
insert into SHOWING values(11,{ts '2019-06-05 18:10:00.0'},{ts '2019-06-05 19:00:00.0'}, 1,1);
insert into SHOWING values(12,{ts '2019-06-05 21:10:00.0'},{ts '2019-06-05 23:00:00.0'}, 1,1);
insert into SHOWING values(13,{ts '2019-06-05 23:10:00.0'},{ts '2019-06-05 23:30:00.0'}, 1,1);
insert into SHOWING values(14,{ts '2019-06-05 23:40:00.0'},{ts '2019-06-05 23:59:59.0'}, 1,1);




insert into SHOWING values(50,{ts '2019-06-03 22:00:00.0'},{ts '2019-06-03 23:30:00.0'}, 2,1);
insert into SHOWING values(51,{ts '2019-06-03 22:00:00.0'},{ts '2019-06-03 23:30:00.0'}, 2,1);

insert into SHOWING values(101,{ts '2019-06-01 10:00:00.0'},{ts '2019-06-01 12:00:00.0'}, 3,1);
insert into SHOWING values(102,{ts '2019-06-01 12:00:00.0'},{ts '2019-06-01 14:00:00.0'}, 3,1);
insert into SHOWING values(103,{ts '2019-06-01 15:00:00.0'},{ts '2019-06-01 17:00:00.0'}, 3,1);
insert into SHOWING values(104,{ts '2019-06-01 18:00:00.0'},{ts '2019-06-01 19:00:00.0'}, 3,1);
insert into SHOWING values(105,{ts '2019-06-01 21:00:00.0'},{ts '2019-06-01 23:00:00.0'}, 3,1);
insert into SHOWING values(106,{ts '2019-06-01 22:00:00.0'},{ts '2019-06-01 01:30:00.0'}, 3,1);


insert into SHOWING values(301,{ts '2019-06-13 10:00:00.0'},{ts '2019-06-13 12:00:00.0'}, 4,1);
insert into SHOWING values(302,{ts '2019-06-13 12:00:00.0'},{ts '2019-06-13 14:00:00.0'}, 4,1);
insert into SHOWING values(303,{ts '2019-06-13 15:00:00.0'},{ts '2019-06-13 17:00:00.0'}, 4,1);
insert into SHOWING values(304,{ts '2019-06-13 18:00:00.0'},{ts '2019-06-13 19:00:00.0'}, 4,1);
insert into SHOWING values(306,{ts '2019-06-13 22:00:00.0'},{ts '2019-06-14 01:30:00.0'}, 4,1);



insert into SHOWING values(201,{ts '2019-06-03 10:00:00.0'},{ts '2019-06-02 12:30:00.0'}, 4,2);
insert into SHOWING values(202,{ts '2019-06-03 13:00:00.0'},{ts '2019-06-02 14:50:00.0'}, 4,3);
insert into SHOWING values(203,{ts '2019-06-03 15:00:00.0'},{ts '2019-06-02 18:30:00.0'}, 4,5);


insert into TICKET values (1, '', 100, 1);
insert into TICKET values (2, '', 50, 1);
insert into TICKET values (3, '', 40, 1);
insert into TICKET values (4, '', 200, 1);
insert into TICKET values (5, '', 200, 2);
insert into TICKET values (6, '', 200, 4);
insert into TICKET values (7, '', 100, 1);
insert into TICKET values (8, '', 50, 1);
insert into TICKET values (9, '', 40, 1);
insert into TICKET values (10, 'Customer 0', 50, 8);
insert into TICKET values (11, 'Customer 1', 50, 9);
insert into TICKET values (12, 'Customer 2', 50, 10);
insert into TICKET values (13, 'Customer 3', 50, 11);
insert into TICKET values (14, 'Customer 4', 60, 12);
insert into TICKET values (15, 'Customer 4', 60, 13);
insert into TICKET values (16, 'Customer 4', 25, 14);
insert into TICKET values (17, 'Customer 4', 33, 14);


insert into TICKET values (61, '', 200, 201);
insert into TICKET values (62, '', 17, 201);
insert into TICKET values (63, '', 10, 201);

