package day09.db;

public interface MyDBMS {

	void connect(String id, String pwd);

	void disconnect();

	void select(String user);

	void update(String user);

	void delete(String user);

	void insert(String user);
}
