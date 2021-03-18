import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner scan = new Scanner (System.in);

        //PROMPT USER TO ENTER 10 NUMBERS AND STORE THEM IN A 1D ARRAY OF SIZE 10
        int[] slots = new int[10];
        int count = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("Enter slot " + i + ": ");
            int userInput = scan.nextInt();
            slots[i] = userInput;
        }


        //USE BUBBLE SORT TO MIX UP THE ARRAY
        for(int j = 0; j < slots.length-1; j++){
            int index = (int)(Math.random() * slots.length);
            int temp = slots[j];
            slots[j] = slots[index];
            slots[index] = temp;
        }

        //USE BUBBLE SORT TO SORT THE ARRAY AND COUNT THE NUMBER OF SWAPS THAT OCCUR
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i-1; j++) {
                if (slots[j] > slots[j+1]) {
                    count++;
                    int temp = slots[j];
                    slots[j] = slots[j+1];
                    slots[j+1] = temp;
                }
            }
            //PRINT CURRENT STATE OF ARRAY AND THE TOTAL NUMBER OF SWAPS THAT OCCURRED
            for (int k = 0; k<10; k++){
                System.out.print(slots[k] + " | ");
            }
            System.out.println("Number of swaps: " + count);
        }
        //CLOSE SCANNER
        scan.close();
    }
}

