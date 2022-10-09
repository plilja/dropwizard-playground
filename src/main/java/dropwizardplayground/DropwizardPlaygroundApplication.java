package dropwizardplayground;

import dropwizardplayground.DropwizardPlaygroundConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardPlaygroundApplication extends Application<DropwizardPlaygroundConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardPlaygroundApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizardplayground";
    }

    @Override
    public void initialize(Bootstrap<DropwizardPlaygroundConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(DropwizardPlaygroundConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new HelloResource());
    }

}
