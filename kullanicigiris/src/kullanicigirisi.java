import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {

        String asil = "merve";
        int has = 1234;

        String adi;
        int sifre;


        Scanner input = new Scanner(System.in);
        adi = input.nextLine();
        System.out.println(adi);

        Scanner inpu = new Scanner(System.in);
        sifre = inpu.nextInt();
        System.out.println(sifre);

        if((adi.equals(asil)) && (sifre==has)){
            System.out.print("doğru yazdın kız");
        }

        else if ((!adi.equals(asil)) && (sifre!=has)){
            System.out.println("yanlış yazdın kız");
        }

    }
}
