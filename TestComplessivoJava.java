
import java.util.Scanner;   // Importo la funzionalità scanner della libreria

import javax.lang.model.util.ElementScanner6;

import java.util.ArrayList;
import java.util.Arrays;

class TestComplessivoJava {

    public static void main(String[] args)
    {
        //Dichiaro le variabili
        boolean ControlloNP=true;
        boolean ControlloA=true;
        boolean ControlloU=true;
        String admin="Admin";
        String pass="1234";
        String utente="angela";
        String passu="abcd";

        //Dichiaro oggetti Scanner
        Scanner oggetto=new Scanner(System.in);
        Scanner oggettostring=new Scanner(System.in);
        Scanner oggettod=new Scanner(System.in);
        Scanner opzione=new Scanner(System.in);

        ///Dichiaro L'array per interi e quello per stringhe con liste
            ArrayList<String> NomiCibi = new ArrayList<String>(Arrays.asList("Marinara", "Margherita", "Napoli","Bolognese", "Diavola", "4 Formaggi"));
            ArrayList<Double> Prezzi = new ArrayList<Double>(Arrays.asList(6.00,7.00,8.50,12.00,8.00,10.00));
            ArrayList<String> CarrelloA = new ArrayList<String>();
            ArrayList<String> CarrelloU = new ArrayList<String>();
        do
        {
            if(ControlloNP==true)
            {
                //Richiedi nome e password
                System.out.println("------Start-----");
                System.out.println("Inserisci il nome!");
                String nome=oggetto.nextLine();
                System.out.println("Inserisci la password!");
                String password=oggetto.nextLine();

                //Controlla se il nome e la password coincidono
                if(nome.equals(admin) && password.equals(pass))
                {
                    System.out.println("Il nome e la password sono corretti.!");
                    System.out.println("Benvenuto Admin");                    
                do
                {
                    
                    if(ControlloA==true)
                    {
                        System.out.println("----------MENU ADMIN----------");
                        System.out.println("Scelgi (1) ordina,(2) per aggiungere, (3) per modificare, (4) per uscire");
                        int opz=opzione.nextInt();

                        if(opz==1)
                        {
                            //Chiede all'admin quale cibo vuole ordinare
                            System.out.println("Quale cibo vuoi ordinare?");
                            String ordinacibo=oggettostring.nextLine();

                            for( int i=0;i<NomiCibi.size();i++)
                            {
                                if(NomiCibi.get(i).equals(ordinacibo))
                                {
                                    System.out.println("Cibo trovato e aggiunto al carrello!");
                                    CarrelloA.add(ordinacibo);
                                    break;
                                }
                                if((i-1)==NomiCibi.size())
                                {
                                    System.out.println("Cibo non trovato. Torna al menù");
                                }
                            }
                        }
                        else if(opz==2)
                        {
                            //Chiedo all'utente cosa vuole aggiungere
                            System.out.println("Aggiungi il piatto:");
                            String aggiungipiatto=oggettostring.nextLine();
                            System.out.println("Aggiungi il prezzo:");
                            double aggiungiprezzo=oggettod.nextDouble();
                            System.out.println(aggiungiprezzo);
    
                            //Inserisco l'elemento nella lista
                            NomiCibi.add(aggiungipiatto);
                            Prezzi.add(aggiungiprezzo);
                        }
                        else if(opz==3)
                        {
                            //Chiedo all'utente cosa vuole modificare
                            System.out.println("Vuoi modificare il nome del piatto(1) o il prezzo(2)?");
                            int scelta=oggetto.nextInt();
                            if(scelta==1)
                            {
                               
                                //Chiedo all'utente quale elemento voglio modificare
                                System.out.println("Inserisci il numero del piatto della lista da modificare!");
                                int modifica=oggetto.nextInt();
                                //Chiedo all'utente con cosa vuole modificare
                                System.out.println("Inserisci il nuovo nome");
                                String nuovoins=oggettostring.nextLine();
    
                                //Modifico l'array 
                                NomiCibi.set(modifica-1,nuovoins);
                            }
     
                            else if(scelta==2)
                            {
                                //Chiedo all'utente quale elemento voglio modificare
                                System.out.println("Inserisci il numero del prezzo della lista da modificare!");
                                int modifica=oggetto.nextInt();
                                //Chiedo all'utente con cosa vuole modificare
                                System.out.println("Inserisci il nuovo prezzo");
                                double nuovoins=oggettod.nextDouble();

                                //Modifico l'array 
                                Prezzi.set(modifica-1,nuovoins);
                            }
                            else if(scelta!=1 && scelta!=2)
                                System.out.println("Inserisci una scelta valida!");
                        }
                        else if(opz==4)
                        {
                            ControlloA=false;
                            ControlloNP=false;
                        }
                        else if(opz!=1 && opz!=2 && opz!=3 && opz!=4)
                            System.out.println("Inserisci una scelta valida!");
                    }
                }
                while(ControlloA==true); //Chiudo il menu Admin
                }
                else
                {
                    System.out.println("Il nome e la password sono corretti");
                    System.out.println("Benvenuto Utente!");
                    int prima=0;
                    Double prezzototale=0.0;
                    double budget=0;
                do
                {
                    
                    if(ControlloU==true)
                    {
                       
                        if(prima==0)
                        {
                            System.out.println("Qual'è il tuo budget?");
                            budget=oggetto.nextDouble();
                            prima=1;
                        }
                        System.out.println("----------MENU UTENTE----------");
                        System.out.println("Scelgi (1) visualizzare i cibi,(2) per ordinare, (3) per pagare, (4) per uscire");
                        int opz=opzione.nextInt();
                        

                        if(opz==1)
                        {
                            //Stampo gli array
                            System.out.println("Visualizzo i Cibi e i relativi Prezzi");
                            System.out.println(NomiCibi);
                            System.out.println(Prezzi);
                        }
                        else if(opz==2)
                        {
                            //Chiede all'utente quale cibo vuole ordinare
                            System.out.println("Quale cibo vuoi ordinare?");
                            String ordinacibo=oggettostring.nextLine();
                            int indicecibo=0;

                            for( int i=0;i<NomiCibi.size();i++)
                            {
                                if(NomiCibi.get(i).equals(ordinacibo))
                                {
                                    System.out.println("Cibo trovato e aggiunto al carrello!");
                                    CarrelloU.add(ordinacibo);
                                    indicecibo=i;
                                    break;
                                }
                                if(i==NomiCibi.size()-1)
                                {
                                    System.out.println("Cibo non trovato. Torna al menù");
                                }
                            }
                            prezzototale+=Prezzi.get(indicecibo);
                            System.out.println(prezzototale);
                        }
                        else if(opz==3)
                        {
                            //Visualizzo all'utente quali sono i cibi prenotati e il prezzo totale
                            System.out.println("Il tuo carrello è il seguente: "+CarrelloU);
                            System.out.println("Il prezzo totale è: "+prezzototale);
                            //Chiedo all'utente se è sicuro di voler pagare
                            System.out.println("Sei sicuro di voler pagare? Y/N");
                            String sn=oggettostring.nextLine();
                            if(sn.equalsIgnoreCase("Y"))
                            {
                                if(prezzototale<budget)
                                {
                                    budget-=prezzototale;
                                    System.out.println("Il budget rimanente è il seguente:"+budget);
                                }
                                else
                                    System.out.println("Il tuo budget non è sufficiente per pagare il tuo ordine");
                            }
                        }
                        else if(opz==4)
                        {
                            ControlloU=false;
                            ControlloNP=false;
                        }
                        else if(opz!=1 && opz!=2 && opz!=3 && opz!=4)
                            System.out.println("Inserisci una scelta valida!");
                    }
                }
                while(ControlloU==true);
                }
            }
        }
        while(ControlloNP==true);
    }
}