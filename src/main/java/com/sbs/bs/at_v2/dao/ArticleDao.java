package com.sbs.bs.at_v2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.bs.at_v2.dto.Article;

@Mapper
public interface ArticleDao {
	List<Article> getForPrintArticles();
}
