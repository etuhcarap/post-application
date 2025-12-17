package io.sparta.postapplication.domains.post.service.dto;

import io.sparta.postapplication.domains.post.domain.model.Post;

public record RegisterPostRequest(
	String title,
	String content
) {
	public Post toEntity() {
		return new Post(title, content);
	}
}
