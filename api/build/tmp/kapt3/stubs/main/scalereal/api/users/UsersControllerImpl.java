package scalereal.api.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lscalereal/api/users/UsersControllerImpl;", "Lscalereal/api/users/UsersController;", "userService", "Lscalereal/core/user/UserService;", "(Lscalereal/core/user/UserService;)V", "get", "Lscalereal/api/common/Response;", "", "id", "", "api"})
@jakarta.inject.Singleton()
public final class UsersControllerImpl implements scalereal.api.users.UsersController {
    private final scalereal.core.user.UserService userService = null;
    
    public UsersControllerImpl(@org.jetbrains.annotations.NotNull()
    scalereal.core.user.UserService userService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public scalereal.api.common.Response<java.lang.Object> get(long id) {
        return null;
    }
}