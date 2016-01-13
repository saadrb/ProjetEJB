package ma.ecommerce.domaine;

import java.util.ArrayList;
import java.util.List;
import ma.ecommerce.service.modele.Article;

public class ArticleConverter {
	public static Article createModel(ArticleBean articleBean) {
		Article article = new Article();
		article.setArticleId(articleBean.getArticleId());
		article.setDesignation(articleBean.getDesignation());
		article.setCategorie(articleBean.getCategorie());
		article.setPrix(articleBean.getPrix());
		article.setQuantiteEnStock(articleBean.getQuantiteEnStock());
		article.setMarqueArticle(articleBean.getArticleMarque());
		article.setArticleTypes(convertArrayToCsv(articleBean.getArticleTypes()));
		return article;
	}

	public static ArticleBean createBean(Article article) {
		ArticleBean articleBean = new ArticleBean();
		articleBean.setArticleId(article.getArticleId());
		articleBean.setDesignation(article.getDesignation());
		articleBean.setCategorie(article.getCategorie());
		articleBean.setPrix(article.getPrix());
		articleBean.setQuantiteEnStock(article.getQuantiteEnStock());
		articleBean.setArticleMarque(article.getMarqueArticle());
		articleBean.setArticleTypes(convertCsvToArr(article.getArticleTypes()));
		return articleBean;
	}

	public static List<ArticleBean> createArticleBeanList(List<Article> articles) {
		List<ArticleBean> beans = new ArrayList<ArticleBean>();
		ArticleBean articleBean = null;
		for (Article article : articles) {
			articleBean = new ArticleBean();
			articleBean.setArticleId(article.getArticleId());

			articleBean.setDesignation(article.getDesignation());
			articleBean.setCategorie(article.getCategorie());
			articleBean.setPrix(article.getPrix());
			articleBean.setQuantiteEnStock(article.getQuantiteEnStock());
			articleBean.setArticleMarque(article.getMarqueArticle());
			articleBean.setArticleTypes(convertCsvToArr(article.getArticleTypes()));
			beans.add(articleBean);
		}
		return beans;
	}

	public static String convertArrayToCsv(String[] arr) {
		if (arr == null || arr.length == 0)
			return null;
		StringBuilder csv = new StringBuilder("");
		for (String value : arr) {
			csv.append(value).append(",");
		}
		return csv.substring(0, csv.lastIndexOf(","));
	}

	public static String[] convertCsvToArr(String csv) {
		String[] values = csv.split(",");
		return values;
	}
}