drop table myboard;
create table myboard
(
	num number(5) primary key, 
	writer varchar2(10),
	title varchar2(10), 
	content varchar2(50), 
	regdate date
);
create sequence myboard_seq;