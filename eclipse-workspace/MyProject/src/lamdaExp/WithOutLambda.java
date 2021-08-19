package lamdaExp;
interface drawing{
	public void draw();
	
}

public class WithOutLambda {

	public static void main(String[] args) {
		int width = 10;
		
		 //without lambda, Drawable implementation using anonymous class
		drawing drw = new drawing() {
			public void draw() {
				System.out.println("Drawing "+width);
				
			}
			
		};
		drw.draw();
		
		//using Lambda expression without any parameter
		drawing d2 =() -> {
			System.out.println("drawing"+width);
		};
		
		d2.draw();
	
	}

}
