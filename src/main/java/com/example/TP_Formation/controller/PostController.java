package com.example.TP_Formation.controller;

import com.example.TP_Formation.model.Comment;
import com.example.TP_Formation.model.Post;
import com.example.TP_Formation.repository.CommentRepository;
import com.example.TP_Formation.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    // الحصول على كل المقالات
    @GetMapping
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // إضافة مقالة جديدة
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    // إضافة تعليق لمقالة معينة (نرسل id المقالة في الرابط)
    @PostMapping("/{postId}/comments")
    public Comment addComment(@PathVariable Long postId, @RequestBody Comment comment) {
        Post post = postRepository.findById(postId).orElseThrow();
        comment.setPost(post);
        return commentRepository.save(comment);
    }
}
