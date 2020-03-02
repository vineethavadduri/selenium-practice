package firstpackage;

public class FirstJava 
{
	public static void main(String[] args) {
		Sel1 obj= new Sel1();
		int c=obj.add(5, 3);
		System.out.println(c);
		int d=obj.Multi(4, 3);
        System.out.println(d);
		int m=obj.doublemult(3, 5, 4);
	    System.out.println(m);
		String f=obj.name("chuchu", "baby");
	    System.out.println(f);
	    int g=obj.doublemult(c, d, m);
	    System.out.println(g);
	    
	}
		
}

