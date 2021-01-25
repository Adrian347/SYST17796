/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class ReverseWord 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word to reverse: ");
        String word = input.nextLine();
        
        char store[] = new char[word.length()];
        
        for(int i = 0; i < word.length(); i++)
        {
            store[i] = word.charAt(i);
        }
        
        for(int i = store.length - 1; i >= 0; i--)
        {
            System.out.print(store[i]);
        }
        
        System.out.println("");
    }
}
