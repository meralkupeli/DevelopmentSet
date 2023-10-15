
public class Variables {
	public String a;
	public int c;
	public String getInfo() {
		String info = "print"+"\n"+a+"\n"+c;
		return info;
	}
	public static void main(String[] args) {
		//LOCAL DEĞERLER İNİTİLAİZE (TANIMLANMA) EDİLMELİ!!!
/*int a=5;
String b="a";
char c='c';
boolean d=false;
System.out.println(a+"\n"+b+"\n"+c+"\n"+d);*/

Variables bl = new Variables();
bl.a="ac";
bl.c=5;
System.out.println(bl.getInfo());


}
}