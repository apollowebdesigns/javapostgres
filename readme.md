# use postgres and spring boot

## List users

\du

via sql:

SELECT u.usename AS "User name",
  u.usesysid AS "User ID",
  CASE WHEN u.usesuper AND u.usecreatedb THEN CAST('superuser, create
database' AS pg_catalog.text)
       WHEN u.usesuper THEN CAST('superuser' AS pg_catalog.text)
       WHEN u.usecreatedb THEN CAST('create database' AS
pg_catalog.text)
       ELSE CAST('' AS pg_catalog.text)
  END AS "Attributes"
FROM pg_catalog.pg_user u
ORDER BY 1;

## List all databases

\l

## Create table procedure

CREATE TABLE users (
    id        char(5),
    username       varchar(40)
);

## Adding data with sql to user table

INSERT INTO users (id, username) VALUES
    ('B6717', 'testuser'),
    ('HG120', 'seconduser');
    
## grant all privileges 

grant all privileges on users to postgres;

## gotchas

needs getters for the crud repository class to work properly!

weird quirk