package ohtu;

public class Submission {
    private int id;
    private String student_number;
    private String last_name;
    private String first_name;
    private int week;
    private int points;
    private String identifier;
    private int hours;
    private String comments;
    private String email;
    private boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11;
    private boolean a12,a13,a14,a15,a16,a17,a19,a20,a21;
    private String created_at;
    private String updated_at;
    private int course_id;
    private String github;
    private int Student_id;
    private int tehty;
    private boolean[] tehdyt = new boolean[22];
    
   // private final String h="opiskelijanumero ";
    private final String o1="viikko ";
    private final String o2=" tehtyjä tehtäviä yhteensä: ";
    private final String o3a=", aikaa kului ";
    private final String o3b=" tuntia";
    private final String o4=", tehdyt tehtävät: ";
    private final String f1="yhteensä: ";
    private final String f2=" tehtävää ";
    private final String f3=" tuntia \n";
    
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
    
    public int getTehty() {
        return tehty;
    }

    private void addTehty(boolean a, int i) {
        if(a){
            this.tehty = tehty + 1;
            this.tehdyt[i] =a;
        }
    }
    
    public int getHours() {
        return hours;
    }

     public void setHours(int hours) {
        this.hours = hours;
    }
     
    private int setTehdyt(){
        addTehty(a1,1);
        addTehty(a2,2);
        addTehty(a3,3);
        addTehty(a4,4);
        addTehty(a5,5);
        addTehty(a6,6);
        addTehty(a7,7);
        addTehty(a8,8);
        addTehty(a9,9);
        addTehty(a10,10);
        addTehty(a11,11);
        addTehty(a12,12);
        return tehty;
    }
    
    public String getTehdyt(){
        String temp="";
        for (int i=0;i<tehdyt.length;i++){
            if (tehdyt[i]){
                temp = temp+" "+i;
            }
        }
        return temp;
    }
    
    @Override
    public String toString() {
        return o1+week+":"+o2+this.setTehdyt()+o3a+hours+o3b+o4+this.getTehdyt()+"\n";
    }
    
}