package scalereal.core.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lscalereal/core/authentication/RefreshTokenRepository;", "", "findByRefreshToken", "Lscalereal/core/models/RefreshTokenEntity;", "refreshToken", "", "save", "userId", "", "revoked", "", "updateByUsername", "core"})
public abstract interface RefreshTokenRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract scalereal.core.models.RefreshTokenEntity save(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken, boolean revoked);
    
    @org.jetbrains.annotations.Nullable()
    public abstract scalereal.core.models.RefreshTokenEntity findByRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken);
    
    public abstract long updateByUsername(long userId, boolean revoked);
}