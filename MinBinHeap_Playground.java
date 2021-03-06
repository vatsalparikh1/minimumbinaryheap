package MinBinHeap_A3;

public class MinBinHeap_Playground {
  public static void main(String[] args){   
    //Add more tests as methods and call them here!!
    TestBuild();
  }
  
  public static void TestBuild(){ 
    
    MinBinHeap mbh= new MinBinHeap();
    
    
    
//    EntryPair[] collection= new EntryPair[8];
//    collection[0]=new EntryPair("i",3);
//    collection[1]=new EntryPair("b",5);
//    collection[2]=new EntryPair("c",1);
//    collection[3]=new EntryPair("d",0);
//    collection[4]=new EntryPair("e",46);
//    collection[5]=new EntryPair("f",5);
//    collection[6]=new EntryPair("g",6);
//    collection[7]=new EntryPair("h",17);
//    mbh.build(collection);
//    //mbh.delMin();
//    mbh.insert(new EntryPair("i",30));
//    mbh.insert(new EntryPair("j",2));
    
    
    
    //buildTest1
    EntryPair[] buildTest1 = new EntryPair[5];
    buildTest1[0]=new EntryPair("a",5);
    buildTest1[1]=new EntryPair("b",4);
    buildTest1[2]=new EntryPair("c",3);
    buildTest1[3]=new EntryPair("d",2);
    buildTest1[4]=new EntryPair("e",1);
    //buildTest1[5]=new EntryPair("f",7);
    mbh.build(buildTest1);
    //mbh.delMin();
//    mbh.insert(new EntryPair("i",30));
//    mbh.insert(new EntryPair("j",2));
    
    
    
    
    
    
    printHeapCollection(buildTest1);
    printHeap(mbh.getHeap(), mbh.size());
  }
  
  public static void printHeapCollection(EntryPair[] e) { 
    
    System.out.println("Printing Collection to pass in to build function:");
    for(int i=0;i < e.length;i++){
      System.out.print("("+e[i].value+","+e[i].priority+")\t");
    }
    System.out.print("\n");
  }
  
  public static void printHeap(EntryPair[] e,int len) { 

    System.out.println("Printing Heap");
    for(int i=1;i < len+1;i++){
      System.out.print("("+e[i].value+","+e[i].priority+")\t");
    }
    System.out.print("\n");
  }
}
