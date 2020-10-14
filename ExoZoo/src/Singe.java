
public class Singe extends Animal {
	
	 
		public Singe(){
			super();
			this.setAgeMaxi(10);
			 
		}

		public Singe(String nom) {
			super(nom);
			this.setAgeMaxi(20);
			 
		}

		public String crier(){
			  if(this.isVivant())
				  return "hello je suis le singe!";
			  return this.getNom()+ " reste muet..";
		  }
			 
		public void vieillir() {
			if(this.getAge() >= this.getAgeMaxi())
				this.mourir();
			else {
				this.setAge(this.getAge()+1);
			}
		}
}
