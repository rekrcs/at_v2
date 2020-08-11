package com.sbs.bs.at_v2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sbs.bs.at_v2.dto.Article;
import com.sbs.bs.at_v2.util.Util;

@Service
public class ArticleService {
	public List<Article> getForPrintArticles() {
		List<Article> articles = new ArrayList<>();

		articles.add(new Article(1, Util.getNowDateStr(), Util.getNowDateStr(), false, "", true, "제목1", "내용1"));
		articles.add(new Article(2, Util.getNowDateStr(), Util.getNowDateStr(), false, "", true, "제목2", "내용2"));
		return articles;

	}
}
