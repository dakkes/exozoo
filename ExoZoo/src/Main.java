
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Chien chien;
		chien= new Chien("chien-1");
		
		System.out.println(chien);
		
		chien.vieillir();
		System.out.println(chien);
		System.out.println(chien.crier());
		
		
		Animal animal;
		
		animal=new Animal();
		
		System.out.println(animal);
		
		animal.vieillir();
		System.out.println(animal);
		for(int i=0;i<20;i++) {
			animal.vieillir();
		}
		System.out.println(animal);
		System.out.println(animal.getAge());

		// oiseau 
		
		Oiseau oiseau;
		oiseau=new Oiseau("oiseau-1");
		
		oiseau.vieillir();
		
		
		System.out.println(oiseau);
		System.out.println(oiseau.crier());
		
		//singe
		
		Singe singe;
		singe=new Singe("Tchitta");
		
		singe.vieillir();
		
		
		System.out.println(singe);
		System.out.println(singe.crier());*/
		
		
		Animal animal;
		Chien bill;
		Singe chita;
		
		animal = new Animal("Animal-1");
		bill = new Chien("Bill");
		chita = new Singe("Chita");
		
		
		System.out.println(animal);
		System.out.println(bill);
		System.out.println(chita);
		
		animal.vieillir();
		bill.vieillir();
		System.out.println(animal);
		System.out.println(bill);
		for (int i = 0; i < 20; i++) {
			animal.vieillir();
		}
		System.out.println(animal);
		System.out.println(animal.getAge());
		
		for (int i = 0; i < 20; i++) {
			bill.vieillir();
		}
		
		System.out.println(bill);
		System.out.println(bill.getAge());
		
		System.out.println(bill.crier());
		
	}

}
