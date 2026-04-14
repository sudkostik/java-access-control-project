
public class AccessControlSystem {
	public static void main (String[]args) {
		int userAge=22;
		boolean isMember=true;
		
		int ageThreshold=18;
		boolean isOldEnough=userAge>=ageThreshold;
		boolean hasAccess=isOldEnough&&isMember;
		
		if(hasAccess) {
			System.out.println("Access granted.Welcome!");
			
		}else if(!isOldEnough){
			System.out.println("Access denied.You must be at least"+ageThreshold);
			
			
		}else if(!isMember) {
			System.out.println("Access denied.You are not  a member");
		}
		
	
	}

}
