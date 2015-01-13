package example.restlet.hello.service.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class HelloServiceApplication extends Application {

    public synchronized Restlet createInboundRoot() {
        Router router = new Router(getContext());

        router.attach("/hello", HelloServiceResource.class);

        return router;
    }
}
