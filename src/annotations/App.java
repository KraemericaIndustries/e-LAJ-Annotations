package annotations;

public class App {

	public static void main(String[] args) {
 
		var user = new User(0l, "Thor");

		var rep = new Repository<User>();
		
		rep.save(user);
	}

}
