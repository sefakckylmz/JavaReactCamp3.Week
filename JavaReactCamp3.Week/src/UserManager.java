
public class UserManager  {
	
		public void join(User user) {
			System.out.println(user.getUsername()+" adl� kullan�c� sisteme kat�ld�");
		}
		public void leave(User user) {
			System.out.println(user.getUsername()+" adl� kullan�c� sistemden ayr�ld�");
		}
}
