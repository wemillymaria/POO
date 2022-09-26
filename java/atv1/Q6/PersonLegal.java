package Q6;

public class PersonLegal extends Person {
    public String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String toString() {
        return String.format("CNPJ: %s\n", cnpj);
    }
    @Override
    public boolean isValid() {
        return true;
    }
}
