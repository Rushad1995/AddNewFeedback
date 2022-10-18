package cps.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcps/api/DevDataSource;", "Lorg/postgresql/ds/PGSimpleDataSource;", "()V", "api_devOnly"})
@io.micronaut.context.annotation.Replaces(value = javax.sql.DataSource.class)
@io.micronaut.context.annotation.Context()
public final class DevDataSource extends org.postgresql.ds.PGSimpleDataSource {
    
    public DevDataSource() {
        super();
    }
}