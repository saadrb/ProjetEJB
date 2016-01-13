package ma.ecommerce.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import ma.ecommerce.dao.IDao;
import ma.ecommerce.service.modele.Article;

@Stateless
public class ServiceImpl implements IService {
	@EJB(mappedName = "java:app/TP_Globale/DaoImpl")
	private IDao articleDao;

	public List<Article> getArticleList() {
		return articleDao.getArticleList();
	}

	public void saveArticle(Article article) {
		articleDao.saveArticle(article);
	}

	@Override
	public Article getArticle(Long id) {
		return articleDao.getArticle(id);
	}

	@Override
	public List<Article> getArticleList(Article article) {
		return articleDao.getArticleList(article);
	}

	@Override
	public void deleteArticle(Long id) {
		articleDao.deleteArticle(id);
	}
}