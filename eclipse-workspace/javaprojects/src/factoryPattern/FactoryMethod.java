package factoryPattern;

public class FactoryMethod {
	public static void main(String[] args) {
		Transport type1 = TransportMethod.getTransport("VEHICLE TRANSPORT");

	      type1.type();

	      Transport type2 = TransportMethod.getTransport("FOOD TRANSPORT");

	      type2.type();
	      
	      Transport type3 = TransportMethod.getTransport("MEDICINE TRANSPORT");
	      
	      type3.type();
	   }

}
