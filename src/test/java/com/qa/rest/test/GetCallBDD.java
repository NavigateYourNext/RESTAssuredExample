package com.qa.rest.test;

import org.testng.annotations.Test;

//do below static imports before starting REST ASSURED Tests
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.codehaus.groovy.reflection.android.AndroidSupport;




public class GetCallBDD
{
	@Test
	public void test_numberOfCircuitsFor2017_Season()
	{
			/*given().
			when().
			then().
			assert()*/

		given().
		when().
		get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		assertThat().

		statusCode(200).and().

		body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).  //Check the body size is 20 or not

		and().

		header("content-length", equalTo("4551"));

	}
}
