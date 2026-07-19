class Main {
    public static void main(String[] args) {
        byte StudentID= 25;
        short StudentAttendence= 89;
        double StudentPercentage= 88;
        int StudentAssignment= 77;
        long Studenttotal= 1000;
        
        short newStudentID= StudentID;
        double newStudentAttendence= StudentAttendence;
        int newStudentPercentage=(int) StudentPercentage;
        long newStudentAssignment= StudentAssignment;
        float newtotal = Studenttotal;
        
        
        System.out.println("StudentID="+StudentID);
        System.out.println("New StudentID="+newStudentID);
         
        System.out.println("StudentAttendence="+StudentAttendence);
        System.out.println("New StudentAttendence="+newStudentAttendence);
         
        System.out.println("StudentPercentage="+StudentPercentage);
        System.out.println("New StudentPercentage="+newStudentPercentage);
        
        System.out.println("StudentAssignment="+StudentAssignment);
        System.out.println("New StudentAssignment="+newStudentAssignment);
        
        System.out.println("Studenttotal="+Studenttotal);
        System.out.println("New totalmarks="+newtotal);
        
    }
}
