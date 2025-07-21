### lab02

볼륨을 사용하여 MySQL 데이터베이스의 데이터를 지속적으로 유지할 수 있도록 컨테이너를 구축하세요.

- 호스트에서 컨테이너에서 동작 중인 MySQL과 접속하여 아래와 같은 SQL문을 반영하세요

  ```sql
      CREATE DATABASE school;

      USE school;

      CREATE TABLE student (
          id INT AUTO_INCREMENT PRIMARY KEY,
          name VARCHAR(50),
          score INT
      );

      INSERT INTO student (name, score)
      VALUES
          ('Alice', 85),
          ('Bob', 92),
          ('Charlie', 78);
  ```
