package test.vo;

/*
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
 */
public class BoardVo {
	private int num;
	private String writer;
	private String title;
	private String content;
	private int ref;
	private int lev;
	private int step;

	public BoardVo(int num, String writer, String title, String content, int ref, int lev, int step) {
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.ref = ref;
		this.lev = lev;
		this.step = step;
	}

	public BoardVo() {
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}
}
