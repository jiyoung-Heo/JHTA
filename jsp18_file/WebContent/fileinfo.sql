-- fileinfo.sql
drop table fileinfo;
create table fileinfo
(
	filenum number(5) primary key,   --  글번호
	writer varchar2(20), -- 작성자
	title varchar2(50),  -- 제목
	content varchar2(100), -- 내용
	orgfilename varchar2(150), -- 업로드된 파일명
	savefilename varchar2(150), -- 서버에 저장된 파일명
	filesize number -- 파일크기
);
create sequence fileinfo_seq;