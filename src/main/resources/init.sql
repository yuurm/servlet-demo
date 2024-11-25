-- Создание таблиц
CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(100),
                       email VARCHAR(100)
);

CREATE TABLE accounts (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          user_id INT,
                          balance DECIMAL(10, 2),
                          FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE transactions (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              account_id INT,
                              amount DECIMAL(10, 2),
                              transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              FOREIGN KEY (account_id) REFERENCES accounts(id)
);

-- Добавление данных
INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com');
INSERT INTO accounts (user_id, balance) VALUES (1, 1000.00);
INSERT INTO transactions (account_id, amount) VALUES (1, 500.00);
