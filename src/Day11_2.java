
public class Day11_2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] A = { 30, 1, 18, 2, 5, 10, 15, 9, 5, 25, 5};
      int[] B = { 2, 4, 11, 5, 24, 18, 8, 4, 13, 18 };
      int [] C=new int [A.length+B.length];
//      |*| 는
//      A 배열과 B 배열에 동시에 존재하는 수의 집합(set)의 크기를 구하는 연산
//      A |*| B 값을 구하시오

      int aa=0;
      
      for (int i=0; i<A.length; i++) {
         for(int j=0; j<B.length; j++) {
            if(A[i]==B[j]) {
               for(int k=0; k<C.length; k++) {
                  if(C[k]==0) {
                     C[k]=A[i];
                     break;
                  }
               }
               
            }
         }
      }

      
      for(int i=0; i<C.length; i++) {
         for(int j=i+1; j<C.length; j++) {
            if(C[i]==C[j]) {
               C[j]=0;
            }
         }
      }
      
      
      for(int i=0; i<C.length; i++) {
         if(C[i]!=0) {
            aa++;
         }
      }
      
      System.out.println("A |*| B= "+ aa);
   }

}

