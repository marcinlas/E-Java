
package algorytmysortujace;

public class AlgorytmySortujace {
    
    // sortowanie bąbelkowe polega na porównywaniu par i przesuwaniu liczby
    // do lewej strony aż nie trafi na liczbę mniejszą niż porównywana
     static public void bubbleSort(Integer[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp
                }
            }
        } 
    }
     
    // szybkie sortowanie 
     public static void quicksort(Integer[] a, int lo, int hi)
	{
	//  lo is the lower index, hi is the upper index
	//  of the region of array a that is to be sorted
	    int i=lo, j=hi, h;
	    int x=a[(lo+hi)/2];
	    //  partition
	    do
	    {
	        while (a[i]<x) i++;
	        while (a[j]>x) j--;
	        if (i<=j)
	        {
	            h=a[i]; a[i]=a[j]; a[j]=h;
	            i++; j--;
	        }	        
	    } while (i<=j);
	    //  recursion
	    if (lo<j) quicksort(a, lo, j);
	    if (i<hi) quicksort(a, i, hi);
	}

     
  
    public static void main(String[] args) {
      
        
        Integer[] losowa =  {18,5,6,19,12,19,3,2};
     
        for (int i = 0; i < losowa.length; i++){
          System.out.print(losowa[i] + ", ");
        };
        
        quicksort(losowa,0,7);
      
        System.out.println();
         for (int i = 0; i < losowa.length; i++){
          System.out.print(losowa[i] + ", ");
        };
        
    }
    
}
