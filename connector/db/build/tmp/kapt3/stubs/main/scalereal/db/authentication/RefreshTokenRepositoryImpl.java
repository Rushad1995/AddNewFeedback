package scalereal.db.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\r"}, d2 = {"Lscalereal/db/authentication/RefreshTokenRepositoryImpl;", "Lscalereal/core/authentication/RefreshTokenRepository;", "()V", "findByRefreshToken", "Lscalereal/core/models/RefreshTokenEntity;", "refreshToken", "", "save", "userId", "", "revoked", "", "updateByUsername", "db"})
@jakarta.inject.Singleton()
public final class RefreshTokenRepositoryImpl implements scalereal.core.authentication.RefreshTokenRepository {
    
    public RefreshTokenRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public scalereal.core.models.RefreshTokenEntity save(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken, boolean revoked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public scalereal.core.models.RefreshTokenEntity findByRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
        return null;
    }
    
    @java.lang.Override()
    public long updateByUsername(long userId, boolean revoked) {
        return 0L;
    }
}