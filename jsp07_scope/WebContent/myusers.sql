create table myusers
(
    id varchar2(20) primary key,
    pwd varchar2(20),
    email varchar2(20)
);
insert into myusers values('user1','1111','user1@test.com');

insert into myusers values('user2','2222','user2@test.com');