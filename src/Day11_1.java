
public class Day11_1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int[] A = { 30, 1, 18, 2, 5, 10, 15, 9, 5, 25, 5 };
      int[] B = { 2, 4, 11, 5, 24, 18, 8, 4, 13, 18 };
      
//      :*: 는
//      "A 배열과 B 배열에 동시에 존재하는 수의 갯수를 구하는 연산" 이다
//      A:*:B를 구하시오

      
      int aa=0;
      for (int i=0; i<A.length; i++) {
         for(int j=0; j<B.length; j++) {
            if(A[i]==B[j]) {
               aa++;
               break;
            }
         }
      }
      
      for (int i=0; i<B.length; i++) {
         for(int j=0; j<A.length; j++) {
            if(B[i]==A[j]) {
               aa++;
               break;
            }
         }
      }

      
      System.out.println("A:*:B= "+aa);
      
      
      
      
   }

}