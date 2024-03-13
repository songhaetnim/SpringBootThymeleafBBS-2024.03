package com.example.abbs.entity;

import java.util.List;

public class SchDay {
	private int day;       // 1 ~ 31 일
	private int date;      // 요일, 0 - 일요일,....., 6 - 토요일
	private int isHoliday;
	private int isOtherMonth;
	private String sdate;    //20240313 <- 현재 년도 월 날짜
	private List<String> annvList;
	private List<Schedule> schedList;
	
	public SchDay() { }
	public SchDay(int day, int date, int isHoliday, int isOtherMonth, String sdate, List<String> annvList,
			List<Schedule> schedList) {
		this.day = day;
		this.date = date;
		this.isHoliday = isHoliday;
		this.isOtherMonth = isOtherMonth;
		this.sdate = sdate;
		this.annvList = annvList;
		this.schedList = schedList;
	}
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getIsHoliday() {
		return isHoliday;
	}
	public void setIsHoliday(int isHoliday) {
		this.isHoliday = isHoliday;
	}
	public int getIsOtherMonth() {
		return isOtherMonth;
	}
	public void setIsOtherMonth(int isOtherMonth) {
		this.isOtherMonth = isOtherMonth;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public List<String> getAnnvList() {
		return annvList;
	}
	public void setAnnvList(List<String> annvList) {
		this.annvList = annvList;
	}
	public List<Schedule> getSchedList() {
		return schedList;
	}
	public void setSchedList(List<Schedule> schedList) {
		this.schedList = schedList;
	}
}
