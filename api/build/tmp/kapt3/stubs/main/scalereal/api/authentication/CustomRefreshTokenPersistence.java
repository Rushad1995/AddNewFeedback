package scalereal.api.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lscalereal/api/authentication/CustomRefreshTokenPersistence;", "Lio/micronaut/security/token/refresh/RefreshTokenPersistence;", "refreshTokenRepository", "Lscalereal/core/authentication/RefreshTokenService;", "(Lscalereal/core/authentication/RefreshTokenService;)V", "getAuthentication", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/security/authentication/Authentication;", "refreshToken", "", "persistToken", "", "event", "Lio/micronaut/security/token/event/RefreshTokenGeneratedEvent;", "api"})
@jakarta.inject.Singleton()
public final class CustomRefreshTokenPersistence implements io.micronaut.security.token.refresh.RefreshTokenPersistence {
    private final scalereal.core.authentication.RefreshTokenService refreshTokenRepository = null;
    
    public CustomRefreshTokenPersistence(@org.jetbrains.annotations.NotNull()
    scalereal.core.authentication.RefreshTokenService refreshTokenRepository) {
        super();
    }
    
    @java.lang.Override()
    public void persistToken(@org.jetbrains.annotations.Nullable()
    io.micronaut.security.token.event.RefreshTokenGeneratedEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.reactivestreams.Publisher<io.micronaut.security.authentication.Authentication> getAuthentication(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
        return null;
    }
}