public class Solution {

            public static  int calc(int[] array, int n1, int n2){
                int somme = 0;
                for(int i=0;i<array.length;i++)
                {
                    if(i>=n1 && i<=n2)
                    {
                        somme = somme + array[i];
                    }
                }
                return somme;
    }

}
