import java.time.LocalDate;
import java.time.Period;
public class employee {
    private String name;
    private LocalDate dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob.contains("-") ? LocalDate.parse(dob) : LocalDate.parse(dob.replace("/", "-"));
    }

    public void displayName() {
        System.out.println("Name: " + this.name);
    }

    public void displayAge() {
        int age = Period.between(this.dob, LocalDate.now()).getYears();
        System.out.println("Age: " + age);
    }
}
