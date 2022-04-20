import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {

		Usuario u = new Usuario();
		Usuario u1 = new Usuario();
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
			
		lista.add(u);
		lista.add(u1);
		
		System.out.println(lista.size());
		
		lista.remove(u1);
		
		System.out.println(lista.size());
		System.out.println(lista.indexOf(u));
		System.out.println(lista.get(0));
		
		
		
		
		
}
}
