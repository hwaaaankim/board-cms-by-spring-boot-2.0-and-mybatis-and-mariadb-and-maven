package com.hwan.boot01board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwan.boot01board.dao.ArticleDao;
import com.hwan.boot01board.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
	ArticleDao articleDao;
	
	//	이제 ArticleService 는 데이터 관련해서는 모두 Dao에게 위임
	@Override
	public List<Article> getList() {
		
//		List<Article> list = new ArrayList<>();
//		
//		Article article01 = new Article(1, "2020-08-08 12:12:12", "제목01", "내용01");
//		Article article02 = new Article(2, "2020-08-08 12:12:12", "제목02", "내용02");
//		Article article03 = new Article(3, "2020-08-08 12:12:12", "제목03", "내용03");
//		
//		list.add(article01);
//		list.add(article02);
//		list.add(article03);
//		
//		return list;
		
		return articleDao.getList();
	}
	
	
	@Override
	public void add(Map<String, Object> param) {
		articleDao.add(param);	
	}
}























