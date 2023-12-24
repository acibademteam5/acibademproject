package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class AcibademHastanesi {
    public static RequestSpecification spec;

    public static void setUp() {
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://www.acibadem.com.tr").build();
    }
}
