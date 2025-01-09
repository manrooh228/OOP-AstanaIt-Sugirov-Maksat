package assignment2.assignment2functions;

public class task7 {
    // Перед вами метод signing(), который приветствует пользователей на сайте. Сейчас он
    // приветствует всех пользователей, но должен приветствовать только зарегистрированных пользователей. Имена всех незарегистрированных
    // пользователей - "пользователь".
    // Добавьте проверку имени пользователя в начале метода signIn().
    // Если указано имя "пользователь", завершите метод, используя ключевое слово return.
    // Требования:
    // • Если имя пользователя является "user", метод signIn() должен завершиться без вывода
    // чего-либо на консоль.
    // • Если имя пользователя не является "user", метод signIn() должен продолжить выполнение и распечатать
    // строки приветствия в консоли.
    // • Ключевое слово return должно использоваться для прерывания метода signIn()

    public static void main(String[] args) {
        // Test cases
        signIn("user");
        signIn("Aaa");
        signIn("Bbb");
    }

    public static void signIn(String name) {
        if ("user".equals(name)) {
            return;
        }
        System.out.println("Welcome to the site, " + name + "!");
        System.out.println("We are glad to see you here.");
    }
}
