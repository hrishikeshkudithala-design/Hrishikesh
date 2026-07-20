package coreproject1;
public class MobileRecharge {
  void main(String[] args) {
    System.out.println("Main method Started!");
    showPlanDetails();
    recharge(299);
    System.out.println("Main method Ended!");
	}
	void showPlanDetails() {
		System.out.println("Current recharge plan");
		System.out.println("Plan name : Unlimited 299");
		System.out.println("Validity : 28 Days");
		System.out.println("Data : 1.5 GB/Day");
		System.out.println("Calls : Unlimited");
	}
	void recharge(double amount) {
		System.out.println("Recharge Successful!");
		System.out.println("Recharge Amount: "+amount);
	}
}