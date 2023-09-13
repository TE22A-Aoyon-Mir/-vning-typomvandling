import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner (System.in);
        
        System.out.println("Divisions program:");
        System.out.println("Ange tal 1:");
        int tal1 = tangentbord.nextInt();
        System.out.println("Ange tal2:");
        int tal2 = tangentbord.nextInt();
        double kvot = tal1/tal2;
        double dkvot= (double)tal1/tal2;
        System.out.println("Kvoten är: "+dkvot);
        System.out.println("Kvoten är: "+kvot);

        tangentbord.nextLine();

        System.out.println("Substantiv program:");
        System.out.println("Ange ett substantiv:");
        String sub = tangentbord.nextLine();
        System.out.println("Ange substantivets pluraländelse:");
        String subä = tangentbord.nextLine();
        System.out.println("En/ett "+sub+" flera "+sub+subä);
    }
}
