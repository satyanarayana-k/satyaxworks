class Temple{
public static void main(String args[]){
 int a=12;
 puja(a);
}
public static void puja(int time){
if(time>=11 || time<=17)
  {
    System.out.println("out of time"); 
	}
else
  {
	System.out.println("available for puja");
  }
}
}