package ma.formations.servlet.dao.article;

import java.util.ArrayList;
import java.util.List;

import ma.formations.servlet.service.model.Article;

public class ArticleDaoImpl implements IArticleDao{
	private static List<Article>  articles=new ArrayList<Article>();
	
	static {
		articles.add(new Article(1, "PC PRTABLE HP", 30D, 15000d));
		articles.add(new Article(2, "PC PRTABLE DELL", 20D, 12000d));
		articles.add(new Article(3, "TV LG", 100d, 7500d));
		articles.add(new Article(4, "TV SONY", 10d, 8500d));
		articles.add(new Article(5, "CAMERA SONY", 12d, 2500d));
		articles.add(new Article(6, "DD 100G", 27D, 500D));
	}

	@Override
	public List<Article> findAll() {
		return articles;
	}

}
