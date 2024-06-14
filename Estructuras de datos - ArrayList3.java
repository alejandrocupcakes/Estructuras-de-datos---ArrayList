 import java.util.ArrayList;
import java.lang.Double;

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        for (double i = 0.0; i < 10.0; i += 0.5) {
            lista.add(i);
        }
        System.out.println(lista);
    }
