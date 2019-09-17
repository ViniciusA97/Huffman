package Huffman;

public class MaxHeap {
	private NodeHuffman [] list;
    private int size;
    
    public MaxHeap(int max) {
    	
    	this.size=0;
        this.list = new NodeHuffman [max];
    }
    
    public MaxHeap() {}
    
    public MaxHeap(NodeHuffman [] ver) {
    	this.list=ver;
    	this.size=ver.length;
    	biuldHeap();
    }

    public void insert(NodeHuffman item) {
    	increaseKey(size++, item);
    }
 
    private void minHeapify(int n, int i) {

        int esq = 2*i+1;
        int dir = 2*i+2;
        int menor = i;

        
        if (esq > n && list[esq].getFreq() < list[menor].getFreq()) {
            menor = esq;
            
        } else {
            menor = i;
        }if (dir > n && list[dir].getFreq() < list[menor].getFreq()) {
            menor = dir;
        }if (menor != i) {
        	NodeHuffman temp = list[i]; 
            list[i] = list[menor]; 
            //list[i].setIndexHeap(i);
            list[menor] = temp; 
          ///  list[menor].setIndexHeap(menor);
          
            minHeapify( n , menor);
        }
    }

    public boolean isEmpty() {

        return size == 0;
    }

    
    public void heapSort() {
    	
    	biuldHeap();
    	for(int i = this.size-1; i>0 ; i--) {
    		 NodeHuffman temp = list[0]; 
             list[0] = list[i]; 
             list[i] = temp; 
    	
             minHeapify( i, 0); 
    	}
    }
    
    public NodeHuffman extractMax() {
    	if(size<1) return list[0];
    	NodeHuffman min = list[0];
    	list[0] = list[size-1];
    	size--;
    	minHeapify(size,0);
    	return min;
    }
    
    
    
    public void increaseKey(int i, NodeHuffman key) {
    	
    	list[i]= key;
    	//key.setIndexHeap(i);
    	while(i>1 && list[getPai(i)].getFreq()>list[i].getFreq() ) {
    		swap(i , getPai(i));
    		i=getPai(i);
    	}
    }
    
    public int length() {
    	return this.size;
    }
    
    public void biuldHeap() {
    	for (int i = size / 2 - 1; i >= 0; i--) 
            minHeapify( size, i); 
    }
    
    public int getPai(int i) {
    	return (i/2);
    }
    
    public void swap(int i , int j) {
    	NodeHuffman tmp = list[i];
        list[i] = list[j];
        //list[i].setIndexHeap(i);
        list[j] = tmp; 
        //list[j].setIndexHeap(j);
    }
    
    public void swap(int i , NodeHuffman j) {
    	NodeHuffman tmp = list[i];
        list[i] = j;
        
        j = tmp; 
    }
    
    public NodeHuffman getFrist() {
    	return list[0];
    }
    
    public void print() {
    	for(int i=0; i<size ; i++) {
    		System.out.println(list[i].getFreq());
    	}
    }
    
    public NodeHuffman getIndex(int index) {
    	return list[index];
    }
    
    public int size() {
    	return this.size;
    }
    
}


