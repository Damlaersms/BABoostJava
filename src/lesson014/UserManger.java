package lesson014;

public class UserManger {
	
	private final String emailFormat = "@xbanka.com";

	public void generetaAutoEmail(User user) {
		user.setEmail(
				user.getName().toLowerCase().replace(" ", ".") + '.' +
				user.getSurname().toLowerCase() + emailFormat);
	}

	public void alternatifOtomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
				.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;
		user.setEmail(otomatikOlusanEmail);
	}
	
	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		
		System.out.println(para + " Değerinde kredi başvursu yaptınız");
		System.out.println("Lütfen onay bekleyin... ");
	}

}
