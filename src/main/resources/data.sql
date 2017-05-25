INSERT INTO country (id, name) VALUES
  (city_seq.nextval, 'BRAZIL'),
  (city_seq.nextval, 'UNITED STATES OF AMERICA');
INSERT INTO city (id, name, country_id) VALUES
  (city_seq.nextval, 'CURITIBA',1),
  (city_seq.nextval, 'SÃO PAULO',1),
  (city_seq.nextval, 'RIO DE JANEIRO',1),
  (city_seq.nextval, 'SALVADOR',1),
  (city_seq.nextval, 'NEW YORK',2),
  (city_seq.nextval, 'CHICAGO',2),
  (city_seq.nextval, 'HOUSTON',2),
  (city_seq.nextval, 'PHILADELPHIA',2),
  (city_seq.nextval, 'PHOENIX',2),
  (city_seq.nextval, 'LOS ANGELES',2);
commit;