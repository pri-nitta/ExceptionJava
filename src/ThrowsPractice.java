import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ThrowsPractice {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("c:\\nota.txt");
		
		PrintWriter print = new PrintWriter(fw);
		print.println("Ma�a - R$ 4,00");
		print.println("Morango - R% 6,50");
		print.println("Total = R$ 10,50");
		print.close();
		fw.close();
	}
	
	//exce��es que podem ser lan�adas em determinados m�todos
	//fazer o tratamento de exce��o no m�todo chamador

}
