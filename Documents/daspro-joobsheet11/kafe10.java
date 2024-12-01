import java.util.Scanner;

public class kafe10{

    
    public static double menghitungtotalharga(int pilihanmenu,int Banyakitem,double valuediskon){//fungsi menghitung total harga
        int[] hargaitems;
        hargaitems = new int[]{15000,20000,22000,12000,10000,18000};
        String[] menuStrings = {"Kopi Hitam","Cappucino", "Latte","Teh tarik","Roti Bakar","Mie goreng"};
        System.out.println(menuStrings[pilihanmenu]+" Rp"+hargaitems[pilihanmenu]+" x"+Banyakitem);
        double hargamenupilih = hargaitems[pilihanmenu];
        double hargatotal = hargamenupilih*Banyakitem;
        return hargatotal;
    }

    public static double menu(String namapelanggan,boolean isMember,String kodepromo){//fungsi printout 
        double diskon = 0;
        System.out.println("Halo Selamat datang, "+namapelanggan+" !");

        if (isMember){
            System.out.println("Karena anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        if (kodepromo.equals("DISKON50")){
            System.out.println("Kode Promo telah dimasukan,Selamat anda mendapatkan diskon 50%");
            diskon = 0.5;
        }
        else if(kodepromo.equals("DISKON30")){
            System.out.println("Kode Promo telah dimasukan,Selamat anda mendapatkan diskon 30%");
            diskon = 0.3;
        }
        else{
            System.out.println("Maaf kode invalid.Tidak ada diskon buat kamu");
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
        return diskon;
    }


    public static void main(String args[]){//main yang akan dilaksanakan
        //mboh iki jeneng e opo
        Scanner mlebu10 = new Scanner(System.in);
        double diskon = menu("andre", true,"null");//memanggil fungsi menu
        int[][] pilihanmenudanbanyakitem = new int[15][2];
        double therealtotalharga=0;
        char memesanlagi;
        //mulai looping utk kode memilih menu
        int x=0;//deklarasi di luar agar bisa dibaaca kode di bawahnya
        for(x=0;x<pilihanmenudanbanyakitem.length;x++){

            System.out.print("\nMasukan nomor yang ingin anda pesan :");
            pilihanmenudanbanyakitem[x][0]=mlebu10.nextInt();
            pilihanmenudanbanyakitem[x][0]--;
            System.out.print("\nMasukan Jumlah item yang ingin anda pesan :");
            pilihanmenudanbanyakitem[x][1]=mlebu10.nextInt();
            System.out.print("\napakah anda ingin memesan lagi?(y/n) :");
            memesanlagi =mlebu10.next().charAt(0);
            mlebu10.close();
            if (memesanlagi == 'y'||memesanlagi == 'Y'){
                
            }
            else{
                break;
            }
        }
        //JANGAN DI UNCOMMENT!!!! hanya utk di test
        /** 
        
        for (int a=0;a<15;a++){
            for(int b=0;b<2;b++){
                if(b==0){
                System.out.println("pesanan no "+(pilihanmenudanbanyakitem[a][b]+1));
                }
                else{
                    System.out.println("dengan jumlah "+pilihanmenudanbanyakitem[a][b]); 
                } 
            }
            System.out.println("Loop baris ke -"+a+" selesai"); 
        }
        */
        //ini spacer
        

        //print awalan list menu
        System.out.println("Semua pesanan anda adalah :");
        //menghitung total harga
        for (int a=0;a<=x;a++){
        therealtotalharga += menghitungtotalharga(pilihanmenudanbanyakitem[a][0],pilihanmenudanbanyakitem[a][1], diskon);
        
        }
       System.out.println("Total harga untuk pesanan anda adalah Rp"+therealtotalharga);
       
    }
}