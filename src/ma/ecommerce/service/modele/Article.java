package ma.ecommerce.service.modele;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long articleId;
	@Column(unique = true)
	private String designation;
	private String categorie;
	private Double prix;
	private Double quantiteEnStock;
	private String articleTypes;
	private String marqueArticle;

	public String getMarqueArticle() {
		return marqueArticle;
	}

	public void setMarqueArticle(String marqueArticle) {
		this.marqueArticle = marqueArticle;
	}

	public Article() {
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

	public String getArticleTypes() {
		return articleTypes;
	}

	public void setArticleTypes(String articleTypes) {

		this.articleTypes = articleTypes;
	}
}