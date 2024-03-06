package com.microservice.comment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    private String commentId;

    private String body;

    private String email;

    private String name;

    private String postId;

}