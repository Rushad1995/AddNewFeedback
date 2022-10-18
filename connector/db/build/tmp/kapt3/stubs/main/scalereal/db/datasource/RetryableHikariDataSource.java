package scalereal.db.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lscalereal/db/datasource/RetryableHikariDataSource;", "Lcom/zaxxer/hikari/HikariDataSource;", "hikariConfiguration", "Lscalereal/db/datasource/config/HikariConfiguration;", "databaseConfiguration", "Lscalereal/db/datasource/config/DatabaseConfiguration;", "(Lscalereal/db/datasource/config/HikariConfiguration;Lscalereal/db/datasource/config/DatabaseConfiguration;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "maxRetries", "", "retriedCount", "getRetriedCount$annotations", "()V", "areRetryAttemptsExhausted", "", "calculateNextRetrySleepTime", "", "close", "", "getConnection", "Ljava/sql/Connection;", "getConnectionElseRetry", "db"})
@io.micronaut.context.annotation.Context()
public final class RetryableHikariDataSource extends com.zaxxer.hikari.HikariDataSource {
    private final int maxRetries = 2;
    private int retriedCount = 0;
    private final org.slf4j.Logger log = null;
    
    public RetryableHikariDataSource(@org.jetbrains.annotations.NotNull()
    scalereal.db.datasource.config.HikariConfiguration hikariConfiguration, @org.jetbrains.annotations.NotNull()
    scalereal.db.datasource.config.DatabaseConfiguration databaseConfiguration) {
        super();
    }
    
    @kotlin.Suppress(names = {"MutationRule"})
    @java.lang.Deprecated()
    private static void getRetriedCount$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.sql.Connection getConnection() {
        return null;
    }
    
    @java.lang.Override()
    @javax.annotation.PreDestroy()
    public void close() {
    }
    
    private final java.sql.Connection getConnectionElseRetry() {
        return null;
    }
    
    private final double calculateNextRetrySleepTime() {
        return 0.0;
    }
    
    private final boolean areRetryAttemptsExhausted() {
        return false;
    }
}