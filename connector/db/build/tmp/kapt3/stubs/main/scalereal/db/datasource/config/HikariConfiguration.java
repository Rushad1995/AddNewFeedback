package scalereal.db.datasource.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lscalereal/db/datasource/config/HikariConfiguration;", "", "maximumPoolSize", "", "leakDetectionThreshold", "", "(IJ)V", "getLeakDetectionThreshold", "()J", "getMaximumPoolSize", "()I", "db"})
@io.micronaut.context.annotation.ConfigurationProperties(value = "hikari-configuration")
public final class HikariConfiguration {
    private final int maximumPoolSize = 0;
    private final long leakDetectionThreshold = 0L;
    
    @io.micronaut.context.annotation.ConfigurationInject()
    public HikariConfiguration(int maximumPoolSize, long leakDetectionThreshold) {
        super();
    }
    
    public final int getMaximumPoolSize() {
        return 0;
    }
    
    public final long getLeakDetectionThreshold() {
        return 0L;
    }
}