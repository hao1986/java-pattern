package format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static final SimpleDateFormat sDate = new SimpleDateFormat("yyyy-mm-dd");
	
	public static String getDate(Date date) {
		return sDate.format(date);
	}
	
	public static class DateThread1 extends Thread {
		public void run() {
			System.out.println("enter thread");
			try {
				this.join(2000);
				System.out.println(this.getName()+ "___" +DateUtil.getDate(new Date()));
			} catch (InterruptedException e) {
				System.out.println("run----");
			}
			
			
		}
		
	}
	
	public static  void main(String[] args) {
		System.out.println("sssss");
		for(int i=0;i< 5;i++){
		new DateThread1().start();
	}}
}


