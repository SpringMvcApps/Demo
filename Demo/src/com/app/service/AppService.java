package com.app.service;

import com.app.dao.AppDao;

public class AppService {
	
	public void printMessage()
	{
		AppDao dao=new AppDao();
		dao.print();
	}

}
