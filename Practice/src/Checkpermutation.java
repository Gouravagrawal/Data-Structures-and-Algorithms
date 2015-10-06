import java.util.Arrays;

public class Checkpermutation{
    
    
    public static void main (String args[]){
                //Checkpermuation cp=new Checkpermuatation();
        int A[]={4,1,3,2,5,6,7,9,8};
        int count=0;
    
    
        for(int i=0;i<A.length;i++){        
            for(int k=0; k<A.length-1;k++){            
                if(A[k]>A[k+1]){
                   int x=A[k];
                    A[k]=A[k+1];
                    A[k+1]=x;
                }
            }
            
            System.out.println(Arrays.toString(A));
        }
        
        for(int k=0; k<A.length;k++){
            if(A[k]==k+1){
                
                count++;
            }
        }
            if(count==A.length){
                
                System.out.println("ArRay is Permutation");
            }
            
            else{
            System.out.println("Array is not permutation");
        }
    }
    }
    
