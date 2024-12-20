/*Tat Putjorn 672115024 */

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Tutorial2 { 
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:/Users/ACER/Documents/ADT name list/953102_701000-2.csv");
        Scanner in = new Scanner(f);

        for (int i=0;i<7;i++){
            in.nextLine();
            }

        Vector<StudentName> studentInfo = new Vector<>();

        int index = 0;
        while(in.hasNextLine()) {
        String dataLine = in.nextLine();
        StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
        stu.nextToken();
        studentInfo.addElement(new StudentName(stu.nextToken(),stu.nextToken(),stu.nextToken()));
        index++;
        }

        in.close();
    
        
        for (StudentName studentObj : studentInfo) {
            System.out.println(studentObj);
        }
        
        System.out.println();
        
    
        processStudentData(studentInfo.size(), studentInfo);
        }
        
        public static int countNamesStartingWith(Vector<StudentName> students, char startingLetter) {
            int total = 0;
            for (StudentName stu : students) {
                if (stu.getFirstName().toLowerCase().charAt(0) == startingLetter) {
                    total++;
                }
            }
            return total;
        }
        

        public static void showStudentsWithLetter(Vector<StudentName> students, char startingLetter) {
            for (StudentName stu : students) {
                if (stu.getFirstName().toLowerCase().charAt(0) == startingLetter) {
                    System.out.println(stu);
                }
            }
        }
        
        public static void processStudentData(int totalStudents, Vector<StudentName> studentData) {
            System.out.println("Total number of students: " + totalStudents);
            for (char letter = 'a'; letter <= 'z'; letter++) {
                int count = countNamesStartingWith(studentData, letter);
                System.out.println("Count of names starting with " + letter + ": " + count);
                if (count > 0) {
                    System.out.println("Students with names starting with " + letter + ":");
                    showStudentsWithLetter(studentData, letter);
                }
                System.out.println();
            }
        }
    }
 

    

