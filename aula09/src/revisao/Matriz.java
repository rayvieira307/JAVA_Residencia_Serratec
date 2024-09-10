package revisao;

public class Matriz {
    
	public static void main(String[] args) {
		
		String []  [] pessoas =  {{"Rayssa ", "ray@gmail.com"},
           	  {"Douglas", "dg@gmail.com"}, 
                {"Brenda", "br@gmail.com"}} ;

	
		for (int i = 0; i < pessoas.length; i++) {
			
			for (int j = 0; j <pessoas[i].length; j++) {
				
				System.out.println(pessoas[i][j]);
			}
			
			
		}
	}
	
}
