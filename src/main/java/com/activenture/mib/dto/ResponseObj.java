/**
 * 
 */
package com.activenture.mib.dto;

import java.util.List;

/**
 * @author Sandip
 *
 */
public class ResponseObj {
	int staus;
	String msg;
	List data;
	
	
	public int getStaus() {
		return staus;
	}
	public void setStaus(int staus) {
		this.staus = staus;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	

}
