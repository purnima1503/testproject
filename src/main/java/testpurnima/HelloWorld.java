package testpurnima;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String name);
    String getcitiesbycountry();
}
