import org.apache.camel.builder.RouteBuilder;

public class CustomRoutesBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("Routing From uw folder to pa server input folder is Started");
		from("file:C:\\apps\\data\\output\\BPF\\outbound\\uw").to("file:X:\\");
	}

}
