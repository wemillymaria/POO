package Q6;

public class main {
    public static void main(String[] args) {
        PersonIndividual personIndividual = new PersonIndividual("1548740356");
        PersonLegal personLegal = new PersonLegal("487456159741");
        Validator validator = new Validator();

        validator.runValidation(personIndividual);
        validator.runValidation(personLegal);
    }
}