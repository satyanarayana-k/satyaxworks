class Television{
 static int maxVol=100,minVol=20,currentVol=40,currentBrightness=5,maxBrt=8,minBrt=3;
 static boolean isConnected=false,isBrightness=false;
public static void main(String args[]){
String brandName="sony";
Double price=20000.00;
String type="LCD";
System.out.println("BrandName="+brandName);
System.out.println("type of tv="+type);
System.out.println("price of TV="+price);
increaseVolume();
decreaseVolume();
increaseBrightness();
decreaseBrightness();
}
public static void increaseVolume(){
	if(isConnected()){
		if(currentVol<maxVol){
			currentVol+=2;
			System.out.println("increse Volume="+currentVol);
		}
	}
}
public static void decreaseVolume(){
	if(isConnected()){
		if(currentVol>minVol){
			currentVol-=2;
			System.out.println("decreaseVolume="+currentVol);
		}
	}
}
public static boolean isConnected(){
		return true;
}
public static void decreaseBrightness(){
	if(isConnected()){
		if(currentBrightness<maxBrt){
			currentBrightness+=1;
			System.out.println("Brightness level="+currentBrightness);
		}
	}
}
public static void increaseBrightness(){
	if(isConnected()){
		if(currentBrightness>minBrt){
			currentBrightness-=1;
			System.out.println("Brightness level="+currentBrightness);
		}
	}
}
}
//https://github.com/satyanarayana-k/sample.git