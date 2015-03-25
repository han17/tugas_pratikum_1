public class menghitung8{
		public static void main(String[] args) {
			System.out.println("Hitung Rata-rata");
			int awal=2;
			int akhir=30;
			int jumlah=0;
			int rata;
			System.out.println("rata-rata nilai awal"+awal);
			System.out.println("rata-rata nilai akhir"+akhir);
			while (awal<=akhir);{
				jumlah=jumlah+awal;
				awal++;
			}
			System.out.println(jumlah);
			rata=jumlah/akhir;
			System.out.println("jumlah rata-rata="+rata);
		}
}