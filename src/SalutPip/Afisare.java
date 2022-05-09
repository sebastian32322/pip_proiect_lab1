package SalutPip;

public class Afisare {

	public static void main(String[] args) {
		System.out.println("SALUT PIP - 09.05.2022");
		
		int a = 2;
		System.out.println("primul commit din proiect 15:42 ");
		
		boolean b = true;
		System.out.println("al doilea commit din proiect 15:51");

		
		int c = 3;
		
		Suma d = new Suma(a, c);
		
		d.Afisare();
	}

}
