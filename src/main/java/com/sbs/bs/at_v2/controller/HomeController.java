package com.sbs.bs.at_v2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Controller
public class HomeController {

	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕";
	}

	@RequestMapping("/usr/home/article")
	@ResponseBody
	public Article showArticle() {

		return new Article(1, "2020-07-28 12:12:12", "제목", "내용");
	}

	@RequestMapping("/usr/home/articleList")
	@ResponseBody
	public List<Article> showArticleList() {
		List<Article> list = new ArrayList<>();
		list.add(new Article(1, "2020-07-28 12:12:12", "제목", "내용"));
		list.add(new Article(2, "2020-07-28 12:12:12", "제목2", "내용2"));

		return list;
	}

	@RequestMapping("/usr/home/map")
	@ResponseBody
	public Map<String, Object> showMap() {
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("철수나이", 12);
		map.put("영희나이", 22);
		map.put("영숙나이", 32);
		return map;
	}
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Article {
	private int id;
	private String regDate;
	private String title;
	private String body;
}