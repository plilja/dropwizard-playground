package dropwizard-playground;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropwizard-playgroundApplication extends Application<dropwizard-playgroundConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizard-playgroundApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-playground";
    }

    @Override
    public void initialize(final Bootstrap<dropwizard-playgroundConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizard-playgroundConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
