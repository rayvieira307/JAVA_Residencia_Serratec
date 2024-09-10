package exception;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente("123-1", 2000.);
		
		try {
			cc.deposito(0.);
			cc.saque(200.);
			System.out.println(cc.toString());
			
		} catch (ContaException e) {
			
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		finally 
		{
			System.out.println(cc);
		}
		

	}

}
