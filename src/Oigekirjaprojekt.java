import java.util.Scanner;
    public class Oigekirjaprojekt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String sona1;
            String sona2;
            String sona3;
            String sona4;
            String sona5;
            String sona6;
            String sona7;
            String sona8;
            String sona9;
            String sona10;
            int punktid = 0; // inimene alustab 0-i punktiga
            System.out.println("Kirjuta palun ainult jah või ei vastuseks");
            System.out.println("Kas sõna meestesokid on õigesti kirjutatud? (jah / ei)");
            sona1 = scanner.nextLine();
            if (sona1.equalsIgnoreCase("jah")) {
                System.out.println("Õige");
                punktid++;
            }  else  {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna erru minek on õigesti kirjutatud? (jah / ei)");
            sona2 = scanner.nextLine();
            if (sona2.equalsIgnoreCase("ei")) {
                System.out.println("Õige");
                punktid++;
            }  else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna peastarvutus on õigesti kirjutatud? (jah / ei)");
            sona3 = scanner.nextLine();
            if (sona3.equalsIgnoreCase("jah")) {
                System.out.println("Õige");
                punktid++;
            } else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna vanematekogu on õigesti kirjutatud? (jah / ei)");
            sona4 = scanner.nextLine();
            if (sona4.equalsIgnoreCase("jah")) {
                System.out.println("Õige");
                punktid++;
            }  else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna loodekarjamaa on õigesti kirjutatud? (jah / ei)");
            sona5 = scanner.nextLine();
            if (sona5.equalsIgnoreCase("jah")) {
                System.out.println("Õige");
                punktid++;
            }  else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna veerand aasta on õigesti kirjutatud? (jah / ei)");
            sona6 = scanner.nextLine();
            if (sona6.equalsIgnoreCase("ei")) {
                System.out.println("Õige");
                punktid++;
            } else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna kaheinimese tuba on õigesti kirjutatud? (jah / ei)");
            sona7 = scanner.nextLine();
            if (sona7.equalsIgnoreCase("ei")) {
                System.out.println("Õige");
                punktid++;
            } else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna lokkisjuuksed on õigesti kirjutatud? (jah / ei)");
            sona8 = scanner.nextLine();
            if (sona8.equalsIgnoreCase("ei")) {
                System.out.println("Õige");
                punktid++;
            } else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna pehmepaber on õigesti kirjutatud? (jah / ei)");
            sona9 = scanner.nextLine();
            if (sona9.equalsIgnoreCase("jah")){
                System.out.println("Õige");
                punktid++;
            } else {
                System.out.println("Vale");
            }
            System.out.println("Kas sõna elavnurk on õigesti kirjutatud? (jah / ei)");
            sona10 = scanner.nextLine();
            if (sona10.equalsIgnoreCase("jah")) {
                System.out.println("Õige");
                punktid++;
            } else {
                System.out.println("Vale");
            }
            double punktid1 = (100.0/10) * punktid;
            System.out.println("Sinu punktid:  " + punktid + "/10 " + ", Mis on " + punktid1 + "%");
            if (punktid <= 4) {
                System.out.println("Sinu hinne oleks 2, pead töö uuesti sooritama :(");
            } else if (punktid < 8) {
                System.out.println("Sinu hinne oleks 3");
            }
            else if ( punktid == 8) {
                System.out.println("Sinu hinne oleks 4");
            } else {
                System.out.println("Sinu hinne oleks 5, Hästi tehtud :)");
            }
            scanner.close();
        }
}
