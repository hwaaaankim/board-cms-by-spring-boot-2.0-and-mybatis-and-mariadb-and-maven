package com.hwan.boot01board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.hwan.boot01board.dto.Article;

@Mapper 
// 이렇게 해주면 ArticleDao의 구현체를 마이바티스가 대신 구현 해준다
// ArticleDaoImpl을 만들 필요가 없음
public interface ArticleDao {

	public List<Article> getList();

	public void add(Map<String, Object> param);
}
