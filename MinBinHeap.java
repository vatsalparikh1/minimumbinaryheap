package MinBinHeap_A3;

public class MinBinHeap implements Heap_Interface {
  private EntryPair[] array; //load this array
  private int size;
  private static final int arraySize = 10000; 

  public MinBinHeap() {
    this.array = new EntryPair[arraySize];
    array[0] = new EntryPair(null, -100000); 
  }
    

  @Override
  public EntryPair[] getHeap() { 
    return this.array;
  }
  
  
  
  
  
@Override
public void insert(EntryPair entry) {
	
	
	int lastIndex = size();
	
	//insert entry to lastIndex
	array[lastIndex + 1] = entry;
	size++;
	
	bubbleUp(size());
	

	
		
	
	
}

@Override
public void delMin() {
	
	if(size() <= 0){ 
		return;
	}
	
	
    array[1] = array[size()];
    size--;
    bubbleDown(1);

	return;
}

@Override
public EntryPair getMin() {
	
	if(size() <= 0){
		return null;
	}
	
	return array[1];
	
}

@Override
public int size() {
	
	return size;
}

@Override
public void build(EntryPair[] entries) {
	
	for(int i = 0; i < entries.length; i++){
		array[i+1] = entries[i];
	}
	
	size=entries.length;
	
	for( int i = size() / 2; i > 0; i-- ){
        bubbleDown( i );
	}
	
	
	
}


public void bubbleDown(int index){
	int leftIndex = index*2;
	int rightIndex = (index*2) + 1;
	int smallIndex;
	
	if(rightIndex < size() + 1){//has a right child
		if(array[leftIndex].priority < array[rightIndex].priority){
			smallIndex = leftIndex;
		}else{
			smallIndex = rightIndex;
		}
		
	}else{ //has only a left child
		smallIndex = leftIndex;
	}
	
	
	if(array[smallIndex].priority < array[index].priority){//swap
		EntryPair temp = array[smallIndex];
		array[smallIndex] = array[index];
		array[index] = temp;
	}else{//index has higher priority than children (do nothing)
		return;
	}
	
	if((smallIndex*2) < size() + 1){//if swapped index is not leaf
		bubbleDown(smallIndex);
	}else{//swap index points to a leaf
		return;
	}
	
	
}


public void bubbleUp(int index){ //called on by insert
	
	int parentIndex = (int) Math.floor(index/2);
	
	if(array[index].priority < array[parentIndex].priority){//swap
		EntryPair temp = array[index];
		array[index] = array[parentIndex];
		array[parentIndex] = temp;
		
		if((parentIndex !=1) && (parentIndex != 0)){ //if parentIndex has a parent
			bubbleUp(parentIndex);
		}else{
			return;
		}
		
	}else{ //do nothing (end)
		return;
	}
	
	
}




}
