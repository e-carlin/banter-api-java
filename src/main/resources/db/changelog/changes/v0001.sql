create table "user" (
  id bigserial not null,
  email varchar(50) not null UNIQUE,
  primary key (id)
);

create table institution (
  id bigserial not null,
  name varchar(50) not null,
  plaid_ins_id varchar(100) not null,
  access_token varchar(100) not null,
  item_id varchar(100) not null UNIQUE,
  primary key (id)
);

create table account (
  id bigserial not null,
  user_id bigint not null references "user" (id),
  institution_id bigint not null references institution (id),
  name varchar(50) not null,
  plaid_id varchar(50) not null,
  available_balance numeric not null DEFAULT 0.00,
  current_balance numeric not null DEFAULT 0.00,
  type varchar(50) not null,
  primary key (id)
);