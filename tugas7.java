public class tugas7 {
    public static void main(String[] args) {
        float jumlah=0, i=1;
        double hasil;
        while (i<=10){
            jumlah = jumlah + i;
            i++;
        }

        jumlah = jumlah / (i-1);
        System.out.println("Hasilnya adalah.... " +jumlah);
    }
}