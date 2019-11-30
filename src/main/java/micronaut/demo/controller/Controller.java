package micronaut.demo.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@io.micronaut.http.annotation.Controller("/demo")
public class Controller {

    @Get("sum/{a}/{r}")
    public int getSum(@PathVariable int a, @PathVariable int r) {
        System.out.println(a + "  " + r);
        return a + r;
    }
}
