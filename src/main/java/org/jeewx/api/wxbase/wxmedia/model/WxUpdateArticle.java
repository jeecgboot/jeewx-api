package org.jeewx.api.wxbase.wxmedia.model;

import org.jeewx.api.wxsendmsg.model.WxArticle;
/**
 * 修改消息素材
 * @author lihongxuan
 *
 */
public class WxUpdateArticle {
	private String media_id;
	private int index;
	//-- update-begin--Author:gengjiajia  Date:2016-11-28 for:TASK #1583 【图文管理】
	//原字段名称不符合微信接口条件
	//private WxArticle article = new WxArticle();
	private WxArticle articles = new WxArticle();
	//-- update-end--Author:gengjiajia  Date:2016-11-28 for:TASK #1583 【图文管理】
	

	public String getMedia_id() {
		return media_id;
	}



	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}



	public int getIndex() {
		return index;
	}



	public void setIndex(int index) {
		this.index = index;
	}



	/*public WxArticle getArticle() {
		return article;
	}



	public void setArticle(WxArticle article) {
		this.article = article;
	}
*/


	/*@Override
	public String toString() {
		return "WxArticlesRequest [media_id=" + media_id +"index=" + index +"article=" + article + "]";
	}*/



	public WxArticle getArticles() {
		return articles;
	}



	public void setArticles(WxArticle articles) {
		this.articles = articles;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WxUpdateArticle [media_id=");
		builder.append(media_id);
		builder.append(", index=");
		builder.append(index);
		builder.append(", articles=");
		builder.append(articles);
		builder.append("]");
		return builder.toString();
	}

}
