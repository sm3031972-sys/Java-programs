class Array2D{
    public static void main(String args[]){
       int[][] arr={{1,4,9},{8,8,7}};
       int arr2=TransposeOfMatrix(arr);
       for(int i=0;i<arr2.length;i++){
          for(int j=0;j<arr2[0].length;j++){
           System.out.print(arr2[i][j]+" ");

           }
        System.out.println();
       }
       

    }
    public static int[][] TransposeOfMatrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        
        int[][] arr2=new int[m][n];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
               arr2[i][j]=arr[j][i];
            }
        }
       return arr2; 
     }
    //  public static int sumofrows(int[][] arr){
    //     int sum=0;
    //     for(int i=1;i<=1;i++){
    //         for(int j=0;j<=2;j++){
    //             sum=sum+arr[i][j];
    //         }
    //     }
    //     return sum;
    //  }

    

    // public static int countoccurence(int[][] arr){
    //     int count=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=0;j<arr[0].length;j++){
    //             if(arr[i][j]==7){
    //               count++;
    //             }
                
    //         }
    //     }
    //     return count;
    // }

}