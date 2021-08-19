package decoratorDesignPattern;
interface Car{
	public void assemble();
	
}
class BasicCar implements Car{

	@Override
	public void assemble() {
		System.out.println("The Basic Car Features");
	}
}
class CarDecrator implements Car{
	protected Car car;
	
	public CarDecrator(Car c) {
		this.car =c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
		
	}
}
class FamilyCar extends CarDecrator{
	public FamilyCar(Car c) {
		super(c);
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Family Features");
	}
}
class SportCar extends CarDecrator{
	public SportCar(Car c) {
		super(c);
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Sport Features");
	}
}
class TouringCar  extends CarDecrator{
	public TouringCar(Car c) {
		super(c);
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Touring Features");
	}
}

public class DecoraterCar {

	public static void main(String[] args) {
		System.out.println("\n---------FamilyCar---------\n");
		Car familyCar = new FamilyCar(new BasicCar());
		familyCar.assemble();
		System.out.println();
		System.out.println("\n---------Sports Car---------\n");
		Car sportCar = new SportCar(new BasicCar());
		sportCar.assemble();
		System.out.println();
		System.out.println("\n---------Touring Car---------\n");
		
		Car touringCar =new TouringCar(new BasicCar());
		touringCar.assemble();
		System.out.println();
		
		//custom car
		System.out.println("\n---------My Custom Car---------\n");
		Car mycar =new SportCar(new TouringCar(new BasicCar()));
		mycar.assemble();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
