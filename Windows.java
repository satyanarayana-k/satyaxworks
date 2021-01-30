class Window{
public static void main(String argd[]){
int a=1;
openAndClose(a);
openAndClose(a);
openAndClose(a);
}
public static void openAndClose(int x){
if(x==1){
System.out.println("open window");}
else {
System.out.println("Close window");}
}
}