----------------------------------------------------------------------------
---------------------------------USERS--------------------------------------
----------------------------------------------------------------------------

--------------------------------------------------------------------------
-------------------------------USERS--------------------------------------
--------------------------------------------------------------------------

INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Albert', 'Albertowski', 'Albert', 'Albert@Albertowski.pl', 'test1', '2019-09-16', null, now());
INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Helena', 'Trojańska', 'Helena', 'Helena@Trojańska.pl', 'test2', '2019-09-14', null, '2019-10-16');
INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Bolek', 'Bolesław', 'Bolek', 'Bolek@Bolesław.pl', 'test3', '2019-09-01', null, '2019-10-16');
INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Czesiek', 'Czeski', 'Czesiek', 'Czesiek@Czeski.pl', 'test4', '2018-12-16', null, '2019-10-16');
INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Damian', 'Damski', 'Damian', 'Damian@Damski.pl', 'test5', '2019-05-01', null, '2019-09-16');
INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Eryk', 'Erycki', 'Eryk', 'Eryk@Erycki.pl', 'test6', '2019-01-12', '2019-09-16', '2019-10-16');
INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Filip', 'Filipiak', 'Filip', 'Filip@Filipiak.pl', 'test7', '2010-02-13', null, '2019-09-16');
INSERT INTO public.user (user_name, user_surname, user_login, email, password, creation_date, deleted, password_validity) VALUES ('Gośka', 'Gosińska', 'Gośka', 'Gośka@Gosińska.pl', 'test8', '2019-04-16', '2019-09-16', '2019-10-16');

--------------------------------------------------------------------------
------------------------------BREWERY-------------------------------------
--------------------------------------------------------------------------

INSERT INTO BREWERY (PRODUCTION_CAPACITY, BREWERY_NAME, BREWERY_GROUPS_ID, HISTORY, LOCALITY, TIDBIT, YEAR_OF_ESTABLISHMENT) VALUES (60000, 'Browar Ciechan', 1, 'Początki browaru Browar w Ciechanowie został założony w 1864 r. Przez pierwsze miesiące swojego istnienia należał do rodziny Wilichów. W latach 1864-1875 przeszedł na własność rodziny Żebrowskich, która następnie odsprzedała go warszawskiemu przemysłowcowi i piwowarowi szkockiego pochodzenia Karolowi Machlejdowi. Z czasem wspólnikiem Machlejda został Maurycy Blumenthal. Obaj współwłaściciele zbudowali nowoczesny zakład, który rozbudowywano do końca lat 90. XIX wieku. Nosił on wówczas nazwę Browar Gambrinus. Okres międzywojenny W 1919 roku browar w Ciechanowie nie wszedł w skład Zjednoczonych Browarów Warszawskich Haberbusch i Schiele Spółka Akcyjna. Pozostał w rękach rodziny Machlejdów. W okresie międzywojennym oprócz piwa produkował: napoje gazowane, lemoniady, ocet, aromaty. W okresie II wojny światowej browar został przejęty przez władze III Rzeszy i produkował piwo pod nazwą Brauerei Betriebs GmbH. Okres powojenny Po zakończeniu działań wojennych browar został w Polsce Ludowej upaństwowiony i w 1948 roku podporządkowany Centralnemu Zarządowi Przemysłu Fermentacyjnego w Warszawie. Później podlegał kolejno: Zjednoczeniu Przemysłu Terenowego w Warszawie, Mazowieckiemu Zjednoczeniu Terenowego Przemysłu Rolno-Spożywczego, Zjednoczeniu Przemysłu Piwowarskiego w Warszawie. Od lat 70. XX wieku pod nazwą Zakład nr 3 należał do Warszawskich Zakładów Piwowarskich. Historia najnowsza Po prywatyzacji Browarów Warszawskich w latach 90. XX wieku właścicielem browaru w Ciechanowie został austriacki koncern piwowarski Brau Union. W 2001 roku browar został zamknięty. W 2002 roku zakład kupiło przedsiębiorstwo Gambrynus Sp. z o.o., które wznowiło produkcję piwa jako Browar Gambrynus. W 2004 roku browar w Ciechanowie przyjął nazwę Browar Ciechanów, w 2007 roku zmienił ją na Browar Ciechan. W latach 2007-2008 browar zaczął dynamicznie rozwijać sieć dystrybucji w Polsce i wprowadzać na rynek nowe marki piwa (Pszeniczne, Stout). W 2008 roku wyroby Browaru Ciechan zostały wpisane przez Ministerstwo Rolnictwa i Rozwoju Wsi na polską Listę Produktów Tradycyjnych[1]. W 2013 roku browar stał się częścią holdingu Browary Regionalne Jakubiak. ', 'Ciechanów', 'test', now());

--------------------------------------------------------------------------
-------------------------------BEERS--------------------------------------
--------------------------------------------------------------------------

INSERT INTO public.beers (ALCOHOLIC_STRENGTH, BEER_CAPACITY, BEER_NAME, DESCRIPTION, EXTRACT, PRICE, STOCK_LEVEL, TYPE_OF_BEER) VALUES (5.7, 0.5, 'Ciechan Miodowe', 'Ciechan Miodowe – jasne, niefiltrowane piwo miodowe z browaru Ciechan w Ciechanowie, powstałe na bazie naturalnego miodu, który powoduje zmętnienie piwa. Piwo zawiera 12,1% ekstraktu, a z dodatkiem miodu 14,0% oraz 5,7% obj. alkoholu. Ciechan Miodowe zadebiutował w roku 2004. Piwo jest pasteryzowane. Browar do produkcji piwa miodowego zużywa ok. 3 ton miodu miesięcznie dostarczanego przez zakład Mazurskie Miody ZPH Karolina.', 12.1, 5.5, 10, 'miodowe');

