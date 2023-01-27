package testPackage;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAPitest { 
  @Test
  public void getusers() {
	  RestAssured.baseURI="https://gorest.co.in/public/v2/users/";
	  RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
	  Response resp=httpRequest.request(Method.GET,"");
	//  System.out.println(resp.getStatusLine());
	  System.out.println(resp.getStatusCode());
	  System.out.println(resp.prettyPrint());
	  
	  int StatCode = resp.getStatusCode();
	  assertEquals(200,StatCode);
	  
  }
}
