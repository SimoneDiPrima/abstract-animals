package org.animals.org;


public abstract class Animal {
	private String type;
	
	public Animal(String type) {
		setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public abstract String verso();
	public String toString(){
		return "l animale scelto per la nostra ricerca è:" + getType();
		
	}
	
	
}
