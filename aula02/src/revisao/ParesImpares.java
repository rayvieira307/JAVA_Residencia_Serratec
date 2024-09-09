package revisao;

public class ParesImpares {

		public static void main(String[] args) {
			
			int contador1 = 0;
			int contador2 = 0;
			for (int i = 1; i<=20; i++) {
				if(i%2 == 0) {
					
					contador1++;
					System.out.println(i+ " é Par");
				}
							
				else {
					System.out.println(i+ " é Impar");
					contador2++;
				}
				
				
			}
			System.out.println("Os números pares são " + contador1);
			System.out.println("Os números ímpares são " + contador2);

}
}