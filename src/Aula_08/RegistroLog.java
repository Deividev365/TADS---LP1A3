package Aula_08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegistroLog {
	
	private File Log;
	
	  public void escreveArq(String b, LocalDateTime ld, int n, String produto) throws IOException {
	        FileWriter fw = new FileWriter(b,true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(" -> Seu ID �: " + ld + " Voc� solicitou a inser��o de produto em uma posi��o espec�fica\n" + n + " Nome do Produto:\n " + produto);
	        bw.close();
	    }
	
	
}
