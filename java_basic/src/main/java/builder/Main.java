package builder;

public class Main {

    public static void main(String[] args) {
        Person person = Person.builder().setName("David").setAge(22).build();
        User user = User.builder().login("user").password("password").buildUser();
        System.out.println(user.getLogin());
    }
}
