package lesson005;

public class Question041 {

	public static void main(String[] args) {

		// a ile biten kelimelerin yerine ? koycaz
		// olduğu index (5. index gibi) index değişti diyelim. --> yeni değeri?
		// dizinin 0. indexi değişti --> ?
		// ...

		//
		String[] dizi = { "Amerika", "Almanya", "İsveç", "Türkiye", "Danimarka" };
		String yeniDeger = "";
		int i;
		for (i = 0; i < dizi.length; i++) {
			if (dizi[i].endsWith("a")) {
				dizi[i] = "?";
				yeniDeger = dizi[i];
				System.out.println(i + ".indexi değişti -->" + yeniDeger);
			}
		}

	}

}
