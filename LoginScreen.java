import java.util.HashMap;
import java.util.Map;

public class LoginScreen {

    private Map<String, String> userCredentials;

    public LoginScreen() {
        // Inicializa o mapa com alguns usuários e senhas (em um ambiente de produção, você usaria um banco de dados)
        userCredentials = new HashMap<>();
        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");
    }

    public boolean authenticateUser(String username, String password) {
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }
}
