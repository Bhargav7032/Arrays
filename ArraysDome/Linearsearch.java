package ArraysDome;

public class Linearsearch {
	public class LinearSearchExample{    
		public int linearSearch(int[] arr, int key){    
		        for(int i=0;i<arr.length;i++){    
		            if(arr[i] == key){    
		                return i;    
		            }    
		        }    
		        return -1;    
		    }    
		    public void main(String a[]){    
		        int[] a1= {10,20,30,50,70,90};    
		        int key = 90;    
		        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
		    }    
		}    

}
