package bridgelabz.lambda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionUserRegistrationTest {

	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	public void givenFirstName_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.firstName("Priyanka");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenFirstName_IsProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.firstName("Priyanka");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenLastName_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.firstName("Mane");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenLastName_IsProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.firstName("Mane");
		Assert.assertEquals(false, actualResult);
	}

}
