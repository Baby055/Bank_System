CREATE TABLE app_user
(
    id uuid primary key ,
    email varchar not null unique ,
    password_hash varchar not null ,
    role varchar not null check ( role IN ('ADMIN', 'EMPLOYEE', 'CUSTOMER') ),
    active boolean not null default false
);

CREATE TABLE agency
(
    id uuid primary key ,
    code varchar not null unique ,
    name varchar not null unique ,
    address varchar not null ,
    phone varchar not null unique ,
    email varchar not null unique ,
    active boolean not null default false
);

CREATE TABLE customer
(
    id uuid primary key references app_user (id) on delete cascade ,
    first_name varchar not null ,
    last_name varchar not null
);

CREATE TABLE employee
(
    id uuid primary key references app_user (id) on delete cascade ,
    first_name varchar not null ,
    last_name varchar not null ,
    agency_id uuid not null references agency (id) on delete cascade
);

CREATE TABLE account
(
    id uuid primary key ,
    type varchar not null check ( type IN ('SAVINGS', 'CHECKING') ),
    balance NUMERIC(19,4) ,
    currency varchar not null ,
    status varchar not null check ( status IN ('ACTIVE', 'BLOCKED', 'CLOSED') ),
    customer_id uuid not null references customer (id) on delete cascade
);

CREATE TABLE beneficiary
(
    id uuid primary key ,
    first_name varchar not null ,
    last_name varchar not null ,
    beneficiary_account_id uuid not null references account (id) on delete cascade ,
    owner_customer_id uuid not null references customer (id) on delete cascade
);

CREATE TABLE transaction
(
    id uuid primary key ,
    type varchar not null check ( type IN ('DEPOSIT', 'WITHDRAWAL', 'TRANSFER') ),
    amount NUMERIC(19,4) ,
    source_account_id uuid not null references account (id) on delete cascade ,
    destination_account_id uuid not null references account (id) on delete cascade ,
    status varchar not null check ( status IN ('PENDING', 'COMPLETED', 'FAILED', 'CANCELLED') ),
    reference varchar not null unique ,
    date TIMESTAMPTZ not null
);

CREATE TABLE audit_log
(
    id uuid primary key ,
    created_at TIMESTAMPTZ ,
    actor_id uuid ,
    actor_email varchar not null unique ,
    action varchar not null check ( action IN ('CREATE', 'UPDATE', 'DELETE', 'LOGIN', 'LOGOUT', 'TRANSFER', 'ACTIVATE', 'DEACTIVATE') ),
    entity_type varchar not null check ( entity_type IN ('CUSTOMER', 'EMPLOYEE', 'ACCOUNT', 'TRANSACTION', 'BENEFICIARY', 'AGENCY', 'USER') ),
    details varchar
);
