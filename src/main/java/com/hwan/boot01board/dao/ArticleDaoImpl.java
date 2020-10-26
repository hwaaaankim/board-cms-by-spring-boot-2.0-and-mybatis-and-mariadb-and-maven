package com.hwan.boot01board.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hwan.boot01board.dto.Article;

@Component // 이렇게 선언해야 AutoWired에 의한 연결에 적용 된다
public class ArticleDaoImpl implements ArticleDao{
	
	@Override
	public List<Article> getList() {
		return null;
	}
}
