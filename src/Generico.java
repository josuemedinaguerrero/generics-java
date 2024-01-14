import java.util.List;

public class Generico<TIPO> {
  private final TIPO tipoObjeto;

  public Generico(TIPO tipoObjeto) {
    this.tipoObjeto = tipoObjeto;
  }

  public <ONOF> void mostrar(ONOF parameter) {
    System.out.println("Esta es la clase del genérico " + tipoObjeto.getClass().getName());
    System.out.println("Esta es la clase del genérico " + parameter.getClass().getName());
  }

  public void mostrarOtro(List<? extends Number> lista) {
    for (Number number: lista) {
      System.out.println("Tipo: " + number.getClass().getName());
    }
  }

}
