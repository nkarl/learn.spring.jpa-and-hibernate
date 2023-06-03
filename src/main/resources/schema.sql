CREATE TABLE IF NOT EXISTS course (
    id      BIGINT NOT NULL,
    name    VARCHAR(255) NOT NULL,
    author  VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO course (id, name, author)
VALUES(1, 'Learn AWS', 'in28minutes');
