DELETE FROM files;

ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO files (name, path, size) VALUES
  ('f1', 'p1', 100000),
  ('f2', 'p2', 100004),
  ('f3', 'p3', 100005),
  ('f4', 'p4', 100006),
  ('f5', 'p5', 100007),
  ('f6', 'p6', 100008),
  ('f7', 'p7', 100009),
  ('f8', 'p8', 100401);