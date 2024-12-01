public class pengunjungcafe10 {
    public static void daftarpengunjung(String... namapengunjung){
        System.out.println("Daftar nama pengunjung :");
        for(String a : namapengunjung){
            System.out.println("-"+a);
        }
    }

    public static void main(String[] args) {
        daftarpengunjung("Andre","Budi","Citra");
    }
}
