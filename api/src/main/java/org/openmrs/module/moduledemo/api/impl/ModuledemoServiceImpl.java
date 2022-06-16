/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.moduledemo.api.impl;

import java.util.List;

import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.moduledemo.Item;
import org.openmrs.module.moduledemo.api.ModuledemoService;
import org.openmrs.module.moduledemo.api.dao.ModuledemoDao;

public class ModuledemoServiceImpl extends BaseOpenmrsService implements ModuledemoService {
	
	ModuledemoDao dao;
	
	UserService userService;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(ModuledemoDao dao) {
		this.dao = dao;
	}
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public Item getItemByUuid(String uuid) throws APIException {
		return dao.getItemByUuid(uuid);
	}
	
	@Override
	public Item saveItem(Item item) throws APIException {
		if (item.getOwner() == null) {
			item.setOwner(userService.getUser(1));
		}
		
		return dao.saveItem(item);
	}
	
	@Override
	public Item updateItem(Item item) throws APIException {
		// TODO Auto-generated method stub
		return dao.updateItem(item);
	}
	
	@Override
	public Item getItem(Integer id) throws APIException {
		// TODO Auto-generated method stub
		return dao.getItem(id);
	}
	
	@Override
	public Item deleteItem(Item item) throws APIException {
		// TODO Auto-generated method stub
		return dao.deleteItem(item);
	}
	
	@Override
	public List<Item> getAllItems() throws APIException {
		// TODO Auto-generated method stub
		return dao.getAllItems();
	}
}
