package org.animals.org;


public class Bird extends Animal implements IVolante{
	private String specificType;
	private String dormi;
	private String mangia;
	public Bird(String type,String mangia, String dormi,String specificType) {
		super(type);
		setSpecificType(specificType);
		setDormi(dormi);
		setMangia(mangia);
	}
	public String getSpecificType() {
		return specificType;
	}
	public void setSpecificType(String specificType) {
		this.specificType = specificType;
	}
	public String getDormi() {
		return dormi;
	}
	public void setDormi(String dormi) {
		this.dormi = dormi;
	}
	public String getMangia() {
		return mangia;
	}
	public void setMangia(String mangia) {
		this.mangia = mangia;
	}
	@Override public String verso(){
		return "Cip Cip Cip";
	}
	@Override public void vola() {
		System.out.println("il canarino sta volando");
	}
	
	@Override public String toString(){
		return "l animale scelto per la nostra ricerca è della famiglia:" + getType()+
				"\nin particolare la sua sottofamiglia è: " + getSpecificType()
		+"\nl animale adesso dorme?" + getDormi() + "\nl animale cosa mangia?" +getMangia()
		+"\nil verso dell animale è:" + verso();
	}
}
