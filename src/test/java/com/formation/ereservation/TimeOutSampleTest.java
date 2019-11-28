package com.formation.ereservation;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeOutSampleTest {
	
  //Rather than specifying timeout attribute for all tests separately, 
  //we can define JUnit Rule for all tests in a class.
  
 // @Rule
 //public Timeout globalTimeout = Timeout.seconds(5);
 
  @Test
  public void simpleTest() {
    System.out.println("simpleTest");
    Assertions.assertTrue(true);
  }
  

	
	@Test
	void timeoutExceeded() 
	{
		// The following assertion fails with an error message similar to:
		// execution exceeded timeout of 10 ms by 91 ms
		assertTimeout(ofMillis(10), () -> {
			// Simulate task that takes more than 10 ms.
			//Thread.sleep(100);
		});
	}
}