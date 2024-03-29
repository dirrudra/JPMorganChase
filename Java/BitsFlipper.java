import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char ch[] = line.toCharArray();
        int ctr = 0;
        char curr = '0';
        for(int i=0;i<ch.length;i++){
            if(ch[i] != curr){
                ctr++;
                if(curr == '1'){ 
                    curr ='0';
                }
                else{
                    curr ='1';
                }
            }
        }
        System.out.println(ctr);
    }
}