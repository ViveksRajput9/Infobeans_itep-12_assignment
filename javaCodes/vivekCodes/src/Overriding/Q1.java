 package Overriding;
class a{
	int a1 ;
	int b1;
	int c1;
	
	public a(int a1 ) {
		this.a1=a1;
	}
	public a(int a1,int b1) {
		this(a1);
		this.b1=b1;
	}
	public a(int a1,int b1,int c1) {
		this(a1,b1);
		this.c1=c1;
	}
	public void add(int a1) {
		this.a1 = a1;
		
	}
	public void add(int a1,int b1) {
		this.add(a1);
		this.b1=b1;
	}
	public void add(int a1,int b1,int c1) {
		this.add(a1, b1);
		this.c1=c1;
	}
	@Override
	public String toString() {
		
		return "a [a1=" + a1 + ", b1=" + b1 + ", c1=" + c1 ;
	}
}
class b extends a{
	int j ;
	public b(int j,int a1,int b1,int c1) {
		super(a1, b1, c1);
		this.j = j;
		int n = 23;
		Math.abs(n);
	}
	public String toString() {
		return  super.toString() +" , j="+j+ "]";
	}
}
public class Q1 {
 public static void main(String[] args) {
	 b d = new b(65486,12,4,56);
	 d.add(258, 258, 258);
	 System.out.println(d);
	 
}
}