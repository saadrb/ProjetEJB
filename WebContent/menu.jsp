<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="<s:url action="listArticle"/>"> <s:text name="menu1" /></a>
<br>
<s:url id="url" action="editArticle">
	<s:param name="id">
		<s:property value="-1" />
	</s:param>
</s:url>
<s:a href="%{url}">
	<s:text name="menu2" />
</s:a>