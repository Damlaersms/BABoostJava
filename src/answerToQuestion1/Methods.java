package answerToQuestion1;

public class Methods {

	public double taxMethod(Personel personel) {
		double vergi = 0;
		if(personel.getSalary()> 2000) {
		 vergi = personel.getSalary()*0.05;
		}
		else {
			
		}
		return vergi;
	}
	

	public double bonusMethod(Personel personel) {
		double bonus = 0;
		if(personel.getWorkHours()> 40) {
		 bonus = (personel.getWorkHours()-40)*30;
		}
		else {
			
		}
		return bonus;
		
	}
	
	public double raiseSalary(Personel personel) {
		int workYears = 2022 - personel.getHireYear();
		double newSalary = 0;
		if (workYears <10) {
			 newSalary = ( personel.getSalary()*0.05);
		}else if (workYears <20) {
			newSalary = (personel.getSalary()*0.10) ;
			}else if (workYears >= 20) {
				newSalary = (personel.getSalary()*0.15);
				}
		return newSalary;
	}
	
	
	
	public void bilgileriGoster(Personel personel) {
		System.out.println("İsim: " +  personel.getName() + 
							"\nSoyisim: " + personel.getSurname() +
							"\nMaaşı: " + personel.getSalary() +
							"\nÇalışma saati: " + personel.getWorkHours() +
							"\nBaşlangıç Yılı: " + personel.getHireYear() +
							"\nVergi: " + taxMethod(personel) +
							"\nBonus: " + bonusMethod(personel) +
							"\nMaaş Artışı: " + raiseSalary(personel) +
							"\nVergi ve Bonuslar ile birlikte maaş: " + (personel.getSalary() + taxMethod(personel) + bonusMethod(personel)) +
							"\nToplam maaş: " + (personel.getSalary() + taxMethod(personel) + bonusMethod(personel) + raiseSalary(personel)));
	}
	
}
