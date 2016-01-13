package ma.ecommerce.dao;

import java.util.List;
import javax.ejb.Local;
import ma.ecommerce.service.modele.Article;

@Local
public interface IDao {
	void saveArticle(Article article);

	List<Article> getArticleList();

	Article getArticle(Long id);

	List<Article> getArticleList(Article article);

	void deleteArticle(Long id);
}