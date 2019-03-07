package showstudent;

public class ShowStudent {

 
    public static void main(String[] args) {
       Student Student = new Student();
       
       Student.setIdNumber("10-343534");
       Student.setCreditHours(4);
       Student.setPoints(17);
       
       System.out.print(Student.getIdNumber()+"\n"
               +Student.getPoints()+"\n"
               +Student.getCreditHours()+"\n"
               +Student.finalAverage());
    }
    
}
