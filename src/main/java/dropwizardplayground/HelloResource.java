package dropwizardplayground;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/hello")
public class HelloResource {
    @GET
    @Path("/{name}")
    public String helloWorld(@PathParam("name") String name) {
        return "Hello %s".formatted(name);
    }
}
