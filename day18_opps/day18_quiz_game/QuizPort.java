package day18_opps.day18_quiz_game;

public class QuizPort {
    private int Sn;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String ans;
    
    public QuizPort(int sn, String question, String opt1, String opt2, String opt3, String opt4, String ans) {
        Sn = sn;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
    }

    
    public String getAns() {
        return ans;
    }
    @Override
    public String toString() {
        return "Sn." + Sn + "\nquestion:" + question + "\n 1." + opt1 + "\n 2." + opt2 + "\n 3." + opt3 + "\n 4." + opt4+"\n";
    }
  
    

}
