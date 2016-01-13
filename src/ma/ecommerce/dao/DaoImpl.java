package ma.ecommerce.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.ecommerce.service.modele.Article;

@Stateless
public class DaoImpl implements IDao {
	@PersistenceContext
	private EntityManager em;

	public void saveArticle(Article article) {
		em.merge(article);
	}

	@SuppressWarnings("unchecked")
	public List<Article> getArticleList() {
		return em.createQuery("select a from Article a").getResultList();
	}

	@Override
	public Article getArticle(Long id) {
		return em.find(Article.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getArticleList(Article article) {
		StringBuilder sb = new StringBuilder("select a from Article a where 1=1 ");
		if (article.getDesignation() != null && !article.getDesignation().equalsIgnoreCase(""))
			sb.append("and designation like :designation ");
		if (article.getPrix() != null)
			sb.append("and prix =:prix ");
		if (article.getMarqueArticle() != null && !article.getMarqueArticle().equalsIgnoreCase(""))
			sb.append("and marqueArticle like :marqueArticle ");
		if (article.getQuantiteEnStock() != null)
			sb.append("and quantiteEnStock =:quantiteEnStock ");
		if (article.getArticleTypes() != null && !article.getArticleTypes().equalsIgnoreCase(""))
			sb.append("and articleTypes like :articleTypes");
		Query q = em.createQuery(sb.toString());
		if (article.getDesignation() != null && !article.getDesignation().equalsIgnoreCase(""))
			q.setParameter("designation", article.getDesignation() + "%");
		if (article.getPrix() != null)
			q.setParameter("prix", article.getPrix());
		if (article.getMarqueArticle() != null && !article.getMarqueArticle().equalsIgnoreCase(""))
			q.setParameter("marqueArticle", article.getMarqueArticle() + "%");
		if (article.getQuantiteEnStock() != null)
			q.setParameter("quantiteEnStock", article.getQuantiteEnStock());
		if (article.getArticleTypes() != null && !article.getArticleTypes().equalsIgnoreCase(""))
			q.setParameter("articleTypes", "%" + article.getArticleTypes() + "%");
		return q.getResultList();
	}

	@Override
	public void deleteArticle(Long id) {
		Article a = em.find(Article.class, id);
		if (a != null)
			em.remove(a);
	}
}