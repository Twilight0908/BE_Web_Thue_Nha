create database web_thue_nha;

use web_thue_nha;

insert into role(name)
values ('ROLE_ADMIN');
insert into role(name)
values ('ROLE_USER');

select *
from role;

insert into account(password, username, role_id)
values ('admin', 'admin', 1);
insert into account(password, username, role_id)
values ('user', 'user', 2);

select *
from account;
