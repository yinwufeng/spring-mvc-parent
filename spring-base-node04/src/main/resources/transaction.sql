CREATE TABLE user_account(
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50),
  money INT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;;
INSERT INTO user_account(username,money) VALUES('jack','5000');
INSERT INTO user_account(username,money) VALUES('tom','5000');
SELECT * FROM user_account ;