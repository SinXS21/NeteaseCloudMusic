package com.imooc.imooc_voice.model.newapi;

import java.util.List;

public class NewSongBean {

	private int code;
	private List<DailyRecommendBean.RecommendBean> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<DailyRecommendBean.RecommendBean> getData() {
		return data;
	}

	public void setData(List<DailyRecommendBean.RecommendBean> data) {
		this.data = data;
	}
}
