
public class AccountAccess {
	public static void main(String[]args) {
		
		String correctPassword="password123";
		String correctUserame="user123";
		
		String enteredUsername="user123";
		String enteredPassword="password123";
		
		if(enteredUsername.equals(correctUserame)&&enteredPassword.equals(correctPassword)) {
			System.out.println("Access granted to the account.");
			
		}else {
			System.out.println("Access denied. Incorrect username or password.");
		}
		
		
	}

}
