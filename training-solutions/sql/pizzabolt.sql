-- 1. Listázd ki az összes pizzát név szerint csökkenő sorrendben! (2 pont)

SELECT nev FROM pizza
ORDER BY nev DESC;

-- 2. Számold meg, hány futár van, akinek a neve nem ’G’ betűvel kezdődik!

SELECT COUNT(id) FROM futar
WHERE nev NOT LIKE 'G%';

-- 3. Számold össze, hogy melyik dátumon hány darab megrendelés történt! (2 pont)

SELECT datum, COUNT(id) FROM rendeles
GROUP BY datum;

-- 4. Mely rendelések történtek délelőtt? (2 pont)

SELECT * FROM rendeles
WHERE ido < 12;

-- 5. Átlagosan mennyibe kerül egy pizza? 1 tizedes pontossággal add meg a választ! Az eredményoszlopot nevezd el ’Atlag’ néven! (3 pont)

SELECT ROUND(AVG(ar), 1) AS 'Atlag' FROM pizza;

-- 6. Listázd ki az összes megrendelés idejét, a megrendelő azonosítóját és a megrendelő nevét is! (3 pont)

SELECT rendeles.ido AS 'rendeles_ideje', vevo.id AS 'megrendelo_azonositoja', vevo.nev AS 'megrendelo_neve' FROM rendeles
JOIN vevo ON rendeles.vevo_id = vevo.id;

-- 7. Szúrj be egy új oszlopot a vevo táblába! Az új mező típusa szöveges legyen, 9 karakter hosszú, a mező neve ’telefon’! (3 pont)

ALTER TABLE vevo
ADD COLUMN telefon VARCHAR(9);

-- 8. Szúrj be egy új rekordot a módosított vevo táblába! Minden mezőbe kerüljön adat! (3 pont)

INSERT INTO vevo (`id`, `nev`, `cim`, `telefon`) 
VALUES (8, 'Sapi', 'Hofeherke u. 4', '061234567');

-- 9. Listázd ki az összes pizzafutárt név szerint csökkenő sorrendben! (2 pont)

SELECT * FROM futar
ORDER BY nev DESC;

-- 10. Számold meg, mennyi vásárló van, akinek a neve nem ’S’ betűvel kezdődik! (2 pont)

SELECT COUNT(id) FROM vevo
WHERE nev NOT LIKE 'S%';

-- 11. Számold össze, hogy melyik dátumon mennyi darab megrendelés történt! (2 pont)

SELECT datum, COUNT(id) FROM rendeles
GROUP BY datum;

-- 12. Mely rendelések történtek délután? (2 pont)

SELECT * FROM rendeles
WHERE ido >= 12;

-- 13. Átlagosan hány órakor rendelnek pizzát? 1 tizedes pontossággal add meg a választ! Az eredményoszlopot nevezd el ’Atlag’ néven! (3 pont)

SELECT ROUND(AVG(ido), 1) AS 'Atlag' FROM rendeles;

-- 14. Listázd ki az összes megrendeléshez tartozó azonosítót, a megrendelés idejét és a megrendelő nevét is! (3 pont)

SELECT rendeles.id, rendeles.ido, vevo.nev FROM rendeles
JOIN vevo ON rendeles.vevo_id = vevo.id;

-- 15. Szúrj be egy új oszlopot a futar táblába! Az új mező típusa szám legyen, 4 karakter hosszú, a mező neve ’szuletesi_ev’! (3 pont)

ALTER TABLE futar
ADD COLUMN szuletesi_ev INT(4);

-- 16. Szúrj be egy új rekordot a futar táblába! Minden mezőbe kerüljön adat! (3 pont)

INSERT INTO futar (`id`, `nev`, `telefon`, `szuletesi_ev`) 
VALUES (6, 'Zuhatag', '565656', 1989);

-- 17. Listázd ki az összes vásárlót név szerint csökkenő sorrendben! (2 pont)

SELECT * FROM vevo
ORDER BY nev DESC;

-- 18. Átlagosan mennyi pizzát rendelnek egy alkalommal? 1 tizedes pontossággal add meg a választ! Az eredményoszlopot nevezd el ’Atlag’ néven! (3 pont)

SELECT ROUND(AVG(db), 1) AS 'Atlag' FROM tetel;

-- 19. Listázd ki az összes megrendeléshez tartozó azonosítót, a megrendelő azonosítóját és a megrendelő nevét is! (3 pont)

SELECT rendeles.id, rendeles.vevo_id, vevo.nev FROM rendeles
JOIN vevo ON rendeles.vevo_id = vevo.id;

-- 20. Szúrj be egy új oszlopot a pizza táblába! Az új mező típusa szám legyen, 4 karakter hosszú, a mező neve ’atmero’! (3 pont)

ALTER TABLE pizza
ADD COLUMN atmero INT(4);

-- 21. Szúrj be egy új rekordot a pizza táblába! Minden mezőbe kerüljön adat! (3 pont)

INSERT INTO pizza (`id`, `nev`, `ar`) VALUES (6, 'Mozzarella', 1000);