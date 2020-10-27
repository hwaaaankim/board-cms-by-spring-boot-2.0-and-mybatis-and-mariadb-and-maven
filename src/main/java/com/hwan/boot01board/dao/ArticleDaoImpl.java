//package com.hwan.boot01board.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Component;
//
//import com.hwan.boot01board.dto.Article;
//
//@Component // 이렇게 선언해야 AutoWired에 의한 연결에 적용 된다
//public class ArticleDaoImpl implements ArticleDao{
//	
//	@Override
//	public List<Article> getList() {
//		
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
//	}
//}
