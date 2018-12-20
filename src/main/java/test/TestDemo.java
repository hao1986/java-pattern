/**
 * 
 */
package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author Alice
 *    .?
 */
public class TestDemo {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestDemo.class);
	
	private static Properties properties = new Properties();
	
	static{
		System.out.println("start to static method!");
		try(InputStream isInputStream = new FileInputStream(new File("E:\\test"))){
			properties.load(isInputStream);
	} catch (FileNotFoundException e) {
		System.out.println("not fund " + e);
	LOG.info("Exception");	
	} catch (IOException e1) {
		LOG.info("IOException");
	}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello word!");
		
		//if(properties.isEmpty()){
		//	System.out.println("properties is null");
		//}
//
	//	System.out.println(properties.getProperty("name"));
		String aa="{\"order_pay_amt\":\"15.5\"}";
		JSONObject jsonObject = (JSONObject)JSON.parse(aa);
		
		System.out.println((String)jsonObject.get("order_pay_amt"));
		

	}

}
