import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("adios");
        final String ejemplo = lista.get(1);
        System.out.println(ejemplo);

        Generico<Double> generico = new Generico<Double>(1.0);
        generico.mostrar("nomber");


        List<Number> lista2 = new ArrayList<>();
        lista2.add(5);
        lista2.add(4.4);
        lista2.add(5L);

        Generico<String> generico2 = new Generico<String>("araa");
        generico2.mostrarOtro(lista2);
    }

}
