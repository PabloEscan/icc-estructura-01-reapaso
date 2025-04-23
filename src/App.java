
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[]{
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel",40),
            new Persona("Laura", 32),
            new Persona("Perdo", 29),
            new Persona("Elenea", 26),
        };

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        vC.printMessage("Arreglo de personas");
        vC.printPersonsArray(personas);

        vC.printMessage("\nArreglo ordenado por insercion ascendente");
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);

        vC.printMessage("\nBuscamos persona con edad 40");
        Persona busqueda = pC.buscarPorEdad(personas, 40);
        if(busqueda == null){
            vC.printMessage("No se encontro persona con edad 40");
        }else{
            vC.printMessage("Se encontro a la persona con edad 40");
            vC.printMessage(busqueda +"");
        }

        vC.printMessage("\nBuscamos persona con edad 99");
        Persona busqueda2 = pC.buscarPorEdad(personas, 99);
        if(busqueda2 == null){
            vC.printMessage("No se encontro persona con edad 40");
        }else{
            vC.printMessage("Se encontro a la persona con edad 40");
            vC.printMessage(busqueda2 +"");
        }


        /*0. Instanciar clases nesesarias
         * 1. Mensaje = Arreglo personas
         * 2. Imprimimos el arreglo
         * 3. Mensaje = Arreglo ordenado por insecion ascendente
         * 4. Imprimimos el arreglo ordenado
         * 5. Mensaje = Buscar persona con edad 40
         * 6. Imprimir resultado de busqueda y la persona si se encontro
         * 7. Lo mismo que el 5 (pero diferente edad en este caso 99)
         * 8. Imprimir resluado de busqueda y la persona si se encontro
         */

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
