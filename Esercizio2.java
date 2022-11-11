import java.util.Scanner;   // Importo la funzionalità scanner della libreria
class Esercizio2
{
    public static void main(String[] args) 
    {
        //Valorizzazioni
        int x=3;
        int y=13;
        int z=13;

        // Controllo non annidato
        if(x==y)
        {System.out.println("Stampa x==y");}

        if(y==z)
        {System.out.println("Stampa y==z");}

        if(x==z)
        {System.out.println("Stampa x==z");}

        //Controllo annidato
        if(x!=y)
        {
            if(x!=z)
            {
                if(y!=z)
                {
                    {System.out.println("Sono tutte diverse");}
                }
                else
                {System.out.println("Y==Z");}
            }
            else
            {System.out.println("X==Z");}
        }
        else
        {System.out.println("X==Y");}   
    }
}

class Esercizio2parte2 {
    public static void main(String[] args) 
    {
        Scanner oggetto= new Scanner(System.in); // Andiamo a creare un nuovo scanner
        Scanner oggetto1= new Scanner(System.in);


        System.out.print("A: ");
        int a=oggetto1.nextInt();
        System.out.print("B: ");
        int b=oggetto1.nextInt();
        System.out.print("C: ");
        int c=oggetto1.nextInt();

        //Controllo if annidato con variabili create con scanner 
        if(a==b)
        System.out.println("A==B");
        else if(a==c)
        System.out.println("A==C");
        else if (b==c)
        System.out.println("B==C");

        
        String Nome= oggetto.nextLine();      //Read user input
        String Cognome= oggetto.nextLine();      //Read user input
        int Età= oggetto1.nextInt();      //Read user input

        //Output 
        System.out.println("Questo è il tuo profilo: ");
        System.out.println("Nome: "+Nome);
        System.out.println("Cognome: "+Cognome);
        System.out.println("Età: "+Età);
    }
    
}


