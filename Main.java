import java.util.Scanner;
public class Main extends Contatto {
    
     public static void main(String[] args){
         
        Scanner s=new Scanner(System.in); 
        Agenda A = new Agenda();
        
        System.out.printf("Inserire numeri:1\n");
        System.out.printf("Ricercare un numero:2\n");
        System.out.printf("Eliminare un numero:3\n");

        A.stampaLista();
        int rubrica=1;

        while(rubrica!=0){
        rubrica=s.nextInt();
        switch(rubrica){
        case(1):
        A.inserisci(345456879);
        A.stampaLista();
        A.stampa2();
        
        A.inserisci(375850470);
        A.stampaLista();
        A.stampa2();
        
        A.inserisci(323859770);
        A.stampaLista();
        A.stampa2();
        break;
        case(2):

        A.ricerca(375850470);
        A.stampaLista();
        break;
        case(3):
 
        A.elimina(345456879);
        A.stampaLista();

        break;
        default:
            System.out.printf("Opzione non disponibile\n");
        break;
        }
        }
    }
}

