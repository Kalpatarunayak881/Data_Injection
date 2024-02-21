package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@Data
public class PatientInfo {
	@Value("10001")
 private int pid;
	@Value("${pi.name}")
 private String pname;
	@Value("${pi.mobileNo}")
 private Long mobileNo;
	@Value("${pi.addrs}")
 private String paddrs;
	@Value("#{dcc.xrayPrice+dcc.ctscanPrice+dcc.ecgPrice}")
 private double billamount;
	@Value("#{dcc.ecgPrice<=0}") //SPEL
 private boolean ecgFree;
	@Value("${os.name}")//To hold system property value
 private String osName;
	@Value("${Path}")//To hold environment variable value
 private String pathData;
	
	//Setters && Getters
public int getPid() { 
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getPaddrs() {
	return paddrs;
}
public void setPaddrs(String paddrs) {
	this.paddrs = paddrs;
}
public double getBillamount() {
	return billamount;
}
public void setBillamount(double billamount) {
	this.billamount = billamount;
}
public boolean isEcgFree() {
	return ecgFree;
}
public void setEcgFree(boolean ecgFree) {
	this.ecgFree = ecgFree;
}
public String getOsName() {
	return osName;
}
public void setOsName(String osName) {
	this.osName = osName;
}
public String getPathData() {
	return pathData;
}
public void setPathData(String pathData) {
	this.pathData = pathData;
}
@Override
public String toString() {
	return "PatientInfo [pid=" + pid + ", pname=" + pname + ", mobileNo=" + mobileNo + ", paddrs=" + paddrs
			+ ", billamount=" + billamount + ", ecgFree=" + ecgFree + ", osName=" + osName + ", pathData=" + pathData
			+ "]";
}

}
