
public class Oiseau extends Animal {

	public Oiseau(){
		super();
		this.setAgeMaxi(10);
		this.vieillisement = 2;
	}

	public Oiseau(String nom) {
		super(nom);
		this.setAgeMaxi(10);
		this.vieillisement = 2;

	}

	public String crier(){
		  if(this.isVivant())
			  return "cui, cui!";
		  return this.getNom()+ " reste muet..";
	  }
		 
	public void vieillir() {
		if(this.getAge() >= this.getAgeMaxi())
			this.mourir();
		else {
			this.setAge(this.getAge()+2);
		}
	}
	
}
