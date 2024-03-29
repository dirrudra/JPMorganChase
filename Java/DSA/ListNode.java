package DSA;
import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of list");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element to be inputted in a linked list");\
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ch = 0;
        while (ch<4){
            System.out.println("Welcome to linked list operations!");
            System.out.println("You have 4 operations:\n 0: Enter array elems to list \n 1: Insert elem at beginning of list \n 2: Insert elem at end \n 3: Search elem\n 4:   ");
        } 
    }
    
}
