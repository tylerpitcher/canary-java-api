package com.tylerpitcher.canary.api.v1;

import com.tylerpitcher.canary.api.config.CanaryProperties;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@Tag(name = "Canary", description = "Dummy controller for testing canary service.")
public class CanaryController {

    private final CanaryProperties properties;

    CanaryController(CanaryProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/msg")
    @Operation(
            summary = "Msg Endpoint",
            description = "Simple endpoint used to verify that the canary is responding with the msg.")
    String msg() {
        return properties.msg();
    }

    @PostMapping("/echo")
    @Operation(
            summary = "Echo Endpoint",
            description = "Echoes request string in body back to user.")
    String echo(@RequestBody String msg) {
        return msg;
    }
}
