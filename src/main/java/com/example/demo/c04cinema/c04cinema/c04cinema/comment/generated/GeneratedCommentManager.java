package com.example.demo.c04cinema.c04cinema.c04cinema.comment.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.comment.Comment;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.comment.Comment} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCommentManager extends Manager<Comment> {
    
    TableIdentifier<Comment> IDENTIFIER = TableIdentifier.of("c04cinema", "c04cinema", "comment");
    List<Field<Comment>> FIELDS = unmodifiableList(asList(
        Comment.ID,
        Comment.CUSTOMER_ID,
        Comment.MOVIE_ID,
        Comment.COMMENT,
        Comment.CREATE_DATE,
        Comment.REPLY_ONE_CUSTOM_ID,
        Comment.LIKE,
        Comment.EMOTION,
        Comment.REPLY_TWO_CUSTOM_ID
    ));
    
    @Override
    default Class<Comment> getEntityClass() {
        return Comment.class;
    }
}