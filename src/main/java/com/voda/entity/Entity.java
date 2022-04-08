package com.voda.entity;

public class Entity {
	
	private String sub_app;
	private String sub_mobisite;
	private String sub_total;
	private String bill_uu;
	private String bill_uu_app;
	private String bill_uu_mobisite;
	private String churn_vol;
	private String churn_system;
	public Entity( String sub_app, String sub_mobisite,String sub_total, String bill_uu, String bill_uu_app,
			String bill_uu_mobisite, String churn_vol, String churn_system) {
		super();
		this.sub_total = sub_total;
		this.sub_app = sub_app;
		this.sub_mobisite = sub_mobisite;
		this.bill_uu = bill_uu;
		this.bill_uu_app = bill_uu_app;
		this.bill_uu_mobisite = bill_uu_mobisite;
		this.churn_vol = churn_vol;
		this.churn_system = churn_system;
	}
	public String getSub_total() {
		return sub_total;
	}
	public void setSub_total(String sub_total) {
		this.sub_total = sub_total;
	}
	public String getSub_app() {
		return sub_app;
	}
	public void setSub_app(String sub_app) {
		this.sub_app = sub_app;
	}
	public String getSub_mobisite() {
		return sub_mobisite;
	}
	public void setSub_mobisite(String sub_mobisite) {
		this.sub_mobisite = sub_mobisite;
	}
	public String getBill_uu() {
		return bill_uu;
	}
	public void setBill_uu(String bill_uu) {
		this.bill_uu = bill_uu;
	}
	public String getBill_uu_app() {
		return bill_uu_app;
	}
	public void setBill_uu_app(String bill_uu_app) {
		this.bill_uu_app = bill_uu_app;
	}
	public String getBill_uu_mobisite() {
		return bill_uu_mobisite;
	}
	public void setBill_uu_mobisite(String bill_uu_mobisite) {
		this.bill_uu_mobisite = bill_uu_mobisite;
	}
	public String getChurn_vol() {
		return churn_vol;
	}
	public void setChurn_vol(String churn_vol) {
		this.churn_vol = churn_vol;
	}
	public String getChurn_system() {
		return churn_system;
	}
	public void setChurn_system(String churn_system) {
		this.churn_system = churn_system;
	}

}
