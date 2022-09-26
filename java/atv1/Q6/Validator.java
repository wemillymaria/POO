package Q6;

public class Validator {
    public void runValidation(IEntityValidation e) {
        if (e.isValid()) {
            System.out.println("É válido");
        } else {
            System.out.println("É inválido");
        }
    }
}
