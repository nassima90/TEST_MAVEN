package br.com.alexandreesl.handson;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

//We use @ConfigurationSpring annotation to indicate to the framework that is a resource configuraion class,
// we set the jersey , which is our ResourceManager responsible for exposing REST services for the consumers.
@Configuration
public class ApplicationConfig {
    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
            this.packages("br.com.alexandreesl.handson.rest");
        }
    }
}