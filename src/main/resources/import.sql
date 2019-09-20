--
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Albert', 'Albertowski','Albert', 'Albert@Albertowski.pl', 'test1', '2019-09-16', null, now());
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Helena', 'Trojańska','Helena', 'Helena@Trojańska.pl', 'test2', '2019-09-14', null, '2019-10-16');
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Bolek', 'Bolesław','Bolek', 'Bolek@Bolesław.pl', 'test3', '2019-09-01', null, '2019-10-16');
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Czesiek', 'Czeski','Czesiek', 'Czesiek@Czeski.pl', 'test4', '2018-12-16', null, '2019-10-16');
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Damian', 'Damski','Damian', 'Damian@Damski.pl', 'test5', '2019-05-01', null, '2019-09-16');
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Eryk', 'Erycki','Eryk', 'Eryk@Erycki.pl', 'test6', '2019-01-12', '2019-09-16', '2019-10-16');
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Filip', 'Filipiak','Filip', 'Filip@Filipiak.pl', 'test7', '2010-02-13', null, '2019-09-16');
INSERT INTO public.user (user_name,user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Gośka', 'Gosińska','Gośka', 'Gośka@Gosińska.pl', 'test8', '2019-04-16', '2019-09-16', '2019-10-16');

INSERT INTO public.beers (beer_name,brewery_id,type_of_beer,description,beer_capacity,price,alcoholic_strength,stock_level,quantity,extract) VALUES ('tyskie',1,'GRUPA_ZYWIEC','tyskie',1,2.3, 3,100, 4, 5);
INSERT INTO public.beers (beer_name,brewery_id,type_of_beer,description,beer_capacity,price,alcoholic_strength,stock_level,quantity,extract) VALUES ('Żywiec',2,'GRUPA_ZYWIEC','Żywiec',1,2.3, 3,35, 4, 5);
