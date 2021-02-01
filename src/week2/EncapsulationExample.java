/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Adrian
 */
public class EncapsulationExample 
{
    public static void main(String[] args) 
    {
        Student[] list = new Student[3];
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(21);
        list[0] = s1;       // saved the object in array location 0 (using ref)
        System.out.println(s1.getName() + ", " + s1.getAge());
    }
}