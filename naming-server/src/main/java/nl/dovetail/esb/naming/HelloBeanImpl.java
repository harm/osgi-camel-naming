package nl.dovetail.esb.naming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloBeanImpl implements HelloBean {
	
	private static Logger LOG = LoggerFactory.getLogger(HelloBeanImpl.class);
	
	public void sayHello(String body) {
		LOG.info("Hello world: " + body);
	}

}
