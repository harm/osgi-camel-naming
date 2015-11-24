package nl.dovetail.esb.naming_client;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRoute extends RouteBuilder{
	private static final Logger LOG = LoggerFactory.getLogger(MyRoute.class);
	
	@Override
	public void configure() throws Exception {
		
		from("scheduler://myScheduler?delay=10000")
			.setBody(simple("From naming-client"))
			.bean("helloService", "sayHello");

		
	}

}
