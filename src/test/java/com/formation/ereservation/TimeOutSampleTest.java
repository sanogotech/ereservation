package com.formation.ereservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeOutSampleTest {
	
  //Rather than specifying timeout attribute for all tests separately, 
  //we can define JUnit Rule for all tests in a class.
  
  @Rule
  public Timeout globalTimeout = Timeout.seconds(5);
 
  @Test
  public void simpleTest() {
    System.out.println("simpleTest");
    Assertions.assertTrue(true);
  }
  
    //1. JUnit test timeout example – ‘timeout’ attribute
	@Test(timeout = 500)
	public void testInfiniteTametakingLoop() throws InterruptedException 
	{
		while (true)
		{
			Thread.currentThread().sleep(550);
		}
	}
	
	@Test
	void timeoutExceeded() 
	{
		// The following assertion fails with an error message similar to:
		// execution exceeded timeout of 10 ms by 91 ms
		assertTimeout(ofMillis(10), () -> {
			// Simulate task that takes more than 10 ms.
			Thread.sleep(100);
		});
	}
}