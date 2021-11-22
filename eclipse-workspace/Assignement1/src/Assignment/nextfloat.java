package Assignment;

public class nextfloat {

	
	public float next( float x) {
		
		return Math.nextUp(x);
	}
	public static void main(String[] args) {
		
		nextfloat nf = new nextfloat();
		System.out.println(nf.next(-1.1f));
			
	}
}
