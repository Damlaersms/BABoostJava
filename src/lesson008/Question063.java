package lesson008;

import java.util.Scanner;

public class Question063 {

	

	public static boolean emailKontrol() {
		boolean mailKontrol = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("mail giriniz: ");

		String mail = scanner.nextLine();
		mail.trim();
		if (!(mail.endsWith("@hotmail.com") || mail.endsWith("@gmail.com"))) {
			mailKontrol = false;
		}
		return mailKontrol;
	}

	public static boolean passwordKontrol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("şifre giriniz: ");
		String sifre1 = scanner.nextLine();

		System.out.println("şifre giriniz: ");
		String sifre2 = scanner.nextLine();
		boolean check1 = true;
		if (sifre1.equals(sifre2)) {
		} else {
			check1 = false;
		}
		return check1;
	}

	public static void login() {
		boolean passwordCheck = passwordKontrol();
		boolean emailCheck = emailKontrol();

		if (passwordCheck && emailCheck) {
			System.out.println("giriş yaptınız");
		} else {
			System.out.println("bilgiler yanlış");
		}
	}
	
	public static void emailKontrol2(String email) {
		//abc@gmail.com
		if (email.contains("@")) {
			int index = email.indexOf('@');
			System.out.println(index);
			String kontrol = email.substring(index, email.length());
			System.out.println(kontrol);
			//kontrol --> @gmail.com

			if (kontrol.equals("@hotmail.com") || kontrol.equals("@gmail.com")) {
				System.out.println("doğru format");
			}else {
				System.out.println("emial doğguı format değil");
			}
		}else {
			System.out.println("@ yok");
		}
	}
	
		public static void main(String[] args) {
		// 2 metod yazıcaz
		// 1- kullanıcıdan aldığımız email değerini kontrol edelim doğru formatta mı diye
		// @ var mı?
		// hotmail.com veya gmail.com ile mi bitiyor
		// 2- password ve repassword alıp bunların uyuşup uyuşmadığını kontrol edicez
		//
			// bilg@gmail.com
			// indexOf(@)
			// substring()
			// equals()

			// endswith()
			//emailKontrol2("basadas@gmail.com12");
			login();
		
	}

}
