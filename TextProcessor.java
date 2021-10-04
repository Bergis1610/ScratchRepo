import java.util.*;
import java.util.regex.*;
import java.io.*;


/**
 * TextProcessor.java
 * This program will use the Regex library to scan and find
 * patterns from the Dracula text downloaded from gutenberg.org
 * @author Emil Bjørlykke Berglund
 * @verion 1.0
 * Compiler Project 3
 * CS-322 Compiler Construction
 * Fall 2021
 */


public class TextProcessor {

    /**
     * Regex patterns (java format)
     * Pattern a)
     * \b[aA]\b|\b[Aa]n\b|\b[Tt]he\b
     *
     * Pattern b)
     * (Mina Harker|Mrs. Harker)
     * (\b[Mm]rs\.|\b[Mm]ina)\sHarker\b
     *
     * Pattern c)
     * [^.]*(Transylvania)[^.]*
     *
     * Pattern d)
     * \b[Tt]o\s+\w+
     *
     * Pattern e)
     * \w*(?<![Gg]odalm|[Hh]els)ing\b
     *
     */

    //Universal scanner
    public static Scanner scan = new Scanner(System.in);

    //This is the pattern searcher. Any time it finds the pattern, it counts and prints it.
    public int instanceFinder(String filename, String pat){
        int count = 0;

        Pattern pattern = Pattern.compile(pat, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        String line;


        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                line = myReader.nextLine();
                matcher = pattern.matcher(line);

                //println(line);
                while(matcher.find()){
                    println(line.substring(matcher.start(),matcher.end()));
                    count++;
                }
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        println("\nThe number of matches was: " + count);
        return count;
    }

    public void printEveryLine(String fileName){
        String line;
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                line = myReader.nextLine();
                println(line);

            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
     * Hoved means main in norwegian, simply means main method
     * This method prompts for the name of file to be checked and for the pattern to be used
     * Then does the search, counts occurences as well as printing every occurence
     * Requirement: File must have the same path as this java program
     */
    public void hoved(){

        println("Full Dracula text file name: DraculaFullText");
        print("Please type the file name: ");
        String filename = "C:\\Users\\Bruker\\IdeaProjects\\ByteCodeTester\\src\\" + scan.nextLine() + ".txt";
        print("You chose this file: ");
        println(filename);
        println();

        println("Now, please type in a command.");
        println("Here are 5 RegEx examples: ");
        println("-----------------------------------------------------------");
        println("Pattern for a):   \\b[aA]\\b|\\b[Aa]n\\b|\\b[Tt]he\\b");
        println("Pattern for b):   (Mina Harker|Mrs. Harker)");
        println("Pattern for c):   [^.]*(Transylvania)[^.]*");
        println("Pattern for d):   \\b[Tt]o\\s+\\w+");
        println("Pattern for e):   \\w*(?<![Gg]odalm|[Hh]els)ing\\b");
        println("-----------------------------------------------------------");
        print("Please type the command here: ");
        String command = scan.nextLine();
        println();

        instanceFinder(filename, command);
        println("\n\nDone!");

    }
    public void hovedmk2(String arg1, String arg2){

        instanceFinder(arg1, arg2);
        println("\n\nDone!");

    }

    public static void main(String[]args) {
        TextProcessor tp = new TextProcessor();

        //Hovedmetoden
        //p.hoved();


        //Hoved Command Line metoden

        String filename;
        String command;
        if(args.length != 2){

            println("\nYou didnt enter any arguments on the command line!\n");

            println("Please type in the name of the file and the pattern you want to search for on the commandline!");
            println("Full Dracula text file name: DraculaFullText");
            print("Please type the file name: ");
            filename = "C:\\Users\\Bruker\\IdeaProjects\\ByteCodeTester\\src\\" + scan.nextLine() + ".txt";
            print("You chose this file: ");
            println(filename);
            println();

            println("Now, please type in a command.");
            println("Here are 5 RegEx examples: ");
            println("-----------------------------------------------------------");
            println("Pattern for a):   \\b[aA]\\b|\\b[Aa]n\\b|\\b[Tt]he\\b");
            println("Pattern for b):   (Mina Harker|Mrs. Harker)");
            println("Pattern for c):   [^.]*(Transylvania)[^.]*");
            println("Pattern for d):   \\b[Tt]o\\s+\\w+");
            println("Pattern for e):   \\w*(?<![Gg]odalm|[Hh]els)ing\\b");
            println("-----------------------------------------------------------");
            print("Please type the command here: ");
            command = scan.nextLine();
            println();
        } else {
            filename = "C:\\Users\\Bruker\\IdeaProjects\\ByteCodeTester\\src\\" + args[0] + ".txt";
            command = args[1];
        }
        tp.hovedmk2(filename,command);



/*
        switch(command){
            case "a": command = "\\b[aA]\\b|\\b[Aa]n\\b|\\b[Tt]he\\b"; break;
            case "b": command = "(Mina Harker|Mrs. Harker)";break;
            case "c": command = "[^.]*(Transylvania)[^.]*";break;
            case "d": command = "\\b[Tt]o\\s+\\w+";break;
            case "e": command = "\\w*(?<![Gg]odalm|[Hh]els)ing\\b";break;
            default: break;
        }

 */
        /*
        print("You chose this file: ");
        println(filename);
        println("The pattern to be searched is: " + command);


        //tp.printEveryLine(filename);
        tp.instanceFinder(filename, command);
        println("\n\nDone!");
        */

    }

    //Printer methods to help with my laziness
    public static void print(Object o){
        System.out.print(o);
    }
    public static void println(Object o){
        System.out.println(o);
    }
    public static void print(){
        System.out.print("");
    }
    public static void println(){
        System.out.println("");
    }
}
