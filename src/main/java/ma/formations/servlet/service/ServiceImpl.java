package ma.formations.servlet.service;

import java.util.List;

import ma.formations.servlet.dao.DaoImpl;
import ma.formations.servlet.dao.IDao;
import ma.formations.servlet.dao.article.ArticleDaoImpl;
import ma.formations.servlet.dao.article.IArticleDao;
import ma.formations.servlet.service.model.Article;
import ma.formations.servlet.service.model.User;

public class ServiceImpl implements IService {
	private IDao dao = new DaoImpl();
	private IArticleDao daoArticle = new ArticleDaoImpl();

	@Override
	public Boolean checkAccount(String username, String password) {
		User u = dao.getUserByUsername(username);
		if (u == null)
			return false;
		return (password.equals(u.getPassword()));
	}

	@Override
	public List<Article> getAllArticle() {
		return daoArticle.findAll();
	}

}
