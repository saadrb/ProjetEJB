package ma.ecommerce.domaine;


public class ArticleBean {
	private Long articleId;
	private String designation;
	private String categorie;
	private Double prix;
	private Double quantiteEnStock;
	private String articleMarque;
	private String[] articleTypes;
	
	public ArticleBean() {
	}
	public Long getArticleId() {
		return articleId;
	}
	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Double getQuantiteEnStock() {
		return quantiteEnStock;
	}
	public void setQuantiteEnStock(Double quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}
	public String[] getArticleTypes() {
		return articleTypes;
	}
	public void setArticleTypes(String[] articleTypes) {
		this.articleTypes = articleTypes;
	}
	public String getArticleMarque() {
		return articleMarque;
	}
	public void setArticleMarque(String articleMarque) {
		this.articleMarque = articleMarque;
	}
}
