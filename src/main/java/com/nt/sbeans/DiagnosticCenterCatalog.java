package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("dcc")
@Data
public class DiagnosticCenterCatalog {
	@Value("${dc.xrayRate}")
private double xrayPrice;
	@Value("${dc.ctscanRate}")
private double ctscanPrice;
	@Value("${dc.mriScanRate}")
private double MRIScanPrice;
	@Value("${dc.ecgRate}")
private double ecgPrice;

//setters && getters (getters are required for SPEL operation)
public double getXrayPrice() {
	return xrayPrice;
}
public double getCtscanPrice() {
	return ctscanPrice;
}
public double getMRIScanPrice() {
	return MRIScanPrice;
}
public double getEcgPrice() {
	return ecgPrice;
}
public void setXrayPrice(double xrayPrice) {
	this.xrayPrice = xrayPrice;
}
public void setCtscanPrice(double ctscanPrice) {
	this.ctscanPrice = ctscanPrice;
}
public void setMRIScanPrice(double mRIScanPrice) {
	MRIScanPrice = mRIScanPrice;
}
public void setEcgPrice(double ecgPrice) {
	this.ecgPrice = ecgPrice;
}
}
