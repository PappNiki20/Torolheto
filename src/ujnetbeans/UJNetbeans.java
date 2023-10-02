
package ujnetbeans;


import java.awt.BorderLayout;
import java.util.Scanner;

public class UJNetbeans {
static String[] pakli = new String[22]; 
   
    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            beker();
            kever();
            
        }
        ezvolt();
        
    }

    private static int beker() {
        Scanner sc = new Scanner(System.in);
        int oszlop = sc.nextInt();
        System.out.println("Kérem adja meg az oszlop számat"+oszlop);
        boolean jo  = oszlop>0 && oszlop<=3 ;
        return oszlop;
    }

    private static void ezvolt() {
        System.out.println( "A gondolt kártya: "+pakli[11]);
    }

    private static void kever() {
        String ujlista[] = new String[22];
        switch (var) {
            case val:
                
                break;
            default:
                throw new AssertionError();
        }
    }

    private static void feltolt() {
        String[] szamok = {"X", "XI", "VIII"};
        String[] szinek = {"piros", "zold", "tok", "makk"};
        for (int i = 1; i < szinek.length; i++) {
            for (String string : szamok) {
            pakli[i++] = szamok[i] +"_"+szinek[i];
            
        }
        }
        
    }
    
}
