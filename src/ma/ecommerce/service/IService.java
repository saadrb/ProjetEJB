package ma.ecommerce.service;

import java.util.List;
import javax.ejb.Remote;
import ma.ecommerce.service.modele.Article;

@Remote
public interface IService {
	void saveArticle(Article article);

	List<Article> getArticleList();

	Article getArticle(Long id);

	List<Article> getArticleList(Article article);

	void deleteArticle(Long id);
}