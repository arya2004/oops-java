package org.labExam;
class Studentss {
    private int studentId;
    private double aggregateMarks;
    private final double BASE_STIPEND = 100.0;
    private final double STIPEND;

    public Studentss(int studentId, double aggregateMarks) {
        this.studentId = studentId;
        this.aggregateMarks = aggregateMarks;
        this.STIPEND = calculateTotalStipend();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(double aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    public double getStipend() {
        return STIPEND;
    }

    private double calculateTotalStipend() {
        double bonusStipend = 0.0;

        if (aggregateMarks >= 85 && aggregateMarks < 90) {
            bonusStipend = 10.0;
        } else if (aggregateMarks >= 90 && aggregateMarks < 95) {
            bonusStipend = 15.0;
        } else if (aggregateMarks >= 95 && aggregateMarks < 100) {
            bonusStipend = 20.0;
        }

        return BASE_STIPEND + bonusStipend;
    }


}

public class six {
    public static void main(String[] args) {
        Studentss student = new Studentss(1212, 93);
        System.out.println("The final stipend of " + student.getStudentId() + " is $" + student.getStipend());
    }
}
