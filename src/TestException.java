public class TestException{
	
	public static void main(String[] args){
		
		try {
			//trecho onde a exce��o pode ocorrer
			int val = 10 / 0;
			
			int[] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
			//captura da exce��o
		} catch (ArithmeticException e) {
			
			System.out.println("N�o � poss�vel fazer a divis�o por zero!");
			
			System.out.println(e.getMessage());
			
			//tratativa - imprime a pilha de erro da exce��o
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("N�o � poss�vel acessar a posi��o 4 do array!");
			
		} catch (NullPointerException e) {
			
			System.out.println("N�o foi poss�vel retornar o lenght, vari�vel n�o instanciada");
			
		} catch(NumberFormatException e) {
			 
			System.out.println("N�o foi poss�vel a convers�o");
			
		} catch(Exception e) {
			
			System.out.println("Erro na execu��o do programa!");
			
		} finally {
			
			System.out.println("sempre passar� por aqui!");
		}
		
	
	}
}