package scalereal.graphql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lscalereal/graphql/GraphQLDataFetchers;", "", "dbRepository", "Lscalereal/graphql/DbRepository;", "(Lscalereal/graphql/DbRepository;)V", "authorDataFetcher", "Lgraphql/schema/DataFetcher;", "Lscalereal/core/models/graphql/Author;", "bookByIdDataFetcher", "Lscalereal/core/models/graphql/Book;", "graphql"})
@jakarta.inject.Singleton()
public final class GraphQLDataFetchers {
    private final scalereal.graphql.DbRepository dbRepository = null;
    
    public GraphQLDataFetchers(@org.jetbrains.annotations.NotNull()
    scalereal.graphql.DbRepository dbRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphql.schema.DataFetcher<scalereal.core.models.graphql.Book> bookByIdDataFetcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphql.schema.DataFetcher<scalereal.core.models.graphql.Author> authorDataFetcher() {
        return null;
    }
}