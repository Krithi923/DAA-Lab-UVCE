public class two{
    public static void main(String[] args) {
        int n=5;
        int m=5;
      for (int i=0; i<=n; i++) {
        for(int j=1;j<=m;j++) 
        {
            if(i>=j)
            {System.out.print("*");}
        } System.out.println("");
      } 
     for (int i = n; i >=1; i--) {
      for (int j = 1; j <=i; j++) {
        System.out.print("*");  
      } System.out.println("");
     }
     for (int i =1; i<=n; i++) {
      for (int j= 1; j <=n-i; j++) {
        System.out.print(" "); 
      } 
      for (int j= 1; j<=i; j++)
      {System.out.print("*");}
      System.out.println("");
     }   
     for (int i=0; i<=n; i++) {
        for(int j=1;j<=m;j++) 
        {
            if(i>=j)
            {System.out.print(j);}
        } System.out.println("");
      }   
    for (int i = n; i>=1 ; i--) {
     for(int j=1;j<=i;j++){
      System.out.print(j);
     }System.out.println("");
    }
    int k;
    for (int i = 1;i<=n ;i++) {
      
     for(int j=1;j<=i;j++){
      
      if(i==j||(i+j)%2==0){
        
        k=1;
      }
      else k=0;
      System.out.print(k+" ");

     }System.out.println("");
    }      
      
    }
}