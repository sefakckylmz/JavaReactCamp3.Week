
public class UserManager  {
	
		public void join(User user) {
			System.out.println(user.getUsername()+" adlý kullanýcý sisteme katýldý");
		}
		public void leave(User user) {
			System.out.println(user.getUsername()+" adlý kullanýcý sistemden ayrýldý");
		}
}
