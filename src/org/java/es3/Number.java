package org.java.es3;

public class Number {
	private int[] numbers;
	private int index;
	
	 



	public Number(int[] numbers) {
		setNumbers(numbers);
		setIndex(0);
	}
	
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
	
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int getElementoSuccessivo() {
        
		index++;
        int elemento = numbers[index - 1];
        
        return elemento;
    }

    public boolean hasAncoraElementi() {
    	  return index < numbers.length;
    }


}
