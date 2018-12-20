package format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilThread {
	
	private static ThreadLocal<DateFormat> testLocal = new ThreadLocal<DateFormat>();
	
	private  DateFormat getDate() {
		DateFormat dateFormat= testLocal.get();
		if(dateFormat == null){
			System.out.println("enter getDate, dateFormat is null");
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			testLocal.set(dateFormat);
		}
		return dateFormat;
	}
	
	public  String getStringDate(Date date){
		return getDate().format(date);
	}
	



}
