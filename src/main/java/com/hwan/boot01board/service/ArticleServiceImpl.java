package com.hwan.boot01board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwan.boot01board.dao.ArticleDao;
import com.hwan.boot01board.dto.Article;
import com.hwan.boot01board.util.CUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
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
	public long add(Map<String, Object> param) {
		articleDao.add(param);	
		
		log.info("newId : " + param.get("id"));
//		
//		BigInteger bigIntId = BigInteger.valueOf((long)param.get("id"));
//		long newId = bigIntId.longValue();
		
		return CUtil.getAsLong(param.get("id"));
	}
	
	@Override
	public int getTotalCount() {
		return articleDao.getTotalCount();
	}
}























