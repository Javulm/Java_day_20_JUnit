package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	@Test
	public void shouldAnswerWithTrue() {
		boolean result = UserRegistration.isValidUseruserName("Javul");
		Assertions.assertTrue(result);
	}
}
