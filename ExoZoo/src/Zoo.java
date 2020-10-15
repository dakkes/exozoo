import java.util.ArrayList;
 
public class Zoo {
	
	private String directeur;
	private ArrayList<Animal> animaux;

	public Zoo() {
		super();
		this.animaux = new ArrayList<Animal>();
		// TODO Auto-generated constructor stub
	}
	public Zoo(String directeur) {
		super();
		this.directeur = directeur;
		this.animaux = new ArrayList<Animal>();
	}
	
	public String getDirecteur() {
		return directeur;
	}
	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
	public ArrayList<Animal> getAnimal() {
		return animaux;
	}
	public void setAnimal(ArrayList<Animal> animal) {
		this.animaux = animal;
	}
	
	
	public void ajouterAnimal(Animal animal){
		animaux.add(animal);
		animal.setZoo(this);
			 
	}
	//methode mourir un animal
	public void mourir(Animal animal){
		animal.mourir();
		
			 
	}
	public void retirer (Animal animal) {
		animaux.remove(animal);
	}
	//feter anniversaire
	
	
	
	public void feterAnniversaire() {
		ArrayList<Animal> animauxClone;
		animauxClone = (ArrayList)animaux.clone();
		for( Animal animal : animauxClone) {
			animal.vieillir();
		}
	}
	//methode nourit et cri
	
	public void nourrir(){
		for (Animal animal : animaux) {
			System.out.println(animal.nourrir());
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Zoo [directeur=" + directeur + ", animaux=" + animaux + "]";
	}
	
	
	} 
	 


