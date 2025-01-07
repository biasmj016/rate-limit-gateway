package com.ratelimit.gateway.config;

import com.ratelimit.gateway.resolver.CustomKeyResolver;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder, RedisRateLimiter redisRateLimiter) {
        return builder.routes()
                .route("example_route", r -> r.path("/api/**")
                        .filters(f -> f.requestRateLimiter(c -> c
                                .setRateLimiter(redisRateLimiter)
                                .setKeyResolver(new CustomKeyResolver())))
                        .uri("http://localhost:8082"))
                .build();
    }

    @Bean
    public RedisRateLimiter redisRateLimiter() {
        return new RedisRateLimiter(10, 20);
    }
}