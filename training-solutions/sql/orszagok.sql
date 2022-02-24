SELECT * FROM orszagok
WHERE orszag LIKE 'M%';

SELECT COUNT(*) AS orszagok_száma
FROM orszagok
WHERE orszag LIKE 'M%';

SELECT * FROM orszagok
WHERE orszag LIKE 'M%'
ORDER BY orszag DESC;

SELECT DISTINCT foldrajzi_hely FROM orszagok;

SELECT COUNT(DISTINCT foldrajzi_hely) FROM orszagok;

SELECT orszag AS 'legsurubben_lakott_orszag' FROM orszagok
WHERE nepesseg = (SELECT MAX(nepesseg) FROM orszagok);

SELECT orszag AS 'legritkábban_lakott_orszag' FROM orszagok
WHERE nepesseg = (SELECT MIN(nepesseg) FROM orszagok);

SELECT AVG(terulet) AS 'orszagok_atlagterulete' FROM orszagok;

SELECT COUNT(orszag) AS 'atlagteruletnel_kisebb_teruletu_orszagok_szama' FROM orszagok
WHERE terulet < (SELECT AVG(terulet) FROM orszagok);

SELECT orszag, nepesseg
FROM orszagok
WHERE nepesseg > (SELECT AVG(nepesseg) FROM orszagok)
ORDER BY nepesseg DESC;

SELECT orszag, terulet, nepesseg
FROM orszagok
WHERE terulet = (SELECT MIN(terulet) FROM orszagok);

SELECT * FROM orszagok
WHERE ABS(terulet - (SELECT terulet FROM orszagok WHERE orszag = 'MAGYARORSZÁG')) < 10000
ORDER BY ABS(terulet - (SELECT terulet FROM orszagok WHERE orszag = 'MAGYARORSZÁG'));

SELECT * FROM orszagok
ORDER BY ABS(terulet - (SELECT terulet FROM orszagok WHERE orszag = 'MAGYARORSZÁG'))
LIMIT 3;

SELECT * FROM orszagok
WHERE foldrajzi_hely LIKE '%Europa%';