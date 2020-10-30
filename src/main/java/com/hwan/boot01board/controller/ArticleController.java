package com.hwan.boot01board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwan.boot01board.dto.Article;
import com.hwan.boot01board.service.ArticleService;

import groovy.util.logging.Slf4j;
import jline.internal.Log;

@Controller
@Slf4j // 이걸 해야 log.info(..)가 가능
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/article/detail")
	public String showDetail(Model model, long id) {
		Article article = articleService.getOne(id);
		
		model.addAttribute("article", article);
		
		return "article/detail";
	}
	
	@RequestMapping("/article/list")
	public String showList(Model model) {
		List<Article> list = articleService.getList();
		int totalCount = articleService.getTotalCount();
		
		model.addAttribute("list", list);
		model.addAttribute("totalCount", totalCount);
		Log.info("list : " + list);
		
		return "article/list";
	}
	
		
	@RequestMapping("/article/add")
	public String showAdd() {
		
		return "article/add";
	}
	
	@RequestMapping("/article/doAdd")
	@ResponseBody
	public String doAdd(@RequestParam Map<String, Object> param) {
		
		long newId = articleService.add(param);
		
		String msg = newId + "번 게시물이 추가 되었습니다";
		
		StringBuilder sb = new StringBuilder();
//		sb.append("<script>");
//		sb.append("alert('"+msg+"')");
//		sb.append("</script>");
		
		sb.append("alert('"+msg+"');");
		sb.append("location.replace('./detail?id="+newId+"');");
		sb.insert(0, "<script>");
		sb.append("</script>");
		
		return sb.toString();
		
	}
}
































