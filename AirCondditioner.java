public class AirConditioner {

	private boolean ison;
	private String productName;
	int temperature;
	
	public Airconditioner (String productName) {
	
	}
	
	public void decreaseTemperature (){
	}
	
	public String getProductName (){
	return productName ;	
	}
	
	public int getTemperature () {
	return temperature ;
	}
	
	public void increaseTemperature (){
	
	}
	
	public boolean isOn (){
	return isOn ;
	}
	
	public void seton (boolean isOn) {
	this.isOn=isOn
	}
	
	public void setProductName (String productName) {
	this.productName=productName
	}
	
	public void setTemperature (int temperature) {
	this.temperature=temperature
	}

}
