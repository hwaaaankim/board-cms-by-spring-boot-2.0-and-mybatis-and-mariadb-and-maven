package com.hwan.boot01board.service;

import java.util.List;
import java.util.Map;

import com.hwan.boot01board.dto.Article;

public interface ArticleService {
	
	public List<Article> getList();

	public void add(Map<String, Object> param);
}
