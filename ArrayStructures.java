
public class ArrayStructures {
	
	private int[] theArray = new int[50];
	private int arraySize = 10;
	public void generateRandomArray(){
		for(int i = 0; i < arraySize; i++){
			theArray[i] = (int)(Math.random()*10+10);
		}
			
	}
	
	public void printArray(){
		System.out.println("...");
		for (int i = 0; i < arraySize; i++){
			System.out.print("| " +i + " | ");		
			System.out.print(theArray[i] +" |");
			System.out.println();
			
		}		
	}
	
	public int getValueAtIndex(int index){
		if (index < arraySize) return theArray[index];
		return 0;
	}
	
	public boolean doesArrayContainThisValue(int value){
		boolean valueInArray = false;
		for (int i = 0; i < arraySize; i++){
			if(theArray[i] == value){
				valueInArray = true;
			}			
		}
		return valueInArray;
	}
	
	public void deleteIndex(int index){
		if(index < arraySize){
			for ( int i = index; i < arraySize-1; i++){
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}		
	}
	
	public void insertValueAtEnd(int value)
	{
		if ( arraySize < 50 ){
			theArray[arraySize] = value;
		}
		arraySize++;
	}
	
	public String findLinearSearchValue(int value){
		 String valueInIndexes = "";
		 boolean valueInArray = false;
		 
		 for ( int i = 0; i < arraySize; i++){
			 if ( theArray[i] == value){
				 valueInArray = true;				 
				 valueInIndexes+= i + " ";
			 }
		 }
		 if (valueInArray == false){
			 valueInIndexes = "None found";
		 }
		 System.out.println(valueInIndexes);	
		 return valueInIndexes;		
	}
	
	public void bubbleSort(){
		for ( int i = arraySize -1; i > 1; i--){
			for (int j = 0; j < i; j++){
				if (theArray[j] > theArray[j+1]){
					swapValue(j, j+1);					
				}
			}
		}
	}
	
	public void swapValue(int indexOne, int secondIndex){
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[secondIndex];
		theArray[secondIndex] = temp;		
	}
	
	public void binarySearch( int value){
		int lowIndex = 0;
		int highIndex = arraySize;
		
		while(lowIndex <= highIndex){
			int middleIndex = (lowIndex + highIndex)/2;
			if (theArray[middleIndex] < value) lowIndex = middleIndex + 1;
			if (theArray[middleIndex] > value) lowIndex = middleIndex - 1;
			else{
				System.out.println("the value" + value + "is found at index" + middleIndex);
			}
		lowIndex = highIndex + 1;			
	}
	}

	public static void main(String[] args) {
			ArrayStructures newArray = new ArrayStructures();
			newArray.generateRandomArray();
			newArray.printArray();
			System.out.print(newArray.getValueAtIndex(3));
			System.out.print(newArray.doesArrayContainThisValue(13));
			newArray.deleteIndex(4);
			newArray.printArray();
			newArray.insertValueAtEnd(100);
			newArray.printArray();
			System.out.print(newArray.findLinearSearchValue(17));
			newArray.bubbleSort();
			newArray.printArray();
			
	}

}
