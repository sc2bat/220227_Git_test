package hash_test02;

public class Test220309_06 {
	public static void main(String[] args) {
		
		
	}
	
	public class User{
		private long id;
		private String name;
		private String email;
		
		@Override
		public int hashCode() {
			
			return 1;
		}
		
		@Override
		public boolean equals(Object o) {
			if(this == o) {
				return true;
			}
			if(o == null) {
				return false;
			}
			if(this.getClass() != o.getClass()) {
				return false;
			}
			User user = (User)o;
			
			
			return id == user.id && (name.equals(user.name) && email.equals(user.email));
		}
	}
}
