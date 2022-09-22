
public class CurrencyConverter {
    public static double dollarToReal(double amount, double dollarPrice){
        return (amount * dollarPrice) + ((amount * dollarPrice)  * 0.06);
    }

}
