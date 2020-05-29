import java.util.Scanner;
public class Contatto{
    Scanner s=new Scanner(System.in);
    public String cognome;
    public String nome;
    public String email;
    
    public String[]c=new String[20];
    
    public Contatto(){
        cognome=null;
        nome=null;
        email=null;
    }
    
     public void stampa2(){
         System.out.println("Inserisci nome");
         this.nome=s.nextLine();
         System.out.println("Inserisci cognome");
         this.cognome=s.nextLine();
         System.out.println("Inserisci email");
         this.email=s.nextLine();
         
     }
    
    
}
