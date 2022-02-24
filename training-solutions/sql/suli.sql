CREATE DATABASE IF NOT EXISTS suli;
USE suli;

CREATE TABLE jegy (
	id INT NOT NULL AUTO_INCREMENT,
	ertek INT,
	leiras VARCHAR(10),
	datum DATE,
	PRIMARY KEY (id)
);

CREATE TABLE diak (
	id INT NOT NULL AUTO_INCREMENT,
	nev VARCHAR(30),
	szuldatum DATE,
	PRIMARY KEY (id)
);

CREATE TABLE naplo (
	id INT NOT NULL AUTO_INCREMENT,
	leiras VARCHAR(10),
	PRIMARY KEY (id)
);

ALTER TABLE jegy
ADD COLUMN diak_id INT NOT NULL;

ALTER TABLE diak
ADD COLUMN naplo_id INT NOT NULL;

SELECT @@autocommit;

SET @@autocommit = 1;

SELECT * FROM naplo, diak
WHERE naplo.id = diak.naplo_id;

SELECT *FROM naplo
JOIN diak ON naplo.id = diak.naplo_id;

SELECT * FROM jegy
JOIN diak ON diak.id = jegy.diak_id
JOIN naplo ON diak.naplo_id = naplo.id
WHERE jegy.datum BETWEEN '2022-01-05' AND '2022-01-11';

CREATE VIEW IF NOT EXISTS suli.temp AS
SELECT * FROM diak;

SELECT * FROM temp;

SELECT nev
FROM temp
WHERE id = 1;

SELECT MAX(ID) FROM diak;

SELECT @diak_id := MAX(ID) FROM diak;

INSERT INTO diak
VALUES ((@diak_id + 1), 'Kiss Anna', '2010-12-12', 1);

SELECT nev, AVG(jegy.ertek) FROM diak
JOIN jegy ON diak.id = jegy.diak_id
GROUP BY nev;

SELECT nev, ROUND(AVG(jegy.ertek)) FROM diak
JOIN jegy ON diak.id = jegy.diak_id
GROUP BY nev
HAVING AVG(jegy.ertek) < 4
ORDER BY nev DESC;


ALTER TABLE diak
ADD COLUMN taj VARCHAR(9);

ALTER TABLE diak
MODIFY taj VARCHAR(9) CHECK (CHAR_LENGTH(taj) = 9);