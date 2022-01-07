package com.nklcb.kream.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.nklcb.kream.dto.QUserBoardDto is a Querydsl Projection type for UserBoardDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QUserBoardDto extends ConstructorExpression<UserBoardDto> {

    private static final long serialVersionUID = -969145596L;

    public QUserBoardDto(com.querydsl.core.types.Expression<Long> userId, com.querydsl.core.types.Expression<String> username, com.querydsl.core.types.Expression<String> password, com.querydsl.core.types.Expression<Boolean> enabled, com.querydsl.core.types.Expression<String> email, com.querydsl.core.types.Expression<java.time.LocalDateTime> createDate, com.querydsl.core.types.Expression<Long> boardId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> content) {
        super(UserBoardDto.class, new Class<?>[]{long.class, String.class, String.class, boolean.class, String.class, java.time.LocalDateTime.class, long.class, String.class, String.class}, userId, username, password, enabled, email, createDate, boardId, title, content);
    }

    public QUserBoardDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> username, com.querydsl.core.types.Expression<Long> boardId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> content) {
        super(UserBoardDto.class, new Class<?>[]{long.class, String.class, long.class, String.class, String.class}, id, username, boardId, title, content);
    }

    public QUserBoardDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<Long> boardId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> content) {
        super(UserBoardDto.class, new Class<?>[]{long.class, long.class, String.class, String.class}, id, boardId, title, content);
    }

}

