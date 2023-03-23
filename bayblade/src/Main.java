import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade programina Hosgeldiniz...");
        System.out.println("Cikis icin q ya basin...");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("hangi Beybladeyi uretmek istiyorsunuz?");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("programdan cikiliyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if(beyblade == null){
                    System.out.println("lutfen gecerli bir beyblade ismi girin.");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}