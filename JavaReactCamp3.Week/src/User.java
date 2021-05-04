
public class User {
int id;
int passaword;
String username;

public User(int id, int passaword, String username) {
	super();
	this.id = id;
	this.passaword = passaword;
	this.username = username;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPassaword() {
	return passaword;
}

public void setPassaword(int passaword) {
	this.passaword = passaword;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

}
