package scalereal.api.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tH\u0016\u00a8\u0006\n"}, d2 = {"Lscalereal/api/authentication/AuthenticationProviderUserPassword;", "Lio/micronaut/security/authentication/AuthenticationProvider;", "()V", "authenticate", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/security/authentication/AuthenticationResponse;", "httpRequest", "Lio/micronaut/http/HttpRequest;", "authenticationRequest", "Lio/micronaut/security/authentication/AuthenticationRequest;", "api"})
@jakarta.inject.Singleton()
public final class AuthenticationProviderUserPassword implements io.micronaut.security.authentication.AuthenticationProvider {
    
    public AuthenticationProviderUserPassword() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.reactivestreams.Publisher<io.micronaut.security.authentication.AuthenticationResponse> authenticate(@org.jetbrains.annotations.Nullable()
    io.micronaut.http.HttpRequest<?> httpRequest, @org.jetbrains.annotations.NotNull()
    io.micronaut.security.authentication.AuthenticationRequest<?, ?> authenticationRequest) {
        return null;
    }
}