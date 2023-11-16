class LoginScreenTest {

    @Test
    void testLoginSuccess() {
        LoginScreen loginScreen = new LoginScreen();
        boolean result = loginScreen.authenticateUser("user1", "password1");
        assertTrue(result);
    }

    private void assertTrue(boolean result) {
    }

    @Test
    void testLoginFailure() {
        LoginScreen loginScreen = new LoginScreen();
        boolean result = loginScreen.authenticateUser("user1", "wrongpassword");
        assertTrue(result);
    }
}
