package Huffman;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Leitura {

	public int [] freq;
	public int cont;
	
	public Leitura() {
		
		freq = new int[256]; 
		for(int c: freq) {
			c = 0;
		}
		
	}
	
	public int [] ler() {
		
		try {
			
			File teste = new File("C:\\Users\\niciu\\Desktop\\notas\\doc.txt");
		    FileInputStream arq = new FileInputStream(teste);
			byte caracter;
			caracter = (byte) arq.read();
			int aux;
			cont =0;
			
			while(caracter!= -1) {
			
				aux = caracter;
				if(freq[aux]<1) cont++;
				freq[aux]++;
				caracter = (byte) arq.read();
				
		    }
			
			
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.\n",
		          e.getMessage());
		    }
		return freq;
		
	}
	public int getCont() {
		return this.cont;
	}
	
}
