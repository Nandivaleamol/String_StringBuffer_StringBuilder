package com.amol.string_strbuffer_strbuilder;

import java.util.Scanner;

public class _07_toLowerCase_trim_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter city name: ");
        String city = sc.nextLine().toLowerCase().trim();
        if (city.equals("mumbai")){
            System.out.println("Hello, Mumbaikar : Namaskar...");
        }else if (city.equals("hyderabad")){
            System.out.println("Hello, Hyderabadi : Aadaab...");
        }else if(city.equals("banglore")){
            System.out.println("Hello, Kannadiga : Namaskara");
        }else if(city.equals("chennai")){
            System.out.println("Hello, Madrasi : Wanakkam");
        }else{
            System.out.println("Enter valid city name");
        }
    }
}
