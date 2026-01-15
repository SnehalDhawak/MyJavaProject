package Practice;

public class FindDuplicate {
    public static void main(String[] args){
        //Find duplicate using loop
        int[] arr = {4,2,1,4,7,4,8,2};
        boolean[] visited = new boolean[arr.length];
        for( int i=0; i<arr.length;i++){
            if(visited[i])
                continue;
            boolean isDuplicate =false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    visited[j]=true;
                }
            }
            if(isDuplicate){
                System.out.println(arr[i]);
            }
        }

    }
}
