package lesson024;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {
	
	/*
	 * System.out.println("0- Çıkış"); System.out.println("1- Dosya Yarat");
	 * System.out.println("2- Ekle"); System.out.println("3- Okuma");
	 * System.out.println("4- Dosya silme");
	 * System.out.println("lütfen işlem seçiniz");
	 */
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		FileIslemler fileIslemler = new FileIslemler();
		fileIslemler.menu();
	}

	public void menu() {
		int input = 0;
		do {
			System.out.println("0- Çıkış");
			System.out.println("1- Dosya Yarat");
			System.out.println("2- Metin Ekle");
			System.out.println("3- Dosya Oku");
			input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				try {
					dosyaOlustur(FileSabitler.file);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				try {
					metinEkle(FileSabitler.file);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				try {
					dosyaOku(FileSabitler.file);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			default:
				break;
			}
		} while (input != 0);
	}

	private void dosyaOku(File file) throws Exception {
		if (file.exists()) {
			FileReader fileReader = null;
			String text = "";
			int okunacak;
			try {
				fileReader = new FileReader(file);

				while ((okunacak = fileReader.read()) != 1) {
					text = text + (char) okunacak;

				}
			} catch (Exception e) {

			} finally {
				fileReader.close();
			}
			System.out.println(text);
		} else {
			throw new Exception("Dosya Bulunamadı");
		}

	}

	// dosya oluşmuşsa hata fırlatalım
	// dosya oluşturulmuştur diye
	public void dosyaOlustur(File file) throws Exception {

		if (file.exists()) {
			throw new Exception("Bu dosya önceden oluşturulmuştur.");
		} else {
			System.out.println("dosya oluşturuluyor...");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("Dosyanız oluşturulmuştur.");
		}
//		try {
//			FileWriter file = new FileWriter(FileSabitler.file);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public void metinEkle(File file) throws Exception {

		if (file.exists()) {
			System.out.println("Metin Girin: ");
			String text = scanner.nextLine();
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(file, true);
				fileWriter.write(text + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fileWriter != null) {
					try {
						fileWriter.close();
					} catch (Exception e) {
						throw new Exception("Dosya Kapatma Sırasında Beklenemdik Bir hata Meydana Geldi");
					}
				}
			}
		} else {
			throw new Exception("Dosya Bulunamadı");
		}
	}


}
