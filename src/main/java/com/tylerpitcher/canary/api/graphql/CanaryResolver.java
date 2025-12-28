package com.tylerpitcher.canary.api.graphql;

import com.tylerpitcher.canary.api.config.CanaryProperties;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CanaryResolver {

    private final CanaryProperties properties;

    CanaryResolver(CanaryProperties properties) {
        this.properties = properties;
    }

    @QueryMapping
    String canary() {
        return properties.msg();
    }
}
