package factoryPattern;

public class TransportMethod {
	   public static Transport getTransport(String TransportType){
	      if(TransportType == null){
	         return null;
	      }		
	      if(TransportType.equalsIgnoreCase("VEHICLE TRANSPORT")){
	         return new vehicle();
	         
	      } else if(TransportType.equalsIgnoreCase("FOOD TRANSPORT")){
	         return new Food();
	         
	      } else if(TransportType.equalsIgnoreCase("MEDICINE TRANSPORT")){
	         return new Medicine();
	      }
	      
	      return null;
	   }

}
