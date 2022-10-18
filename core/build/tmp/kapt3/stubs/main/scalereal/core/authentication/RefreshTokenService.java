package scalereal.core.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lscalereal/core/authentication/RefreshTokenService;", "", "refreshTokenRepository", "Lscalereal/core/authentication/RefreshTokenRepository;", "userRepository", "Lscalereal/core/user/UserRepository;", "(Lscalereal/core/authentication/RefreshTokenRepository;Lscalereal/core/user/UserRepository;)V", "findByRefreshToken", "Lkotlin/Pair;", "Lscalereal/core/models/domain/User;", "Lscalereal/core/models/RefreshTokenEntity;", "refreshToken", "", "getUser", "userName", "save", "token", "revoked", "", "updateByUsername", "", "core"})
@jakarta.inject.Singleton()
public final class RefreshTokenService {
    @jakarta.inject.Inject()
    private final scalereal.core.authentication.RefreshTokenRepository refreshTokenRepository = null;
    @jakarta.inject.Inject()
    private final scalereal.core.user.UserRepository userRepository = null;
    
    public RefreshTokenService(@org.jetbrains.annotations.NotNull()
    scalereal.core.authentication.RefreshTokenRepository refreshTokenRepository, @org.jetbrains.annotations.NotNull()
    scalereal.core.user.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final scalereal.core.models.RefreshTokenEntity save(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, boolean revoked) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<scalereal.core.models.domain.User, scalereal.core.models.RefreshTokenEntity> findByRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
        return null;
    }
    
    public final long updateByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, boolean revoked) {
        return 0L;
    }
    
    private final scalereal.core.models.domain.User getUser(java.lang.String userName) {
        return null;
    }
}