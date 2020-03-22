package builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

    @Getter
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String login;
        private String password;

        UserBuilder login(String login) {
            this.login = login;
            return this;
        }

        UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public User buildUser() {
            return new User(login, password);
        }
    }
}
