
public class Animal {

	private boolean vivant;
	private int age;
	private int ageMaxi;
	public int vieillisement;
	public String nom;

	public Animal() {
		 
	}

	public Animal(String nom) {
		super();
		this.vivant = true;
		this.age = 0;
		this.ageMaxi = 10;
		this.nom = nom;
		this.vieillisement = 1;
		
	}

	public boolean isVivant() {
		return vivant;
	}

	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAgeMaxi() {
		return ageMaxi;
	}

	public void setAgeMaxi(int ageMaxi) {
		this.ageMaxi = ageMaxi;
	}

	public int getVieillisement() {
		return vieillisement;
	}

	public void setVieillisement(int vieillisement) {
		this.vieillisement = vieillisement;
	}

	public String Cri() {
		return "ne peut pas crier";
	}

	 

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/*public void vieillir() {
		age = age + 1;
		if (age > ageMaxi)
			this.mourir();
		else {
			age = age + 1;
		}
	}
	*/

	public void mourir() {
		this.setVivant(false);
	}
	
	public void vieillir() {
		if (this.getAge() >= this.getAgeMaxi())  // doitMourir()
			this.mourir();
		else
//			this.setAge(this.getAge() + this.getVieillisement());
//			ou bien :
			this.basicVieillir();
	}
	
	private void basicVieillir() {
		age += vieillisement;
	}
	@Override
	public String toString() {
		if (this.isVivant())
			return this.getNom() + " est agé de " + getAge();
		return this.getNom() + " est décédé";
	}

	 

}
