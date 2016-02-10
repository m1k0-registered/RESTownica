
START TRANSACTION;

INSERT INTO piaskownica (id, nazwa) VALUES (1, 'osiedlowa');
INSERT INTO piaskownica (id, nazwa) VALUES (2, 'prywatna');
INSERT INTO piaskownica (id, nazwa) VALUES (3, 'brrzydka');
INSERT INTO piaskownica (id, nazwa) VALUES (4, 'bezpieczna');

INSERT INTO dziecko (id, imie) VALUES (11, 'Imię');
INSERT INTO dziecko (id, imie) VALUES (12, 'Drugie Imię');

ALTER SEQUENCE hibernate_sequence RESTART WITH 1000;

COMMIT;