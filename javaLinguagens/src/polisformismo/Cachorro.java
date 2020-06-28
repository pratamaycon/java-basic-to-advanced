package polisformismo;

public class Cachorro extends Animal{

	@Override
	public void som() {
		System.out.println("Huau");
	}
	
	@Override
	public void mensagem() {
		System.out.println("Sou um animal");
	}

}
