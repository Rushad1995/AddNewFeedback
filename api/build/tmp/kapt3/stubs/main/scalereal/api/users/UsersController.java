package scalereal.api.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lscalereal/api/users/UsersController;", "", "get", "Lscalereal/api/common/Response;", "id", "", "api"})
public abstract interface UsersController {
    
    @org.jetbrains.annotations.NotNull()
    public abstract scalereal.api.common.Response<java.lang.Object> get(long id);
}