package util;

public class CurrencyConverter {

    public static final double DOLAR = 3.10;

    public static double converter(double valor) {
        double IOF = DOLAR * valor * 0.06;
        return DOLAR * valor + IOF;
    }
}
