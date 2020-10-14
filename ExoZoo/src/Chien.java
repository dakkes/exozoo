
public class Chien extends Animal {
	

    

public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chien(String nom) {
		super(nom);
		 this.setAgeMaxi(80);
	}

public String crier(){
	  if(this.isVivant())
		  return "ouah, ouah!";
	  return this.getNom()+ " reste muet..";
  }
	 
public void vieillir() {
	if(this.getAge() >= this.getAgeMaxi())
		this.mourir();
	else {
		this.setAge(this.getAge()+7);
	}
}
	 
	 
	 
	 
	 

}
