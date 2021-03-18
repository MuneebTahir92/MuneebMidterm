package codelab.status;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CsvReader {

    public static void main(String[] args) {
        /*
         Coma Separated Value(CSV) of your CodeLab status is downloaded and it parsed.
         Based on number of solution you solved, message is generated for you.
         You need to find the average score of the class.
         */

        int averageScoreOfClass;

        String csvFilePath = System.getProperty("user.dir") + "/src/codelab/status/roster-file-03-15-2021.csv";
        String line = "";
        String cvsSplitBy = ",";
        BufferedReader br = null;
        List<Trainee> roster = new ArrayList<Trainee>();

        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                if(lineNumber == 0) {
                    lineNumber++;
                    continue;
                }
                String[] name = line.split(cvsSplitBy);
                roster.add(new Trainee(name[5].replace("\"", ""), name[4].replace("\"",
                        ""), Integer.parseInt(name[10])));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(roster);
        for(Trainee student:roster) {
            if (student.getNumberOfExercisesSolved()>=600) {
                System.out.print("You did pretty good-->                    ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            } else if (student.getNumberOfExercisesSolved()>=500 && student.getNumberOfExercisesSolved()<600) {
                System.out.print("You could do little better-->             ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            }else if (student.getNumberOfExercisesSolved()>=400 && student.getNumberOfExercisesSolved()<500) {
                System.out.print("You could do better-->                    ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            }else if (student.getNumberOfExercisesSolved()>=300&& student.getNumberOfExercisesSolved()<400) {
                System.out.print("You should have done more-->              ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            }else if (student.getNumberOfExercisesSolved()>=200&&student.getNumberOfExercisesSolved()<300) {
                System.out.print("You haven't done enough-->                 ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            }else if (student.getNumberOfExercisesSolved()>=100&&student.getNumberOfExercisesSolved()<200) {
                System.out.print("You did not take this Codelab seriously enough-->   ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            }else if (student.getNumberOfExercisesSolved()<100) {
                System.out.print("You did not like Codelab !-->                           ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            }
        }

        Trainee ali = new Trainee();
        ali.setNumberOfExercisesSolved(404);

        Trainee muneeb = new Trainee();
        muneeb.setNumberOfExercisesSolved(377);

        Trainee chetan = new Trainee();
        chetan.setNumberOfExercisesSolved(345);

        Trainee uddin = new Trainee();
        uddin.setNumberOfExercisesSolved(291);

        Trainee ahmed = new Trainee();
        ahmed.setNumberOfExercisesSolved(240);

        Trainee barry = new Trainee();
        barry.setNumberOfExercisesSolved(239);

        averageScoreOfClass = ((ali.getNumberOfExercisesSolved() + muneeb.getNumberOfExercisesSolved() + chetan.getNumberOfExercisesSolved() +
                uddin.getNumberOfExercisesSolved() + ahmed.getNumberOfExercisesSolved() + barry.getNumberOfExercisesSolved()) / 6);

        System.out.println("Average score of class: " + averageScoreOfClass);

    }

}
