package Codeforces;

import java.util.Scanner;

public class NSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            
            for (int i = 0; i < (1 << n); i++) {
                for (int j = 0; j < (1 << n); j++) {
                    if ((i & (i - 1)) == 0 && (j & (j - 1)) == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}


// package Codeforces;
// import java.util.Scanner;

// public class NSquare {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         boolean sw = true;
//         int n = sc.nextInt();
//         int ctr1 = 0;
//         int ctr2 = 0;

//         for(int i=0;i<n*2;i++){
//             for(int j=0;j<n*2;j++){
//                 if(sw == true){
//                     if(ctr1<=(n/2)){
//                     System.out.print("#");
                    
//                     ctr1++;
//                     }else{
//                         if(ctr2 <=(n/2) ){
//                             System.out.print(".");
//                             ctr2++;
//                         }
//                     }
//                     if(ctr1 == ((n/2)+1) && ctr2== ((n/2)+1)){
//                         ctr1 = 0;
//                         ctr2 = 0;
//                         sw = false;
//                     }
//                 }else if(sw == false){
//                     if(ctr1<=(n/2)){
//                     System.out.print(".");
                    
//                     ctr1++;
//                     }else{
//                         if(ctr2 <=(n/2) ){
//                             System.out.print("#");
//                             ctr2++;
//                         }
//                     }
//                     if(ctr1 == (n/2)+1 && ctr2== (n/2)+1){
//                         ctr1 = 0;
//                         ctr2 = 0;
//                         sw = true;
//                     }
//                 }    
//             }
//             System.out.println();
//         }
//     }
    
// }

