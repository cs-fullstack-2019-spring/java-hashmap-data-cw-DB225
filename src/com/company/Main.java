package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Print out the file
        try{
            File file = new File("src/com/company/cw_file");
            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()){
                String txt = readFile.nextLine();
                System.out.println(txt);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //HashMap
        HashMap<String, String> entries = new HashMap<String, String>();
        entries.put("C","Create");
        entries.put("R","Read");
        entries.put("U","Update");
        entries.put("D","Delete");

//        System.out.println(entries);

        try{
            FileWriter mywriter = new FileWriter("src/com/company/cw_file");
            Scanner user = new Scanner(System.in);
            System.out.print("Enter a key: C,R,U, or D: ");
            String userInput = user.nextLine();

            System.out.print(entries.get(userInput));

            for( String s : entries.keySet()){
                mywriter.write(s+","+ entries.get(s)+ "\n");
            }
            mywriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
