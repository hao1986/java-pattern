package pattern.strategy;

public abstract class AbstractRole {
	
	private IAction1 iAction1;
	
	private IAction2 iAction2;
	
	protected void excutor(){
		iAction1.excutorAction1();
		iAction2.excutorAction2();
	}
	
	public void setIAction1(IAction1 iAction1) {
		this.iAction1 = iAction1;
	}
	
	public void setIAction2(IAction2 iAction2) {
		this.iAction2 = iAction2;
	}
	
	abstract void display();

}
