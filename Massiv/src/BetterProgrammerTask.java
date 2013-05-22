public class BetterProgrammerTask {
public static void main (String arg[]){
	int pithagor_table[][]=new int[5][5];
	for (int i=0; i<5; i++) {
	   for (int j=0; j<5; j++) {
	      pithagor_table[i][j]=i*j;
	      System.out.print(pithagor_table[i][j] +
	        "\t");
	   }
	   System.out.println();
	
	}
}	

  /*  public static Object[] reverseArray(Object[] a) {
    	Object s;
    	int[] b = new int[a.length];
    	for (int i = 0; i < a.length - 1; i ++){
    		s = a[i];
    		a[i] = a[a.length - i];
    		a[a.length - i] = s;
    	}
		return a;
		
    }*/
}
