package Codeforces;

import java.util.Scanner;

public class NSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean starths = true;

        int rowctr=0;
        for(int i=0;i<n*2;i++){
            // for(int k=0;k<2;k++){
                int ctr = 0;
                char ch[] =new char[n*2];
                int chctr = 0;

                for(int j = 0;j<n*2;j++){
                    if (starths == true){
                        ctr++;
                        // System.out.print("#");
                        ch[chctr] = '#';
                    }
                    if(starths == false){
                        // System.out.print(".");
                        ctr++;
                        ch[chctr] = '.';

                    }
                    if(ctr%2==0){
                        ctr=0;
                        starths = !starths;
                    }
                    chctr++;
                }
                if(n%2==0){
                    rowctr++;
                    if(rowctr%2==0){
                        starths = !starths;
                        rowctr = 0;
                    }
                }
                else{
                    if(rowctr%2==0){
                        starths = !starths;
                        rowctr = 0;
                    }
                    rowctr++;
                }
                
                String st = new String(ch);
                System.out.print(st);

                // System.out.print(st);


                // }
                System.out.println();
            }
        
        
        scanner.close();
    }
}

// package Codeforces;
// import java.util.Scanner;

// public class NSquare {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();

//         for (int i = 0; i < n; i++) {
//             // Print each row twice
//             for (int k = 0; k < 2; k++) {
//                 // Toggle the starting character for each row
//                 char startChar = (i % 2 == 0) ? '#' : '.';

//                 // Double each character in the row
//                 for (int j = 0; j < n * 2; j++) {
//                     char ch = (j % 2 == 0) ? startChar : (startChar == '#') ? '.' : '#';
//                     System.out.print(ch);
//                     System.out.print(ch); // Print each character twice
//                 }
//                 System.out.println(); // Move to the next line after each row
//             }
//         }

//         scanner.close();
//     }
// }

