package week1.day2;

public class MyMobile
{
    String objectCategory = " Mobile Phone";
	float size; // declaration; initilization
	String shape;
	String IMEI;
	char brandName;
	int resolution;
	byte weight;
	boolean isTouchScreen;
	short costMobile;

public void makeCall()
{
	System.out.println("This method is to make calls");
}
public void sendMessage()
{
	System.out.println("This method is to send text messages");
}
private void payBills() 
{
System.out.println("This method is to pay utility bills");
}

public static void main(String[] args) {
	MyMobile obj = new MyMobile();
	obj.brandName = 'S';
	obj.costMobile = 30000;
	obj.makeCall();
	obj.sendMessage();
	obj.payBills();
	System.out.println("Mobile brand is" + obj.brandName);
	System.out.println("Mobile cost is" + obj.costMobile);
}
	
}