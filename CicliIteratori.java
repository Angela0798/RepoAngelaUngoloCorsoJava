import java.util.Scanner;   // Importo la funzionalità scanner della libreria

//Esempi Di Cicli Iteratori
class CicliIteratori {
    public static void main(String[] args)
    {
        int iProva=0;
        do
        {
            iProva++;
            System.out.println(iProva);
        }
        while(iProva<5);
    
        int iProva2=5;
        while(iProva2==5)
        {
            iProva2--;
            System.out.println(iProva2);
        }
    }
}


class Esercizio3
{
    public static void main(String[] args)
    {
        double x=11;
        double y=22;
        double z=12.5;
        boolean Controllo=true;

        Scanner opzione=new Scanner(System.in);
        Scanner oggetto= new Scanner(System.in);
        
    do
    {
         //Chiedo all'utente quale opzione vuole scegliere dal menu
         System.out.println("Scelgi 1 per aggiungere,2 per sottrarre, 3 per stampare e 4 per uscire");
         int opz=opzione.nextInt();

        if(Controllo==true)
        {
           
            if(opz==1)
            {   // Aggiungi
                //Richiamo la funzione controllo
                int Scelta=controllo();

                //Chiedo all'utente quanto vuole aggiungere all'elemento scelto
                System.out.println("Quanto vuoi aggiungere?");
                double NumeroDaAggiungere=oggetto.nextDouble();
                //A seconda della scelta aggiungo e stampo
                if(Scelta==1)
                {
                    x+=NumeroDaAggiungere;
                    System.out.println(x);
                }
                else if(Scelta==2)
                {
                    y+=NumeroDaAggiungere;
                    System.out.println(y);
                }
                else if(Scelta==3)
                {
                    z+=NumeroDaAggiungere;
                    System.out.println(z);
                }
                
            }
           else if(opz==2)
            {
                // Sottrai
                //Richiamo la funzione controllo
                int Scelta=controllo();

                //Chiedo all'utente quanto vuole sottrarre all'elemento scelto
                System.out.println("Quanto vuoi sottrarre?");
                double NumeroDaAggiungere=oggetto.nextDouble();
                //A seconda della scelta sottraggo e stampo. Se il risultato è minore di 1, assegno alla variabile 1
                if(Scelta==1)
                {
                    x-=NumeroDaAggiungere;
                    System.out.println(x);
                    if(x<=1)
                        x=1;
                }
                else if(Scelta==2)
                {
                    y-=NumeroDaAggiungere;
                    System.out.println(y);
                    if(y<=1)
                        y=1;
                }
                else if(Scelta==3)
                {
                    z-=NumeroDaAggiungere;
                    System.out.println(z);
                    if(z<=1)
                        z=1;
                }
                
            }
            else if(opz==3)
            {   //Stampa
                //Chiedo all'utente se vuole stampare tutte le variabili o una sola
                System.out.println("Vuoi stampare tutte le variabili(1) o una variabile(2)?");
                int Scelta1=oggetto.nextInt();
                //Finisco qui se scelgo di stampare tutte le variabili
                if (Scelta1==1)
                {
                    System.out.print("La variabile x vale ");
                    System.out.println(x);
                    System.out.print("La variabile y vale ");
                    System.out.println(y);
                    System.out.print("La variabile z vale ");
                    System.out.println(z);
                }
                //Finisco qui se voglio stampare una sola variabili
                else if(Scelta1==2)
                {
                   //Richiamo la funzione controllo
                    int Scelta=controllo();

                    //Stampo la variabile scelta
                    if(Scelta==1)
                    System.out.println(x); 
                    else if(Scelta==2)
                    System.out.println(y); 
                    else if(Scelta==3)
                    System.out.println(z); 

                }
            }
            else if(opz==4)
            {
                Controllo=false; 
                System.out.println("Grazie!!!");   
            }
        }
     }
    while(Controllo==true);
    }

    public static int controllo()
    {
         Scanner oggetto1= new Scanner(System.in);
         //Chiedo all'utente quale elemento voglio scegliere
         System.out.println("Quale elemento vuoi tra x (1),y (2) e z(3)?");
         int prova=oggetto1.nextInt();
         //Se la scelta non è x,y o z ciclo fin quando non sarà una di queste
         while((prova!=1) && (prova!=2) && (prova!=3) )
         {
             System.out.println("Quale elemento vuoi tra x (1),y (2) e z(3)?");
             prova=oggetto1.nextInt();
         }
        
         return prova;
    }
}