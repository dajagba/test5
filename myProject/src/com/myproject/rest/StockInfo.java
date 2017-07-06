package com.myproject.rest;

public class StockInfo {

	private String stockTicker; 
	private String currentTime; 
	private String openPrice; 
	private String highPrice;
	private String lowPrice; 
	
	public StockInfo() 
	{}
	
	public StockInfo(String stockTicker, String currentTime, String openPrice, String highPrice, String lowPrice)
	{
		this.stockTicker = stockTicker; 
		this.currentTime = currentTime; 
		this.openPrice = openPrice; 
		this.highPrice = highPrice; 
		this.lowPrice = lowPrice; 
	}
	
	public String getStockTicker()
	{
		return stockTicker;
	}
	
	public void setStockTicker(String stockTicker)
	{
		this.stockTicker = stockTicker; 
	}
	
	public String getCurrentTime()
	{
		return currentTime; 
	}
	
	public void setCurrentTime(String currentTime) 
	{
		this.currentTime = currentTime; 
	}
	public String getOpenPrice()
	{
		return openPrice;
	} 
	public void setOpenPrice(String openPrice) 
	{
		this.openPrice = openPrice; 
	}
	public String getHighPrice()
	{
		return highPrice;
	}
	public void setHighPrice(String highPrice)
	{
		this.highPrice = highPrice; 
	}
	public String getLowPrice()
	{
		return lowPrice;
	}
	public void setLowPrice(String lowPrice)
	{
		this.lowPrice = lowPrice;
	}
}
