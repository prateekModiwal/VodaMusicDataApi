package com.voda.repo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.voda.controller.Controller;
import com.voda.entity.Entity;
import com.voda.entity.MisEntity;
@Repository
public class Repo {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Value("${sql_query_sub_app}")
	private String sql_query_sub_app;
	@Value("${sql_query_sub_mobisite}")
	private String sql_query_sub_mobisite;
	@Value("${sql_query_bill_uu}")
	private String sql_query_bill_uu;
	@Value("${sql_query_bill_uu_app}")
	private String sql_query_bill_uu_app;
	@Value("${sql_query_bill_uu_mobisite}")
	String sql_query_bill_uu_mobisite;
	@Value("${sql_query_churn_vol}")
	String sql_query_churn_vol;
	@Value("${sql_query_churn_system}")
	String sql_query_churn_system;
	
	
	public Entity getEntity(MisEntity mis_day) {
		Logger LOGGER = LogManager.getLogger(Repo.class);
		LOGGER.info("mis_day passed to Repo==>"+mis_day);
		@SuppressWarnings("deprecation")
		int i=jdbcTemplate.queryForObject(sql_query_sub_app, new Object[] {Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day())},Integer.class);
		LOGGER.info("sql_query_sub_app==>"+i);
		//System.out.println(i);
		int j=jdbcTemplate.queryForObject(sql_query_sub_mobisite, new Object[] {Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day())},Integer.class);
		LOGGER.info("sql_query_sub_mobisite==>"+j);
		//System.out.println(j);
		int k =i+j;
		LOGGER.info("sql_query_total==>cv "+k);
		//System.out.println(k);
		int l=jdbcTemplate.queryForObject(sql_query_bill_uu, new Object[] {Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day())},Integer.class);
		LOGGER.info("sql_query_bill_uu==>"+l);
		//System.out.println(l);
		int m=jdbcTemplate.queryForObject(sql_query_bill_uu_app, new Object[] {Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day())},Integer.class);
		LOGGER.info("sql_query_bill_uu_app==>"+m);
		//System.out.println(m);
		int n=jdbcTemplate.queryForObject(sql_query_bill_uu_mobisite, new Object[] {Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day())},Integer.class);
		LOGGER.info("sql_query_bill_uu_mobisite==>"+n);
		//System.out.println(n);
		int o=jdbcTemplate.queryForObject(sql_query_churn_vol, new Object[] {Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day())},Integer.class);
		LOGGER.info("sql_query_churn_vol==>"+o);
		//System.out.println(o);
		int p=jdbcTemplate.queryForObject(sql_query_churn_system, new Object[] {Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day()),Integer.parseInt(mis_day.getMis_day())},Integer.class);
		LOGGER.info("sql_query_churn_system==>"+p);
		//System.out.println(p);
		return new Entity(Integer.toString(i),Integer.toString(j),Integer.toString(k),Integer.toString(l),Integer.toString(m),Integer.toString(n),Integer.toString(o),Integer.toString(p));
		
		
	}

}
