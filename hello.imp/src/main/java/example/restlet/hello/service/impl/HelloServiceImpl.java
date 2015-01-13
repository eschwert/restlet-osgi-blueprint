package example.restlet.hello.service.impl;

import example.restlet.hello.service.HelloService;


public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello";
    }

//    @Override
//    public Response sayHelloRes() {
//        return Response.ok().entity( "Yes, it works." ).build();
//    }

}
