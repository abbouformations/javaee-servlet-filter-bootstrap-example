package ma.formations.servlet.service;

import java.util.List;

import ma.formations.servlet.service.model.Article;

public interface IService {
	
	Boolean checkAccount(String username,String password);
	List<Article> getAllArticle();
}
