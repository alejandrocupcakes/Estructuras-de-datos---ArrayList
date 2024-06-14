import java.util.ArrayList;

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        agregoElemento(lista, 10);
        System.out.println(lista);
    }

    public static void agregoElemento(ArrayList<Integer> lista, int elemento) {
        lista.add(elemento);
    }
