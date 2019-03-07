
package showstudent;



    public class Student {
        
    private String IdNumber;
    private int creditHours;
    private int points;
    
    public Student(){
    this.IdNumber = " *";
    this.creditHours = 1;
    this.points = 3;
    }
    String getIdNumber(){
        return IdNumber;
    }
    int getCreditHours(){
        return creditHours;
    }
    int getPoints(){
        return points;
    }
    void setIdNumber(String IdNumber){
        this.IdNumber = IdNumber;
    }
    void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }
    void setPoints(int points){
        this.points = creditHours * 4;
    }
    
    double finalAverage(){
        double result = 0;
        result=points/creditHours;
        return result;
    }
    
    String displayScale(){
        String scale=" ";
        if (creditHours == 3){
            scale = "A";
                        
    }else if (creditHours == 4){
        scale = "B";
    }else if (creditHours == 5){
        scale = "C";
    }
    return scale ;
    }
}
