insert into person (id, name, email) values (1, 'hoge', 'hoge@test.com');
insert into person (id, name, email) values (2, 'fuga', 'fuga@test.com');

insert into team (id, name) values (1, 'グループA');
insert into team (id, name) values (2, 'グループB');
insert into team (id, name) values (3, 'グループC');

insert into team_member(id, team_id, member_id) values (1, 1, 1);
insert into team_member(id, team_id, member_id) values (2, 2, 2);
insert into team_member(id, team_id, member_id) values (3, 3, 1);
insert into team_member(id, team_id, member_id) values (4, 3, 2);
