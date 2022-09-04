import com.bridgelabz.UserRegistration;
import com.bridgelabz.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	Boolean result;
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		result = UserRegistration.isValidFirstName("Javul");
		Assert.assertEquals(true,result);
	}
	@Test
	public void givenFirstName_WhenImProper_ShouldReturnInvalidMessage() {
		try {
			UserRegistration.isValidFirstName("javul1.23j");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		result = UserRegistration.isValidLastName("Mulla");
		Assert.assertEquals(true,result);
	}
	@Test
	public void givenLastName_WhenImProper_ShouldReturnInvalidMesage() {
		try {
			UserRegistration.isValidLastName("Mulla.1");
		}catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperEmailShouldReturnTrue() {
		result = UserRegistration.isValidEmail("javullmulla8@gmail.co.in");
		Assert.assertEquals(true,result);
	}

	@Test
	public void givenImProperEmailShouldReturnInvalidMessage() {
		try {
			UserRegistration.isValidEmail("javulmulla8.gmail.co.in1");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperPhoneNumberShouldReturnTure() {
		result = UserRegistration.isValidPhoneNo("91 9876543210");
		Assert.assertEquals(true,result);
	}

	@Test
	public void givenImProperPhoneNumberShouldReturnInvalidMessage() {
		try {
			UserRegistration.isValidPhoneNo("89 55655668");
		}catch (UserRegistrationException e){
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperPassword1ShouldReturnTrue() {
		result = UserRegistration.isValidPassword1("javulmulla");
		Assert.assertEquals(true,result);
	}
	@Test
	public void givenImProperPassword1ShouldInvalidMessage() {
		try {
			UserRegistration.isValidPassword1("Javul1");
		}catch (UserRegistrationException e){
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenProperPassword2ShouldReturnTrue() {
		result = UserRegistration.isValidPassword2("Javulmulla");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenImProperPassword2ShouldInvalidMessage() {
		try {
			UserRegistration.isValidPassword1("javulmulla1");
		}catch (UserRegistrationException e){
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void givenProperPassword3ShouldReturnTrue() {
		result = UserRegistration.isValidPassword3("Javulmulla1");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenImProperPassword3ShouldInvalidMessage() {
		try {
			UserRegistration.isValidPassword3("Javul");
		} catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void givenProperPassword4ShouldReturnTrue() {
		result = UserRegistration.isValidPassword4("Javulm@123");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenImProperPassword4ShouldInvalidMessage() {
		try {
			UserRegistration.isValidPassword4("Javul1234");
		}catch (UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
			System.out.println(e.getMessage());
		}
	}
}
