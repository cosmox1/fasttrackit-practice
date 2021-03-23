package fasttrackit.vetclinicapplication.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RubitConfig {


    @Bean
    public DirectExchange direct() {
        return new DirectExchange("vetclinic");
    }
}
