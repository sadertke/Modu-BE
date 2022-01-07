package com.nklcb.kream.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKoreaStock is a Querydsl query type for KoreaStock
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKoreaStock extends EntityPathBase<KoreaStock> {

    private static final long serialVersionUID = -1324983162L;

    public static final QKoreaStock koreaStock = new QKoreaStock("koreaStock");

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Likes, QLikes> likes = this.<Likes, QLikes>createList("likes", Likes.class, QLikes.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updateDate = createDateTime("updateDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public final StringPath writer = createString("writer");

    public QKoreaStock(String variable) {
        super(KoreaStock.class, forVariable(variable));
    }

    public QKoreaStock(Path<? extends KoreaStock> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKoreaStock(PathMetadata metadata) {
        super(KoreaStock.class, metadata);
    }

}

