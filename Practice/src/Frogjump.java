public class Frogjump{
    int point=0;
    int [] A={1,2,1,4,2,3,5,4};
    int count=0;
    public void task(int[] A, int point){
        
        for(int i=0;i<A.length;i++){
            
          if( A[i]==point){
              
              for(int j=0; j<i;j++){
                  
                 
              }
          }
        }
    }
       
    
    
    public static void main (String args[]){
    	 int point=5;
    	 int [] A={1,2,1,4,2,3,5,4};
    	
    	Frogjump fj=new Frogjump();       
        fj.task(A, point);
        
    }
    
    
}