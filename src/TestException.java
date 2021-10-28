public class TestException{
	
	public static void main(String[] args){
		
		try {
			//trecho onde a exceção pode ocorrer
			int val = 10 / 0;
			
			int[] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
			//captura da exceção
		} catch (ArithmeticException e) {
			
			System.out.println("Não é possível fazer a divisão por zero!");
			
			System.out.println(e.getMessage());
			
			//tratativa - imprime a pilha de erro da exceção
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não é possível acessar a posição 4 do array!");
			
		} catch (NullPointerException e) {
			
			System.out.println("Não foi possível retornar o lenght, variável não instanciada");
			
		} catch(NumberFormatException e) {
			 
			System.out.println("Não foi possível a conversão");
			
		} catch(Exception e) {
			
			System.out.println("Erro na execução do programa!");
			
		} finally {
			
			System.out.println("sempre passará por aqui!");
		}
		
	
	}
}