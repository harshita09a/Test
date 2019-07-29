package com.cg.lab1.b;

public class SBU {
private int SbuId;
private String SbuName;
private String SbuHead;
public int getSbuId() {
	return SbuId;
}
public void setSbuId(int sbuId) {
	SbuId = sbuId;
}
public String getSbuName() {
	return SbuName;
}
public void setSbuName(String sbuName) {
	SbuName = sbuName;
}
public String getSbuHead() {
	return SbuHead;
}
public void setSbuHead(String sbuHead) {
	SbuHead = sbuHead;
}
@Override
public String toString() {
	return "sbu details=SBU [SbuId=" + SbuId + ", SbuName=" + SbuName + ", SbuHead="
			+ SbuHead + "]]";
}

}
