SELECT @@autocommit;

SET autocommit = 0;

START TRANSACTION;

DELETE FROM orszagok;

SELECT COUNT(*) FROM orszagok;

ROLLBACK;

SELECT @@autocommit;

SET @@autocommit = 1;