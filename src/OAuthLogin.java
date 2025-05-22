public class OAuthLogin implements ILogin {
    private final String token;

    public OAuthLogin(String token) {
        this.token = token;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return password.equals(token);
    }
}
