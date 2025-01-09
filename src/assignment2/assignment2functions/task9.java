package assignment2.assignment2functions;

public class task9 {
    // Перед вами программа, которая отображает информацию о человеке в консоли.
    // К сожалению, она не компилируется.
    // Измените минимально необходимое количество модификаторов доступа в классе Person, чтобы
    // код скомпилировался.
    // Требования:
    // • Код должен быть скомпилирован.
    // 24
    // • Нам нужно изменить минимально необходимое количество модификаторов доступа в
    // классе Person.
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov");
        System.out.println("Dossier.");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
}

class Person { //deleted public
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) { // Public -> public
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { // protected -> public
        return firstName;
    }

    public String getLastName() { // package-private -> public
        return lastName;
    }

    public String getFullName() { // private -> public
        return firstName + " " + lastName;
    }
}
