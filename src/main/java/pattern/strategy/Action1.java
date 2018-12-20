package pattern.strategy;

public class Action1 implements IAction1 {

	@Override
	public String excutorAction1() {
		System.out.println("Action1 excutorAction1");
		return "excutorAction1";
	}

}
