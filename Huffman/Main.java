package Huffman;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Leitura l = new Leitura();
		int [] freq = l.ler();
		NodeHuffman [] nodes = new NodeHuffman[l.getCont()];
		int cont=0;
		for(int i=0 ; i<256 ; i++) {
			if(freq[i]!=0) {
				nodes [cont++] =new NodeHuffman(freq[i], (char)(i));
			}
		}
		Huffman huf = new Huffman(freq, nodes);
		NodeHuffman raiz = huf.doHuffman();
		String teste ="";
		huf.printTree(teste,raiz, "");
		
	}
}
