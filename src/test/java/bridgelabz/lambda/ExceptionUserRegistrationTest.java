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
        boolean actualResult = exceptionUserRegistration.lastName("Mane");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.mobileNumber("91 8329881467");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.mobileNumber("91 8329881467");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.lastName("Mane");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.emailId("manepriyanka2014@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.emailId("manepriyanka2014@gmail.com");
        Assert.assertEquals(false, actualResult);
    }

}
