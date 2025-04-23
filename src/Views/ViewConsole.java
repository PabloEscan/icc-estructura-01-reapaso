package Views;
import Models.Persona;
public class ViewConsole {
    
    public void printPersonsArray(Persona[] personas){
        int tamaño = personas.length;

        for(int i=0; i<tamaño; i++){
            System.out.println("Nombre: "+ personas[i].getNombre() +", edad: "+ personas[i].getEdad() );
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
