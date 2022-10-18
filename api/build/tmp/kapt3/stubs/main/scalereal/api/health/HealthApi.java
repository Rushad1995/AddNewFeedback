package scalereal.api.health;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lscalereal/api/health/HealthApi;", "", "()V", "health", "Lio/micronaut/http/HttpResponse;", "Lscalereal/api/health/models/HealthResponse;", "api"})
@io.micronaut.http.annotation.Controller()
public final class HealthApi {
    
    public HealthApi() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Health status")
    @io.micronaut.http.annotation.Get(uri = "/api/health", produces = {"application/json"})
    @io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
    public final io.micronaut.http.HttpResponse<scalereal.api.health.models.HealthResponse> health() {
        return null;
    }
}