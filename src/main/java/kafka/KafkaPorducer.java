package kafka;


import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;






public class KafkaPorducer {
	private static final String TOPIC = "test"; //kafka创建的topic
    private static final String CONTENT = "This is a single message"; //要发送的内容  
	private static final String BROKER_LIST = "192.168.136.128:9092"; //broker的地址和端口  
	private static final String SERIALIZER_CLASS = "org.apache.kafka.common.serialization.StringSerializer";// 序列化类
	public static void main(String[] args){
	Properties props = new Properties();
	props.put("key.serializer",SERIALIZER_CLASS);
	props.put("value.serializer", SERIALIZER_CLASS);
	props.put("bootstrap.servers",BROKER_LIST);

	KafkaProducer<Object, String> producer = new KafkaProducer<Object, String>(props);

	ProducerRecord<Object, String> record = new ProducerRecord<Object, String>(TOPIC,CONTENT);
	producer.send(record);
	

	producer.close();
}
	
}
