package day09;

import day09.db.MyOracleDBMS;
import day09.db.MySqlDBMS;

public class Test06_interface {
	public static void main(String[] args) {
		MyOracleDBMS db = new MyOracleDBMS();
		db.connect("test", "1234");
		db.select("ȫ�浿1");
		db.delete("ȫ�浿2");
		db.update("ȫ�浿3");
		db.insert("ȫ�浿4");
		db.disconnect();
		MySqlDBMS sql = new MySqlDBMS();
		sql.connect("test", "1234");
		sql.select("ȫ�浿1");
		sql.delete("ȫ�浿2");
		sql.update("ȫ�浿3");
		sql.insert("ȫ�浿4");
		sql.disconnect();
	}
}
