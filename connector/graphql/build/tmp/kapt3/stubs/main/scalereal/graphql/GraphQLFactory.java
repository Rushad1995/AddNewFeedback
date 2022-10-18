package scalereal.graphql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\n"}, d2 = {"Lscalereal/graphql/GraphQLFactory;", "", "()V", "graphQL", "Lgraphql/GraphQL;", "resourceResolver", "Lio/micronaut/core/io/ResourceResolver;", "graphQLDataFetchers", "Lscalereal/graphql/GraphQLDataFetchers;", "Companion", "graphql"})
@io.micronaut.context.annotation.Factory()
public final class GraphQLFactory {
    @org.jetbrains.annotations.NotNull()
    public static final scalereal.graphql.GraphQLFactory.Companion Companion = null;
    private static final org.slf4j.Logger LOG = null;
    
    public GraphQLFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.inject.Singleton()
    @io.micronaut.context.annotation.Bean()
    public final graphql.GraphQL graphQL(@org.jetbrains.annotations.NotNull()
    io.micronaut.core.io.ResourceResolver resourceResolver, @org.jetbrains.annotations.NotNull()
    scalereal.graphql.GraphQLDataFetchers graphQLDataFetchers) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lscalereal/graphql/GraphQLFactory$Companion;", "", "()V", "LOG", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "graphql"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}