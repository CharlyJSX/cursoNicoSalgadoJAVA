import java.util.ArrayList;

public class Seleccion {

    String nombreEquipo;
    char grupo;
    boolean clasicadoACuartos;

    void imprimirEquipo(){

    System.out.println(nombreEquipo);
    System.out.println(grupo);
    System.out.println(clasicadoACuartos);
    }
public static void main(String[] args) {

   Seleccion argentina = new Seleccion();
    argentina.nombreEquipo = "Argentina";
    argentina.grupo = 'C';
    argentina.clasicadoACuartos = false;

 //   argentina.imprimirEquipo();

    if(argentina.clasicadoACuartos){
        System.out.println("Clasificados");
    } else if(!argentina.clasicadoACuartos){
        System.out.println("Somos malísimos");
    }

    // Bucle - Loops

    // For - Loop

  /*   for(int i = 1; i < 11; i++){
        System.out.println("Asiento: " + i);
    } */

    // While - Loop
/*     int j = 1;
    while (j < 11){
        System.out.println("Asiento: " + j);
        j++;
    } */

    // Exepciones 

/*     int x = 0;
    int z = 5;

    try {
  System.out.println(z / x);
    } catch (Exception exception) {
        System.out.println("Imposible divide por cero");
    } */
  
    // API

    ArrayList <String> selecciones = new ArrayList<>();
    selecciones.add("Francia");
    selecciones.add("Inglaterra");
    selecciones.add("Brasil");
    selecciones.add("Marruecos");

    System.out.println(selecciones);


}
}

/* 


- POO       

        String nombreEquipo;
        char grupo;
        boolean clasicadoACuartos;

        void imprimirEquipo(){

    System.out.println(nombreEquipo);
    System.out.println(grupo);
    System.out.println(clasicadoACuartos);
    }
public static void main(String[] args) {

   Seleccion argentina = new Seleccion();
    argentina.nombreEquipo = "Argentina";
    argentina.grupo = 'C';
    argentina.clasicadoACuartos = true;

    argentina.imprimirEquipo();



    }
 */