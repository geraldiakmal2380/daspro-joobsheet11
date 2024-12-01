import java.util.Scanner;
public class percobaan6 {

    static int hitungluas(int pjg,int lbr){
        int Luas = pjg*lbr;
        return Luas;
    }
    static int hitungvol(int pjg,int lbr,int tgi){
        int vol = pjg*lbr*tgi;
        return vol;
    }
    public static void main(String[] args) {
        int p,l,L,t,vol;
        Scanner mlebu = new Scanner(System.in);
        System.out.print("Masukan panjang :");
        p = mlebu.nextInt();
        System.out.print("Masukan Lebar :");
        l = mlebu.nextInt();
        System.out.print("Masukan Tinggi :");
        t = mlebu.nextInt();
        
        System.out.println("Luas dari persegi panjang adalah "+hitungluas(p, l));
        System.out.println("Volume dari balok adalah "+hitungvol(p, l, t));
    }
}
