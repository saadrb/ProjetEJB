<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
b {
	color: navy;
	background-color: brown;
}
</style>
<title><s:text name="titre.principal" /></title>
</head>
<body>
	<h2>
		<s:text name="libelle.recherche" />
	</h2>
	<b> <s:form action="listArticle">
			<s:textfield name="designation" key="article.designation" />
			<s:textfield name="prix" key="article.prix" value="" />
			<s:textfield name="quantiteEnStock" key="article.quantiteEnStock"
				value="" />
			<s:radio name="categorie" key="article.categorie"
				list="{'Categore 1','Categorie 2','Categorie3'}" value="" />
			<s:select name="articleMarque" key="article.marque"
				list="%{#{'':'','marque1':'marque1','marque2':'marque2','marque3':'marque3','marque4':'marque4'}}"
				value="" />
			<s:checkboxlist name="articleTypes" key="article.type"
				list="{'Type1','Type2','Type3','Type4','Type5','Type6'}" value="" />
			<s:submit key="submit.Rechercher" align="center" />
		</s:form>
	</b>
	<s:if test="%{articles.isEmpty()}">
	</s:if>
	<s:else>
		<b><s:text name="result.list" /></b>
		<table border="1">
			<tr>
				<td><b><s:text name="article.designation" /></b></td>
				<td><b><s:text name="article.prix" /></b></td>
				<td><b><s:text name="article.quantiteEnStock" /></b></td>
				<td><b><s:text name="article.categorie" /></b></td>
				<td><b><s:text name="article.marque" /></b></td>
				<td><b><s:text name="article.type" /></b></td>
			</tr>
			<s:iterator value="articles">
				<tr>
					<td><s:property value="designation" /></td>
					<td><s:property value="prix" /></td>
					<td><s:property value="quantiteEnStock" /></td>
					<td><s:property value="categorie" /></td>
					<td><s:property value="articleMarque" /></td>
					<td><s:property value="articleTypes" /></td>
					<td><s:url id="url" action="editArticle">
							<s:param name="id">
								<s:property value="articleId" />
							</s:param>
						</s:url> <s:a href="%{url}">
							<s:text name="edit" />
						</s:a></td>
					<td><s:url id="url" action="deleteArticle">
							<s:param name="id">
								<s:property value="articleId" />
							</s:param>
						</s:url> <s:a href="%{url}">
							<s:text name="delete" />
						</s:a></td>
				</tr>

			</s:iterator>
		</table>
	</s:else>
</body>
</html>