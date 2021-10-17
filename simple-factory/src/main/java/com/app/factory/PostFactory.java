package com.app.factory;

import com.app.model.BlogPost;
import com.app.model.NewsPost;
import com.app.model.Post;
import com.app.model.ProductPost;

public class PostFactory {
	public static Post createPost(String postType) {
		switch(postType) {
		case  "blog":
			return new BlogPost();
		case "news":
			return new NewsPost();
		case "product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("Post type not supported");
		}
	}
}
