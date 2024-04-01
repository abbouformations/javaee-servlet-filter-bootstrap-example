package ma.formations.servlet.dao.article;

import java.util.List;

import ma.formations.servlet.service.model.Article;

public interface IArticleDao {
	List<Article> findAll();

}
