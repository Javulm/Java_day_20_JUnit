import com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class UserRegistrationTest {
	@Test
	public void shouldAnswerWithTrue() {
		boolean result = UserRegistration.isValidUserName("Javul");
		Assertions.assertTrue(result);
	}
}
