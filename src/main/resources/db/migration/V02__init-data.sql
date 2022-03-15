insert into person (name, email) values ('hoge', 'hoge@test.com');
insert into person (name, email) values ('fuga', 'fuga@test.com');

insert into `group` (name) values ('グループA');
insert into `group` (name) values ('グループB');
insert into `group` (name) values ('グループC');

insert into group_member(group_id, member_id) values (1, 1);
insert into group_member(group_id, member_id) values (2, 2);
insert into group_member(group_id, member_id) values (3, 1);
insert into group_member(group_id, member_id) values (3, 2);
