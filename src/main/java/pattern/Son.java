package pattern;

public class Son extends Father {
	
	public Son(){
		System.out.println("son no -----");
	}

	/*
	public Son(String name, String message) {
		super(name, message);
		System.out.println("son-----");
	}
	*/

	@Override
	public String getInfo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("liuls");
		buffer.append("zhangdan");
		return buffer.toString() + super.getName();
	}
	
	

}
