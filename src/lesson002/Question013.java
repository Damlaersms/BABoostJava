package lesson002;

import java.util.Scanner;

public class Question013 {

	public static void main(String[] args) {
		
		//****telefona ve maile bir kod gelicek bu kodları biz tanımlıycaz
		//kullanıcıdan maile ve telefona gelen kod u istiycez
		//eğer onun mailine ve telefonuna giden kod uyuşuyosa
		//sisteme kayıt oldunuz diyelim
		//ya maili hatalıdır ya telefonu ya da ikisi de hatalıdır
		//kullanıcıyı bilgilendir.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen telefonunuza gelen kodu giriniz.");
		int kodTel = scanner.nextInt();
		int kod1 = 1234;
		int kod2 = 0000;
		System.out.println("Lütfen mailinize gelen kodu giriniz.");
		int kodMail = scanner.nextInt();
		
		if(kodMail==kod2 && kodTel==kod1) {
			System.out.println("sisteme kayıt oldunuz");
		}
		else {
			System.out.println("lütfen kodu kontrol ediniz.");
		}
		
		
		
		
	}

}
