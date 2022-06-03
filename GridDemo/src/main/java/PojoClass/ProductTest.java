package PojoClass;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;


public class ProductTest {

	public static void main(String[] args) throws SerializeException, ParseException {
		
	  
		
	   String sellerNames[] = {"XYZ Soln", "ABC Software","IT Solutions"};

	   Product product = new Product("MacBook", 1000, "White", sellerNames);
	   
	 //Pojo to Json
	   JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
	   String json = jsonSerializer.serialize(product);
	   System.out.println(json);
	   
	   //Pojo to XML
       XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
       String xml = xmlSerializer.serialize(product);
       System.out.println(xml);
       
       
//       Deserialiazation
//       JSON tO POJO
       
       JsonParser jsonParser = JsonParser.DEFAULT;
       String jsonVal = "{\r\n"
       		+ "	\"color\": \"White\",\r\n"
       		+ "	\"name\": \"MacBook\",\r\n"
       		+ "	\"price\": 1000,\r\n"
       		+ "	\"sellerNames\": [\r\n"
       		+ "		\"XYZ Soln\",\r\n"
       		+ "		\"ABC Software\",\r\n"
       		+ "		\"IT Solutions\"\r\n"
       		+ "	]\r\n"
       		+ "}";
       
       Product pro = jsonParser.parse(jsonVal, Product.class);
       System.out.println(pro.getColor());
       System.out.println(pro.getName());
	}

}
