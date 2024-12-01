import java.util.Scanner;

public class CafeIbuMariana {
    public static int memasukandata(String sekaranghariapa,int cekapakahini1,String menuapaini){//ini fungsi untuk memasukan nilai
        Scanner mlebu = new Scanner(System.in);
        if(cekapakahini1 == 0){
            System.out.println("Sekarang adalah hari "+sekaranghariapa);
        }
        int a=0;
        System.out.print("Masukan Menu Penjualan "+menuapaini+" hari "+sekaranghariapa+" :");
        a = mlebu.nextInt();
        return a;
    
    }
    
    public static void cetakseluruhdata(int[][] datapenjualan,String[] hariapanini,String[] menuapaini){//fungsi untuk mencetak seluruh data
        for (int x=0;x<datapenjualan.length;x++){
            for(int y=0;y<datapenjualan[1].length;y++){
                if (y==0){
                    System.out.println("Sekarang adalah hari "+hariapanini[x]);
                }
                System.out.println("Menu penjualan "+menuapaini[y]+" adalah sebanyak "+datapenjualan[x][y]);
            }
            
        }
        }

    public static int hitungseluruhpenjualanmenu(int[][] datapenjualan,String[] ikilhomenuopo){
        int[] jumlahpenjualan = new int[5];

        for(int x=0;x<datapenjualan[1].length;x++){
            System.out.println("total dari penjualan"+);
        }
    }
        
    public static void main(String[] args) {
        int[][] datapenjualan = new int[5][5];
        String[] hari = {"senin","selasa","rabu","Kamis","jumat"}; 
        String[] menu = {"kopi","teh","Degan","Roti bakar","Gorengan"};  

       for(int hitung=0;hitung<datapenjualan.length;hitung++){
            for(int daleman=0;daleman<datapenjualan[1].length;daleman++){
                datapenjualan[hitung][daleman] = memasukandata(hari[hitung],daleman,menu[daleman]);//akan dilempar di fungsi memasukandata (atas sendiri)
            }
       }
        cetakseluruhdata(datapenjualan,hari,menu);//akan dilempar ke fungsi cetakseluruh data(fungsi ke-2 dari atas)
        hitungseluruhpenjualanmenu(datapenjualan,menu);

       
    }
    
    /* 
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[0][2]); // Outputs 3
    System.out.println(myNumbers[1][2]); // Outputs 7
    */
}
