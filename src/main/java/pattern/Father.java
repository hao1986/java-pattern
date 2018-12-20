package pattern;

public class Father {
	
	private String name;
	
	private String message;
	
	public Father(){
		System.out.println("farther---------11");
	}
	
	
	public Father(String name , String message){
		System.out.println("father-------");
		this.name = name;
		this.message = message;
	}
	
	public String getInfo(){
		System.out.println("getInfo ----");
		return name + message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
