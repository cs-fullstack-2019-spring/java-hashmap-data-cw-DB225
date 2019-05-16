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
        entries.put("HTML","Hypertext Markup Language");
        entries.put("CSS","Cascading Style Sheet");
        entries.put("MERN","Mongoose/MongoDB Express React NodeJS");
        entries.put("CRUD","Create Read Update Delete");

//        System.out.println(entries);

        try{
            FileWriter mywriter = new FileWriter("src/com/company/cw_file");
            for( String s : entries.keySet()){
                mywriter.write(s+","+ entries.get(s)+ "\n");
            }
            Scanner user = new Scanner(System.in);
            System.out.print("Enter a key: HTML, CSS, MERN, or CRUD: ");
            String userInput = user.nextLine();

            System.out.print(entries.get(userInput));

            mywriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
