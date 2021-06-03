package com.techelevator;

public class HomeworkAssignment {
    //instance variables
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;




    //letterGrade method
    //methods
    public String getLetterGrade () {
       double grade = 100* earnedMarks / possibleMarks;
        if ( grade >= 90) {
            return "A";
        } else if ((grade) >= 80) {
            return "B";
        } else if ((grade) >= 70) {
            return "C";
        } else if ((grade) >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    //constructor
    public HomeworkAssignment (int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }


    public String getSubmitterName() {
        return submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
}