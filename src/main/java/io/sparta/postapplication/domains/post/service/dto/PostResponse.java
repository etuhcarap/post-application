package io.sparta.postapplication.domains.post.service.dto;

import java.time.LocalDateTime;

import io.sparta.postapplication.domains.post.domain.model.Post;

public record PostResponse(
	Long id,
	String title,
	String content,
	LocalDateTime createdAt
) {

	public static PostResponse of(Post post) {
		return new PostResponse(
			post.getId(),
			post.getTitle(),
			post.getContent(),
			post.getCreatedAt()
		);
	}
}
