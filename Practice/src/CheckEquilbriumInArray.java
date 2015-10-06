public class CheckEquilbriumInArray {
    
    static int [] a={-1,3,-4,5,1,-6,2,1};
    int sum=0;
    int revSum=0;
    int leftdiff=0;
    int rightdiff=0;
    public void solution(int[] A) {
        
        for(int i=0;i<a.length;i++){
            
           sum=sum+a[i]; 
        }
        
        System.out.println("SUM IS " +sum);
        for(int i=0;i<a.length;i++){
            
            revSum=revSum+a[i];
            leftdiff=sum-revSum;
            rightdiff=revSum-a[i];
            
            if(leftdiff==rightdiff){
                
                System.out.println("Equilibrium"+ (i));
                
            }
        }
        
    }
    
    public static void main (String args[]){
        
        CheckEquilbriumInArray s=new CheckEquilbriumInArray();
        s.solution(a);
}
}