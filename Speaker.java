class Speaker{
static String brandName;
static double price;
static int maxVolume=100,currentVolume=30,minVolume=0;
public static void main(String args[]){
brandName="boat";
price=2500.00;
System.out.println("Brand Name=" +brandName);
System.out.println("Price ="+price);
increaseVolume();
decreaseVolume();
}
public static void increaseVolume(){
 if(isConnected()){
   if(currentVolume<maxVolume){
      currentVolume=currentVolume+1;
      System.out.println("currentVolume="+currentVolume);
    }
  }
 }
 public static void decreaseVolume(){
 if(isConnected()){
   if(currentVolume>minVolume){
      currentVolume=currentVolume-1;
      System.out.println("currentVolume="+currentVolume);
   }
 }   
}
public static boolean isConnected(){
	return true;
}
}