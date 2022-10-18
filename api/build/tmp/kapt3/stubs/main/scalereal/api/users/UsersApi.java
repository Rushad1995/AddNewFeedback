package scalereal.api.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lscalereal/api/users/UsersApi;", "", "usersController", "Lscalereal/api/users/UsersController;", "(Lscalereal/api/users/UsersController;)V", "get", "Lio/micronaut/http/HttpResponse;", "id", "", "api"})
@io.micronaut.security.annotation.Secured(value = {"isAuthenticated()"})
@io.micronaut.http.annotation.Controller(value = "api/users")
public final class UsersApi {
    private final scalereal.api.users.UsersController usersController = null;
    
    public UsersApi(@org.jetbrains.annotations.NotNull()
    scalereal.api.users.UsersController usersController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    public final io.micronaut.http.HttpResponse<java.lang.Object> get(long id) {
        return null;
    }
}