package example.restlet.hello.service.rest;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import example.restlet.hello.service.HelloService;

public class HelloServiceResource extends ServerResource {

    private static HelloService helloService;

    //@Get
    @Get("json")
//    @Post("json")
//    @Path("/discover/")
    public String sayHello () {
        return helloService.sayHello();
    }

    public void setHelloService (HelloService helloService) {
        this.helloService = helloService;
    }
}