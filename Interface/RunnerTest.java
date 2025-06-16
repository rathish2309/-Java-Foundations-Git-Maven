package Interface;

interface DataProvider{
    int totalMaximumMarks=8000;
    void calcPercentage();
}

class Intern implements DataProvider{

    private int marksSecured;
    private int graceMarks;

    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    @Override
    public void calcPercentage() {
        if(this.marksSecured+graceMarks > DataProvider.totalMaximumMarks) System.out.println("This is invalid marks!!");
        else System.out.println("the total aggregate percentage secured is "+((this.marksSecured+this.graceMarks)*100)/DataProvider.totalMaximumMarks);
    }

}

class Trainee implements DataProvider{
    private int marksSecured;

    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    @Override
    public void calcPercentage() {
        if(this.marksSecured > DataProvider.totalMaximumMarks) System.out.println("This is invalid marks!!");
        else System.out.println("the total aggregate percentage secured is "+(this.marksSecured*100)/DataProvider.totalMaximumMarks);
    }
}

public class RunnerTest {
    public static void main(String[] args) {
        Intern intern = new Intern(5000,500);
        intern.calcPercentage();

        Trainee trainee = new Trainee(6000);
        trainee.calcPercentage();
    }
}
