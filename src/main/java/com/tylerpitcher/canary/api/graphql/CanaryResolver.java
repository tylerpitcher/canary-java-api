package com.tylerpitcher.canary.api.graphql;

import com.tylerpitcher.canary.api.config.CanaryProperties;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Controller
public class CanaryResolver {

    private final CanaryProperties properties;

    CanaryResolver(CanaryProperties properties) {
        this.properties = properties;
    }

    @QueryMapping
    String msg() {
        return properties.msg();
    }

    @QueryMapping
    String echo(@Argument String msg) {
        return msg;
    }

    @SubscriptionMapping
    Flux<Integer> tick(@Argument Long intervalMs) {
        return Flux.interval(Duration.ofMillis(intervalMs))
                .map(Long::intValue);
    }
}
