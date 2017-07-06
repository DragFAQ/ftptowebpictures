DROP TABLE IF EXISTS files;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE files
(
  id   INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name TEXT,
  path TEXT,
  size INTEGER,
  thumbnail TEXT
);




