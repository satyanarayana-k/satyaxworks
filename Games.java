class Games{
	static String name="cricket";
	static int noOfPlayers=11;
public static void main(String a[]){
	play();
	play("cricker" , 11);
}
public static void play(){
System.out.println("playing int the ground");
}
public static void play(String name, int noOfPlayers){
System.out.println( name+" Game is playing in the ground with "+ noOfPlayers+ "players");
}
}