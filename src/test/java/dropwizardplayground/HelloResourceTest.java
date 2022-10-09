package dropwizardplayground;

import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(DropwizardExtensionsSupport.class)
public class HelloResourceTest {
    private static final ResourceExtension EXT = ResourceExtension.builder()
            .addResource(new HelloResource())
            .build();

    @Test
    void testHelloEndpoint() {
        // when
        String response = EXT.target("/hello/World")
                .request()
                .get(String.class);

        // then
        assertEquals("Hello World", response);
    }
}
