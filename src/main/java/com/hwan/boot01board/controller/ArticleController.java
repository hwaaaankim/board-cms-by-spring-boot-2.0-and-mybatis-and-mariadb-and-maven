package com.hwan.boot01board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hwan.boot01board.dto.Article;
import com.hwan.boot01board.service.ArticleService;

import groovy.util.logging.Slf4j;
import jline.internal.Log;

@Controller
@Slf4j // 이걸 해야 log.info(..)가 가능
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/article/list")
	public String showList(Model amodel) {
		List<Article> list = articleService.getList();
		
		amodel.addAttribute("list", list);
		Log.info("list : " + list);
		
		return "article/list";
	}
}
