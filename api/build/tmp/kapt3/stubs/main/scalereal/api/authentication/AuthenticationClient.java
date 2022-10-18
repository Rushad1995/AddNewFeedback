package scalereal.api.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lscalereal/api/authentication/AuthenticationClient;", "", "login", "Lio/micronaut/security/token/jwt/render/BearerAccessRefreshToken;", "credentials", "Lio/micronaut/security/authentication/UsernamePasswordCredentials;", "api"})
@io.micronaut.http.client.annotation.Client(value = "/")
public abstract interface AuthenticationClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/login")
    public abstract io.micronaut.security.token.jwt.render.BearerAccessRefreshToken login(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    io.micronaut.security.authentication.UsernamePasswordCredentials credentials);
}