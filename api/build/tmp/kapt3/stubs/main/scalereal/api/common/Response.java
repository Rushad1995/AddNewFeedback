package scalereal.api.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JL\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fJ\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lscalereal/api/common/Response;", "T", "", "status", "Lscalereal/api/common/ResponseType;", "message", "", "body", "headers", "", "", "(Lscalereal/api/common/ResponseType;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getHeaders", "()Ljava/util/Map;", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lscalereal/api/common/ResponseType;", "component1", "component2", "component3", "component4", "copy", "(Lscalereal/api/common/ResponseType;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)Lscalereal/api/common/Response;", "equals", "", "other", "getHttpResponse", "Lio/micronaut/http/HttpResponse;", "hashCode", "", "toString", "api"})
public final class Response<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final scalereal.api.common.ResponseType status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final T body = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.CharSequence, java.lang.CharSequence> headers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final scalereal.api.common.Response<T> copy(@org.jetbrains.annotations.NotNull()
    scalereal.api.common.ResponseType status, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    T body, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.CharSequence, ? extends java.lang.CharSequence> headers) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Response(@org.jetbrains.annotations.NotNull()
    scalereal.api.common.ResponseType status, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    T body, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.CharSequence, ? extends java.lang.CharSequence> headers) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final scalereal.api.common.ResponseType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final scalereal.api.common.ResponseType getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.CharSequence, java.lang.CharSequence> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.CharSequence, java.lang.CharSequence> getHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.HttpResponse<java.lang.Object> getHttpResponse() {
        return null;
    }
}