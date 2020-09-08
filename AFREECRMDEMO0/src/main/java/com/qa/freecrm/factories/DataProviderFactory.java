package com.qa.freecrm.factories;

import com.qa.freecrm.config.ConfigProvider;

public class DataProviderFactory {

	
	public static ExcelProvider getExcel()
	{
		ExcelProvider excel=new ExcelProvider();
		
		return excel;
	}
	
	public static ConfigProvider getConfig()
	{
		ConfigProvider config=new ConfigProvider();
		
		return config;
	}
	
	
}
