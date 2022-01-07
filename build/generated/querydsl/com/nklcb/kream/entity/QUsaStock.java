package com.nklcb.kream.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsaStock is a Querydsl query type for UsaStock
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsaStock extends EntityPathBase<UsaStock> {

    private static final long serialVersionUID = -1805292083L;

    public static final QUsaStock usaStock = new QUsaStock("usaStock");

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Likes, QLikes> likes = this.<Likes, QLikes>createList("likes", Likes.class, QLikes.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updateDate = createDateTime("updateDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public final StringPath writer = createString("writer");

    public QUsaStock(String variable) {
        super(UsaStock.class, forVariable(variable));
    }

    public QUsaStock(Path<? extends UsaStock> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsaStock(PathMetadata metadata) {
        super(UsaStock.class, metadata);
    }

}

