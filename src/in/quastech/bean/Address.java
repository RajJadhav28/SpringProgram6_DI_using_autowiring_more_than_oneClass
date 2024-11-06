package in.quastech.bean;

public class Address {
	private String name;
	private int pin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", pin=" + pin + "]";
	}
	
	

}
