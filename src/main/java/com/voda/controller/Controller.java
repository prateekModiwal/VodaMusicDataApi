package com.voda.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.voda.entity.Entity;
import com.voda.entity.MisEntity;
import com.voda.repo.Repo;
@RestController
public class Controller {
	Logger LOGGER = LogManager.getLogger(Controller.class);
	@Autowired
	Repo obj;
	@PostMapping("/")
	public Entity getObjectEntity(@RequestBody MisEntity mis_day)
	{
		LOGGER.info("mis_day"+mis_day);
		//obj.getEntity();
		//Entity object;
		return obj.getEntity(mis_day);
		//return object;
	}

}
