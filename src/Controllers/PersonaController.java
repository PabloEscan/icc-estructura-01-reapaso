package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[]personas) {
        int tamaño = personas.length;
        for(int i=1; i<tamaño-1; i++){
            Persona iM = personas[i];
            int j = i-1;
                while( j>=0 && personas[j].getEdad() > iM.getEdad()){
                    personas[j+1] = personas[j];
                    j--;
                }
                personas[j+1] = iM;

        }
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length;

        while (alto > bajo) {
            int central = (bajo+alto)/2;

            if(personas[central].getEdad() == edad){
                return personas[central];
            }

            if(personas[central].getEdad() > edad){
                alto = central-1;
            }else{
                bajo = central +1;
            }
        }
        return null;
    }
}
