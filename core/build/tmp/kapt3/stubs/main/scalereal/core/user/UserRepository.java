package scalereal.core.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lscalereal/core/user/UserRepository;", "", "finBy", "Lscalereal/core/models/domain/User;", "id", "", "userName", "", "core"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract scalereal.core.models.domain.User finBy(@org.jetbrains.annotations.NotNull()
    java.lang.String userName);
    
    @org.jetbrains.annotations.Nullable()
    public abstract scalereal.core.models.domain.User finBy(long id);
}