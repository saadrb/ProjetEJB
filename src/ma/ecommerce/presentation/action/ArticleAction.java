package ma.ecommerce.presentation.action;

import java.util.List;
import javax.ejb.EJB;
import ma.ecommerce.domaine.ArticleConverter;
import ma.ecommerce.domaine.ArticleBean;
import ma.ecommerce.service.IService;
import ma.ecommerce.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ArticleAction extends ActionSupport implements ModelDriven<ArticleBean> {
	private static final long serialVersionUID = 1L;
	@Autowired
	private ArticleBean articleBean;
	@EJB(mappedName = "java:app/TP_Globale/ServiceImpl")
	private IService articleService;
	private List<ArticleBean> articles;
	private Long id;

	public ArticleBean getArticleBean() {
		return articleBean;
	}

	public void setArticleBean(ArticleBean articleBean) {
		this.articleBean = articleBean;
	}

	public IService getArticleService() {
		return articleService;
	}

	public void setArticleService(ServiceImpl articleService) {
		this.articleService = articleService;
	}

	public void setArticles(List<ArticleBean> articles) {
		this.articles = articles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String execute() {
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "user";
	}

	public String add() {
		articleService.saveArticle(ArticleConverter.createModel(articleBean));
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "add";
	}

	public String edit() {
		if (id == -1)
			return "add";
		articleBean = ArticleConverter.createBean(articleService.getArticle(getId()));
		return "edit";
	}

	public String list() {
		articles = ArticleConverter
				.createArticleBeanList(articleService.getArticleList(ArticleConverter.createModel(articleBean)));
		return "list";
	}

	public String update() {
		articleService.saveArticle(ArticleConverter.createModel(articleBean));
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "list";
	}

	public String delete() {
		articleService.deleteArticle(id);
		articles = ArticleConverter.createArticleBeanList(articleService.getArticleList());
		return "list";
	}

	@Override
	public ArticleBean getModel() {
		return articleBean;
	}

	public List<ArticleBean> getArticles() {
		return articles;
	}

	public void setUsers(List<ArticleBean> articles) {
		this.articles = articles;
	}
}