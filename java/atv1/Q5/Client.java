import java.util.Date;

public class Client {
    public String name;
    public String email;
    public Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s) - %s\n", name, birthDate, email);
    }
}
