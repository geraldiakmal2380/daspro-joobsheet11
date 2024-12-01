import java.util.Scanner;
public class kubus10 {

    public static int luaspermukaan(int panjang,int lebar,int dukur){
        int asdsasd = 2*((panjang*lebar)+(panjang*dukur)+(lebar*dukur));
        return asdsasd;
    }

    public static int volumekubus(int panjang,int lebar,int dukur){
        int asdsasd = panjang*lebar*dukur;
        return asdsasd;
    }
    public static void main(String[] args) {
        int p,l,t;
        Scanner mlebu = new Scanner(System.in);
        System.out.println("Program menghitung Luas Permukan kubus dan volume kubus");
        System.out.print("Masukan Panjang Kubus :");
        p = mlebu.nextInt();
        System.out.print("Masukan Lebar Kubus :");
        l = mlebu.nextInt();
        System.out.print("Masukan Tinggi Kubus :");
        t = mlebu.nextInt();
        mlebu.close();
        System.out.println("Luas Permukaan dari kubus tersebut adalah "+luaspermukaan(p,l,t));
        System.out.println("Volume Permukaan dari kubus tersebut adalah "+volumekubus(p,l,t));
    }
}
