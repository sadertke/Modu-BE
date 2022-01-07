package com.nklcb.kream.entity.security;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -368786497L;

    public static final QUser user = new QUser("user");

    public final ListPath<com.nklcb.kream.entity.Board, com.nklcb.kream.entity.QBoard> boards = this.<com.nklcb.kream.entity.Board, com.nklcb.kream.entity.QBoard>createList("boards", com.nklcb.kream.entity.Board.class, com.nklcb.kream.entity.QBoard.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    public final StringPath email = createString("email");

    public final BooleanPath enabled = createBoolean("enabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.nklcb.kream.entity.Likes, com.nklcb.kream.entity.QLikes> likes = this.<com.nklcb.kream.entity.Likes, com.nklcb.kream.entity.QLikes>createList("likes", com.nklcb.kream.entity.Likes.class, com.nklcb.kream.entity.QLikes.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final StringPath provider = createString("provider");

    public final StringPath providerId = createString("providerId");

    public final StringPath username = createString("username");

    public final ListPath<UserRole, QUserRole> userRoles = this.<UserRole, QUserRole>createList("userRoles", UserRole.class, QUserRole.class, PathInits.DIRECT2);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

