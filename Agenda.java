
public class Agenda extends Contatto{
    private Lista numero;
    public int contatti;

    public Agenda(){
        this.contatti=0;
        this.numero=null;
    }

    public void stampaLista(){
        Lista numero = this.numero;
        
        System.out.printf("Contatti:%d\n",this.contatti);
        
        while (numero!= null){
            System.out.printf("Numero:%d\n",numero.v);
            numero = numero.next;
        }
    }
    
     public void inserisci(int v){
        Lista numero = this.numero;
        Lista tel = null;

        Lista temp = new Lista(v);
       
        while (numero != null && numero.v<v){
            tel = numero;
            numero = numero.next;
            }

        if (tel == null) {
            temp.next = this.numero;
            this.numero = temp;
        } else {
             tel.next = temp;
            temp.next = numero;
        }
       
        this.contatti++;
    }

    
     public void ricerca(int v){
        Lista numero = this.numero;
        Lista tel = null;
        
        while(numero!= null && numero.v<v){
            tel = numero;
            numero = numero.next;
        }

        if (numero == this.numero) {
            System.out.printf("ricerca,numero non trovato:%d\n",c);
            return;
        }
        System.out.printf("Ricerca del numero:%d\n",c);
        
        if (tel == this.numero) {
            System.out.printf("Ricerca del numero:%d\n",c);
            this.numero = this.numero.next;  
            return;
        }
        System.out.printf("Ricerca fatta,trovato:%d\n",c);
 }

    public void elimina(int v){
        Lista numero = this.numero;
        Lista  prev = null;
        Lista temp = null;

    
        while (numero != null && numero.v<v) {
            prev = numero;
            numero = numero.next;
        }

        if (numero == null) {
            System.out.printf("Elimina,numero non trovato%d\n",v);
            return;
        }

        System.out.printf("Elimina:%d\n",v);
        this.contatti--;

       
        if (prev == null) {
            System.out.printf("Eliminazione del numero\n");
            this.numero = this.numero.next;  
            return;
        }

        System.out.printf("Eliminazione del numero\n");
        prev.next = prev.next.next;
    }
}
