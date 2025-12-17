package io.sparta.postapplication.domains.post.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.sparta.postapplication.domains.post.domain.model.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
}
