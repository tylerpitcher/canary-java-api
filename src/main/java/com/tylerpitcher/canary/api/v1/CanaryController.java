package com.tylerpitcher.canary.api.v1;

import com.tylerpitcher.canary.api.config.CanaryProperties;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/canary")
@Tag(name = "Canary", description = "Dummy controller for testing canary service.")
public class CanaryController {

    private final CanaryProperties properties;

    CanaryController(CanaryProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    @Operation(
            summary = "Canary Endpoint",
            description = "Simple endpoint used to verify that the canary is up and responding")
    String canary() {
        return properties.msg();
    }
}
