class Phone{
	//static double price=34000.00;;
	static long number=6523417895l;
	static String name="sandeep";
public static void main(String a[]){
/*double c=ringing(price);
System.out.println("price = "+c);
ringing("melody");*/
long N=call(number);
System.out.println("calling "+number+" stated");
String c=call(name);
System.out.println("calling "+name+" started");
}
/*
public static double ringing(double price){
return price;
}
public static void ringing(String song){
System.out.println("MI phone is ringing "+song+" ringTone");
}*/
static long call(long number){
	System.out.println("number found");
	return number;
}
static String call(String name){
	System.out.println("contact found "+ name +" returned for call");
	return name;
}
}