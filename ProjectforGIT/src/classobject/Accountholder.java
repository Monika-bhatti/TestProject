package classobject;

public class Accountholder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibileforCreditCard;
	
	public void testEligibilityforCC() {
		
		if(age>23 && accountBalance>30000) {
			eligibileforCreditCard=true;
		}
	}

}
