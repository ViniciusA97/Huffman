package Huffman;
import java.util.*;
import Dijkstra.MinHeap;

public class Huffman {

	private MinHeap heap;
	private int [] frequencia;
	private NodeHuffman[] nodes;
	
	public Huffman(int [] f , NodeHuffman[] n) {
		
		this.nodes= n;
		frequencia = f;
		heap = new MinHeap(n.length);
		heap = new MinHeap(nodes);
		
	}
	
	public NodeHuffman doHuffman() {
		
		NodeHuffman pai = new NodeHuffman();
		
		while(heap.size()>1) {
			
			NodeHuffman left = heap.extractMin();
			NodeHuffman right = heap.extractMin();
			//System.out.println(left.getSimbol()+" "+left.getFreq()+" "+right.getSimbol()+" "+right.getFreq());
			
			pai = new NodeHuffman(left.getFreq()+right.getFreq(), '-');
			
			pai.setEsq(left);
			pai.setDir(right);
			
			heap.insert(pai);
		}
		
		return pai;
		
		
	}
	
	
	
	public void printTree(String text,NodeHuffman node, String bit) {
		if(node.isLeaf()) {
			text = " -> " + bit;
			System.out.println(node.getSimbol()+ text);
			return;
		}
		printTree(text,node.getEsq(), bit+"0");
		printTree(text,node.getDir(), bit+"1");
	}
}
