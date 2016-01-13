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
	<h2>Modification de l'article</h2>
	<b> <s:form action="updateArticle">
			<s:textfield name="designation" key="article.designation"
				value="%{articleBean.designation}" />
			<s:textfield name="prix" key="article.prix"
				value="%{articleBean.prix}" />
			<s:textfield name="quantiteEnStock" key="article.quantiteEnStock"
				value="%{articleBean.quantiteEnStock}" />
			<s:radio name="categorie" key="article.categorie"
				list="{'Categore 1','Categorie 2','Categorie3'}"
				value="%{articleBean.categorie}" />
			<s:select name="articleMarque" key="article.marque"
				value="%{articleBean.articleMarque}"
				list="%{#{'marque1':'marque1','marque2':'marque2','marque3':'marque3','marque4':'marque4'}}" />
			<s:checkboxlist name="articleTypes" key="article.type"
				value="%{articleBean.articleTypes}"
				list="{'Type1','Type2','Type3','Type4','Type5','Type6'}" />
			<s:submit key="submit.Modifier" align="center" />
		</s:form>
	</b>
</body>
</html>