create table greetings (
                           id SERIAL primary key ,
                           lang_code varchar(10) unique,
                           message text
);

INSERT INTO greetings (lang_code, message)
VALUES ('KR', '안녕하세요'),
       ('EN', 'Hello'),
       ('JP', 'こんにちは');
