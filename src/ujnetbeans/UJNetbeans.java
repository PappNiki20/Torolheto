
package ujnetbeans;



import java.util.Scanner;

public class UJNetbeans {
static String[] pakli = new String[22]; 
   
    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            
            kever();
            kirak();
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
        int b_oszlop = beker();
        switch (b_oszlop) {
            case 1:
                for (int i = 0; i < pakli.length; i++) {
                    ujlista[1-7] = pakli[20-(i-1)*3];
                    ujlista[7-14] = pakli[19-(i-1)*3];
                    ujlista[14-21] = pakli[21-(i-1)*3];
                }
                 case 2:
                for (int i = 0; i < pakli.length; i++) {
                    ujlista[1-7] = pakli[19-(i-1)*3];
                    ujlista[7-14] = pakli[20-(i-1)*3];
                    ujlista[14-21] = pakli[21-(i-1)*3];
                }
                  case 3:
                for (int i = 0; i < pakli.length; i++) {
                    ujlista[1-7] = pakli[21-(i-1)*3];
                    ujlista[7-14] = pakli[20-(i-1)*3];
                    ujlista[14-21] = pakli[19-(i-1)*3];
                }
                break;
            default:
                throw new AssertionError();
        }
        pakli = ujlista;
    }

    private static void feltolt() {
        String[] szamok = {"X", "XI", "VIII", "Kiraly", "ász"};
        String[] szinek = {"piros", "zold", "tok", "makk"};
            int i = 1;
            for ( String szin : szinek) {
            pakli[i] = szin+"_"+szinek[i];
            i++;
            
            
        
        }
        
    }

    private static void kirak() {
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf(pakli[i]);
        }
    }
    
}
