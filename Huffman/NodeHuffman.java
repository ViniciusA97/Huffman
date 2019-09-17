package Huffman;

public class NodeHuffman {

	private NodeHuffman pai;
	private NodeHuffman esq;
	private NodeHuffman dir;
	private int lado;
	private int freq;
	private char simbolo;
	
	public NodeHuffman(char s,NodeHuffman pai, NodeHuffman esq, NodeHuffman dir , boolean bool, int f) {
		
		this.pai = pai;
		this.esq = esq;
		this.dir = dir; 
		this.freq = f;
		this.simbolo=s;
	}
	
	public NodeHuffman(int f , char s) {
		this.freq = f;
		this.simbolo=s;
		this.esq = null;
		this.dir = null;
		
	}
	
	public NodeHuffman() {
		// TODO Auto-generated constructor stub
	}

	public NodeHuffman getPai() {
		return pai;
	}
	
	public void setPai(NodeHuffman pai) {
		this.pai = pai;
	}
	
	public NodeHuffman getEsq() {
		return esq;
	}
	
	public void setEsq(NodeHuffman esq) {
		this.esq = esq;
	}
	
	public NodeHuffman getDir() {
		return dir;
	}
	
	public void setDir(NodeHuffman dir) {
		this.dir = dir;
	}
	
	public int isLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int getFreq() {
		return this.freq;
	}
	
	public void setFreq(int f) {
		freq = f;
	}
	
	public void setSimbol(char s) {
		this.simbolo = s;
	}
	
	public char getSimbol() {
		return this.simbolo;
	}
	public boolean isLeaf() {
		return this.esq==null && this.dir==null;
	}
	
	
	
}
