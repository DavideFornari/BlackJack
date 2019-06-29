import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Classe BlackJack
 * 
 * contentente il main()
 */
public class BlackJack {
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        Scanner key = new Scanner(System.in);
        int n = -1, k = -1;
        



        System.out.println("Benvenuti signori: ");

        System.out.println("\nVolete conoscere le regole  ?      \n\t(inserire 1 per spiegazioni, qualunque altro tasto altrimenti)    :");
        if(key.hasNextInt()){
            if(key.nextInt() == 1){
                BufferedReader reader = new BufferedReader(new FileReader("help.txt"));
                String s = "\n" + reader.readLine();
                while(s != null){
                    System.out.println(s);
                    s = reader.readLine();
                }
                reader.close();
            }
        }else
            key.next();

        do {
            System.out.println("\nIn quanti volete giocare  ?");
            
            if(key.hasNextInt())
                n = key.nextInt();
            else
                key.next();
            
            if(n <= 0)
                System.out.print("\n\tErrore nell'input, si e' pregati di riprovare\n\n");

            } while (n <= 0);

        do {
            System.out.print("Con quanti mazzi di carte volete giocare ? (le regole standard prevedono 2 mazzi)\n\t:");
            if(key.hasNextInt())
                k = key.nextInt();
            else
                key.next();
            
            if(k <= 0)
                System.out.print("\n\tErrore nell'input, si e' pregati di riprovare\n\n");
            
        } while (k <= 0);

        Partita game = new Partita(n, k);

        while (!game.isEnd())
            game.go();

        System.out.println("\n\nSignori per riscuotere le vostre fish dirigetevi alla cassa");
        key.close();
        return;
    }

    
}