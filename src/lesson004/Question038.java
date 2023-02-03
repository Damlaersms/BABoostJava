package lesson004;
import java.util.Scanner;
public class Question038 {

	public static void main(String[] args) {
		// kullanıcıdan
		//email, passowrd, repassword alalım
		
		//emaili kontrol edicez @hotmail.com, @outlook.com mu diye
		//emailiniz email formatında değildir uyarısı
		
		//password repassword 
		//ikisi aynı değilse passwordler uyuşmuyo
		//password min 8 karakter olsun
	
		Scanner scanner = new Scanner(System.in);

		boolean check = true;
		while (check) {
			System.out.println("mail girin: ");
			String mail =scanner.nextLine();
			System.out.println("şifre girin: ");
			String password =scanner.nextLine();
			System.out.println("tekrar şifre girin: ");
			String repassword =scanner.nextLine();
			
			if(!(mail.contains("@hotmail.com") || mail.contains("@outlook.com"))) {
				System.out.println("email formatı yanlış");
			}else {
				if(password.equals(repassword)&& (password.length() >=8)) {
					System.out.println("giriş yaptınız" + mail);
					check = true;
				}else {
					System.out.println("ya şifreler uyuşmuyo ya da şifre 8den küçük");
				}
			}
			///githubdan al
		}
		
	}

}
