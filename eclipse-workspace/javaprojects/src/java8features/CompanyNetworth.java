package java8features;

import java.util.HashMap;
import java.util.Map;

public class CompanyNetworth {

	public static void main(String[] args) {
		 Map <String,String>companies=new HashMap<>();
		 companies.put("Toyota","59.47 billion");
		 companies.put("Mercedes-Benz","58.22 billion");
		 companies.put("Volkswagen","47.02 billion");
		 companies.put("BMW","47.02 billion");
		 companies.put("Porsche","34.32 billion");
		 
		 //iteration using forEach()method
		 companies.forEach((companyName,Networth)->{
			 System.out.println("Company Name:\t"+companyName);
			 System.out.println("Networth:\t"+Networth);
			 System.out.println();
			 
		 });
	}

}
