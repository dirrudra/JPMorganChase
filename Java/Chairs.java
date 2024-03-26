import java.util.*;
import java.*;

class Chairs{
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,7,8};
        int n = arr.length;
        int ctr = 0;
        int m1=0,m2=0;
        
        
        for(int i=0;i<n;i++){
            m1 = ngreat(i,arr);
            if(m1 != -1){
                m2 = nlower(m1,arr);
                if(m2 == -1){
                    ctr+=10;
                }else{
                    ctr+=5;
                }
            }else{
                ctr+=15;
            }
            m1=0;
            m2=0;
        }


        
        System.out.println(ctr);
    }
    private static int ngreat(int mark, int arr[]){
        for(int i=mark;i<arr.length;i++){
            if (arr[i]>arr[mark]){
                return i;
            }
        }
        return -1;
    }
    private static int nlower(int mark,int arr[]){
        for(int i=mark;i<arr.length;i++){
            if (arr[i]<arr[mark]){
                return i;
            }
        }
        return -1;
    }

}





// import java.util.*;
// public class Chairs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int[] great = new int[n];
//         int[] less = new int[n];
//         Arrays.fill(great,-1);
//         Arrays.fill(less,-1);
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(arr[j] > arr[i]){
//                     if(great[i]==-1){
//                         great[i] =  j;
//                     }
//                 }
//                 if(arr[j] < arr[i]){
//                     if(less[i] == -1){
//                         less[i] = j;
//                     }
//                 }
//                 if(great[i]!=-1 && less[i]!=-1){
//                     break;
//                 }
//             }
//         }
//         int s = 0;
//         for(int i=0; i<n; i++){
//             if(great[i] != -1 && less[great[i]] != -1){
//                 s += 5;
//             }else if(great[i] != -1 && less[great[i]] == -1){
//                 s += 10;
//             }else if(great[i] == -1){
//                 s += 15;
//             }
//         }
//         System.out.println(s);
//     }
// }