-- 1. Mely termékek drágábbak 1000 Ft-nál? (2 pont)

SELECT * FROM termek
WHERE ar > 1000;

-- 2. Hányszor rendelt termékeket Morgó? (3 pont)

SELECT COUNT(vasarlo_id) FROM rendeles
WHERE vasarlo_id = (SELECT id FROM vasarlo WHERE nev = 'Morgo');

-- 3. Ki vásárolta meg az egyes rendeléseket? A nevét is jelenítsd meg! Az eredményoszlopot nevezd el „ugyfel” néven!  (4 pont)

SELECT DISTINCT vasarlo.nev AS 'ugyfel' FROM vasarlo
JOIN rendeles ON vasarlo.id = rendeles.vasarlo_id;

-- 4. Hány darabot rendeltek összesen az egyes termékekből? A termékek árát is jelenítsd meg! (4 pont)

SELECT termek.id, COUNT(termek.id), termek.ar FROM termek
JOIN tetel ON termek.id = tetel.termek_id
GROUP BY termek.id;

-- 5. Mely rendelések történtek délután? A megrendelt termékek nevét is jelenítsd meg! (4 pont)

SELECT rendeles.id, termek.nev, rendeles.ido FROM rendeles
JOIN tetel ON rendeles.id = tetel.rendeles_id
JOIN termek ON tetel.termek_id = termek.id
WHERE rendeles.ido >= 12;

-- 6. Melyik a legolcsóbb termék? Az árát, az azonosítóját és a nevét is listázd ki! (3 pont)

SELECT * FROM termek
WHERE ar = (SELECT MIN(ar) FROM termek);

-- 7. Mely termékek olcsóbbak 1000 Ft-nál? (2 pont)

SELECT * FROM termek
WHERE ar < 1000;

-- 8. Hányszor rendelt termékeket Szende? (3 pont)

SELECT COUNT(vasarlo_id) FROM rendeles
WHERE vasarlo_id = (SELECT id FROM vasarlo WHERE nev = 'Szende');

-- 9. Ki adta el az egyes rendeléseket? A nevét is jelenítsd meg! Az eredményoszlopot nevezd el „elado” néven!  (4 pont)

SELECT DISTINCT elado.nev AS 'elado' FROM elado
JOIN rendeles ON elado.id = rendeles.elado_id;
 
-- 10. Hány darabot rendeltek összesen az egyes termékekből? A termékek nevét is jelenítsd meg! (4 pont)

SELECT termek.id, COUNT(termek.id), termek.nev FROM termek
JOIN tetel ON termek.id = tetel.termek_id
GROUP BY termek.id;

-- 11. Mely rendelések történtek délelőtt? A megrendelt termék nevét is jelenítsd meg! (4 pont)

SELECT rendeles.id, termek.nev FROM rendeles
JOIN tetel ON rendeles.id = tetel.rendeles_id
JOIN termek ON tetel.termek_id = termek.id
WHERE rendeles.ido < 12;

-- 12. Melyik a legdrágább termék? Az árát, az azonosítóját és a nevét is listázd ki! (4 pont)

SELECT * FROM termek
WHERE ar = (SELECT MAX(ar) FROM termek);
 
-- 13. Melyek azok a termékek, amelyekből még nem történt eladás, azaz csak porosodnak a raktárban? (4 pont)

SELECT termek.id, termek.nev FROM termek
WHERE termek.id NOT IN (SELECT tetel.termek_id FROM tetel);