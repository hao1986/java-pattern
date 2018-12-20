package pattern.Factory;

import pattern.Factory.factory.MutilFactory1;
import pattern.Factory.factory.MutilFactory2;
import pattern.Factory.factory.NormalFactory;
import pattern.Factory.factory.StaticFactory1;
import pattern.Factory.factory.StaticFactory2;
import pattern.Factory.service.Provider;

public class Test {

	public static void main(String[] args) {
		/**
		 * 普通工厂模式测试
		 */
		NormalFactory normalFactory = new NormalFactory();
		System.out.println(normalFactory.getSender("mail"));
		System.out.println(normalFactory.getSender("ftp"));
		
		/**
		 *多个工厂模式测试
		 */
		MutilFactory1 mutilFactory1 = new MutilFactory1();
		System.out.println(mutilFactory1.getSender());
		MutilFactory2 mutilFactory2 = new MutilFactory2();
		System.out.println(mutilFactory2.getSender());
		
		/**
		 * 静态工厂模式测试
		 */
		System.out.println(StaticFactory1.getSender());
		System.out.println(StaticFactory2.getSender());
		
		/**
		 * 抽象工厂模式测试
		 */
		Provider provider1 = new MailProvider();
		System.out.println(provider1.getSender());
		Provider provider2 = new FtpProvider();
		System.out.println(provider2.getSender());

	}

}
