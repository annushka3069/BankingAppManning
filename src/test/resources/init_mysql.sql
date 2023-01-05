CREATE TABLE transactions(id BIGINT, type VARCHAR(50), date DATE,
account_number INT, currency VARCHAR(5), amount DOUBLE,
 merchant_name VARCHAR(50), merchant_logo VARCHAR(255));
INSERT INTO transactions VALUES (1, "CREDIT", "2020-09-30", 12345, "CAD",
                                 500.00, "MARCHETAU","IMAGE.PNG");
INSERT INTO transactions VALUES (2, "DEBIT", "2021-05-03", 6789, "USD",
                                 500.00, "SUPERSTORE","IMAGE.PNG");
INSERT INTO transactions VALUES (3, "DEBIT", "2022-07-20", 5432, "XOF",
                                 500.00, "BETTERBUY","IMAGE.PNG");
INSERT INTO transactions VALUES (4, "CREDIT", "2022-09-10", 0987, "JD",
                                 500.00, "PRORAMA","IMAGE.PNG");