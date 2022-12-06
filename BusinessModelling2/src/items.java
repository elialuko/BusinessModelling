public class items {
	public String itemName;
	public String itemType;
	public String expiryDate;
	public int random;
	public int random1;


public items() {
	
	this.itemName="";
	this.itemType="";
	this.expiryDate="";
    this.random=0;
    this.random1=0;

}
public items(String itemName , String itemType, String expiryDate , int random , int random1) {
	this.itemName= itemName;
	this.itemType=itemType;
	this.expiryDate = expiryDate;
    this.random= random;
    this.random= random1;


}
public void setItemName(String itemName){
	this.itemName = itemName;
}
public void itemType(String itemType){
	this.itemType= itemType;
}
public void setExpiryDate(String expiryDate){
	this.expiryDate= expiryDate;
}

public String getItemName(){
	return itemName;
}
public String getItemType(){
	return itemType;
}
public String getExpiryDate(){
	return expiryDate;
}
public int getRandom(){
	return random;
}
public void setRandom(int random){
	 this.random = random;
}
public int getRandom1(){
	return random1;
}
public void setRandom1(int random1){
	 this.random1 = random1;
}

}