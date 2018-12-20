package pattern.strategy;

public class ConcreteRole extends AbstractRole {

	@Override
	void display() {
		System.out.println("start IAction");
		super.excutor();
		System.out.println("end IAcion");
	}
	
	

}
