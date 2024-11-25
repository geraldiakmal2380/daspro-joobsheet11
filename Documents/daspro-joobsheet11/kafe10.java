import java.util.Scanner;

public class kafe10{

    public static int menghitungtotalharga(int pilihanmenu,int Banyakitem){//fungsi menghitung total harga
        int[] hargaitems = {15000,20000,2200,12000,10000,18000};

        int hargatotal = hargaitems[pilihanmenu-1]*Banyakitem;
        return hargatotal;
    }

    public static void menu(String namapelanggan,boolean isMember,String kodepromo){//fungsi printout 

        System.out.println("Halo Selamat datang, "+namapelanggan+" !");

        if (isMember){
            System.out.println("Karena anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        if (kodepromo.equals("DISKON50")){
            System.out.println("Kode Promo telah dimasukan,Selamat anda mendapatkan diskon 50%");
        }
        else if(kodepromo.equals("DISKON30")){
            System.out.println("Kode Promo telah dimasukan,Selamat anda mendapatkan diskon 30%");
        }
        System.out.println("====Menu Resto Kafe====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");   
        System.out.println("Silahkan pilih menu yang anda inginkan.");    
    }


    public static void main(String args[]){//main yang akan dilaksanakan
        Scanner mlebu10 = new Scanner(System.in);
       menu("andre", true,"DISKON50");
       System.out.print("\nMasukan nomor yang ingin anda pesan :");
       int pilihanmenu = mlebu10.nextInt();
       System.out.print("\nMasukan Jumlah item yang ingin anda pesan :");
       int Banyakitem = mlebu10.nextInt();

       int totalharga = menghitungtotalharga(pilihanmenu,Banyakitem);
       
    }
}