package practice;

import java.util.Scanner;

public class Even {
      
    public static int GetEven(int [] even){
        int count = 0;
        for (int i = 0; i < even.length; i++){
            if (even[i] % 2 == 0){
                count++;
            }
        }
        return count;
        
    } 
    public static void main(String[] args) {
        int [] myArray = {10, 5, 8};
        System.out.println(GetEven(myArray));
    }
}   




 String ratingsString = "[ ";
        for (int i = 0; i < ratingCount; i++){
            ratingsString += ratings [i];
            if (i < ratingCount -1){
                ratingsString += " , ";
            }
        }
        ratingsString += "]";