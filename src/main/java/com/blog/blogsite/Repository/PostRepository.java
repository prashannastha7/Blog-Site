package com.blog.blogsite.Repository;

import com.blog.blogsite.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
