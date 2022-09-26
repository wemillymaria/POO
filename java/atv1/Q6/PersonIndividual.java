package Q6;

public class PersonIndividual extends Person {
    public String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return String.format("CPF: %s\n", cpf);
    }
    @Override
    public boolean isValid() {
        return true;
    }
}
