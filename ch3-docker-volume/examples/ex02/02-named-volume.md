### PostgreSQL 컨테이너 실행 (Named volume 설정)

```bash
docker run --name pg-with-volume -e POSTGRES_PASSWORD=mysecret -p 5434:5432 -d -v pgdata:/var/lib/postgresql/data postgres
```

### 실행 중인 컨테이너 접속 && 데이터 생성

```bash
# 실행 중인 컨테이너 진입 && postgres 터미널로 바로 진입
docker exec -it pg-with-volume psql -U postgres

# 컨테이너 내부 postgres 터미널에서 아래 명령어 실행
postgres=# CREATE TABLE greetings (message TEXT NOT NULL);
CREATE TABLE
postgres=# \dt
           List of relations
 Schema |   Name    | Type  |  Owner
--------+-----------+-------+----------
 public | greetings | table | postgres
(1 row)

postgres=# INSERT INTO greetings (message) VALUES ('안녕하세요');
INSERT 0 1
postgres=# SELECT * FROM greetings;
  message
------------
 안녕하세요
(1 row)
```

### 컨테이너 삭제

```bash
docker rm -f pg-with-volume
```

### 컨테이너 재생성

```bash
docker run --name pg-with-volume -e POSTGRES_PASSWORD=mysecret -p 5434:5432 -d -v pgdata:/var/lib/postgresql/data postgres
```

### 컨테이너 접속 후 이전 데이터 남아있는지 확인

```bash
docker exec -it pg-with-volume psql -U postgres
SELECT * FROM greetings;
```
