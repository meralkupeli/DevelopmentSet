
public class Casts {

	public static void main(String[] args) {
		byte b = 0;
		short s = 1000;
		char c=65;
		int i = -100;
		long l = 10_000_000_000l;
//		float f = 65.999_999f;
		float f = 65.5541_233f;
		double d = 98.014_353_459_485_483d;
		/*byte b = 126;
		short s = 1000;
		char c = 65;
		int i = 2_147_483_647;
		long l;
		float f = 3.14f;
		double d;*/
		
		
		System.out.println(b+"\n"+s+"\n"+c+"\n"+i+"\n"+l+"\n"+f+"\n"+d);
/*	//WIDENINGCONVERSION	
//		b=c;
			//b=s;
			//i=l;
			l=i;
		//	c=b;
			s=b;
			f=i;
			d=f;
			
			
		System.out.println("\n\n"+b+"\n"+s+"\n"+c+"\n"+i+"\n"+l+"\n"+f+"\n"+d);*/

	//NARROWINGCONVERSION ()"CAST OPERATÖRÜ"
		b = (byte) s;
		i = (int) l;
		f= (float)d;
		System.out.println("\n\n"+b+"\n"+s+"\n"+c+"\n"+i+"\n"+l+"\n"+f+"\n"+d);

				
}

}
