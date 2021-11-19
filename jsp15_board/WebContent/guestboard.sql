create table guestboard
(
	num number(5) primary key,
	writer varchar2(30),
	title varchar2(30),
	content varchar2(2000),
	ref number(5), --그룹번호
	lev number(5), --레벨(답글인지,답글의 답글인지,...새글:0,답글:1,답글의답글:2,...)
	step number(5) --그룹 내 출력순서
)
