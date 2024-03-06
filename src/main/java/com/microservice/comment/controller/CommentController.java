package com.microservice.comment.controller;

import com.microservice.comment.entity.Comment;
import com.microservice.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseEntity<?>  saveComment(@RequestBody Comment comment){
        Comment savedComment = commentService.saveComment(comment);
        if(savedComment!=null) {
            return new ResponseEntity<>(savedComment, HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Post Not Found with id: "+comment.getPostId(), HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{postId}")
    public List<Comment> getAllCommentsByPostId(@PathVariable String postId){
        return commentService.getCommentByPostId(postId);
    }
}