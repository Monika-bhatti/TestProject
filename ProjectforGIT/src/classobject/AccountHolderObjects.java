package classobject;

public class AccountHolderObjects {
	public static void main(String[] args) {
		Accountholder tom = new Accountholder ();
		Accountholder monika = new Accountholder ();
		
		tom.firstName="Tom";
		tom.lastName="jack";
		tom.age=24;
		tom.accountBalance=35000;
		tom.testEligibilityforCC();
		System.out.println("Is tom Eligible:"+tom.eligibileforCreditCard);
		
		monika.firstName="Monika";
		monika.lastName="Bhatti";
		monika.age=24;
		monika.accountBalance=5000;
		monika.testEligibilityforCC();
		System.out.println("Is monika Eligible:"+monika.eligibileforCreditCard);
		
		

				
	}

}
