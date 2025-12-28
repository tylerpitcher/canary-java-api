package com.tylerpitcher.canary.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "canary")
public record CanaryProperties(String msg) {
}
