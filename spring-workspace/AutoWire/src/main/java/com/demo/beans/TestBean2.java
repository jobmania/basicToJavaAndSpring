package com.demo.beans;

public class TestBean2 {

	private DataBean2 data1;
	private DataBean2 data2;
	
	public TestBean2() {
		// 기본생성자
	}
	// DataBean2 타입 객체가 2개 필요함	
	public TestBean2(DataBean2 data1, DataBean2 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public DataBean2 getData1() {
		return data1;
	}
	public void setData1(DataBean2 data1) {
		this.data1 = data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	public void setData2(DataBean2 data2) {
		this.data2 = data2;
	}

}
