package testpurnima;

import javax.jws.WebService;

@WebService(endpointInterface = "testpurnima.HelloWorld",
            serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {
 
    public String sayHi(String name) {
        return "Hello " + name;
    }
    
    public String getcitiesbycountry() {
        return "nothing";
    }
}
