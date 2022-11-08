package calculator;

public class Claci {
	private int a;
	private int b;
	public Claci(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Claci [a=" + a + ", b=" + b + "]";
	}
	

}
