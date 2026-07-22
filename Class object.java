class Student {
        int rollno;
        String name;
        String dept;
        String section;
        int year;
        Student(int rollno,String name,String dept,String section,int year){
            
            this.rollno=rollno;
            this.name=name;
            this.dept=dept;
            this.section=section;
            this.year=year;
              }
        void display() {
            System.out.println("rollno;"+rollno);
            System.out.println("name;"+name);
            System.out.println("dept;"+dept);
            System.out.println("section;"+section);
            System.out.println("year;"+year);
}
    }
    public class Main{
        public static void main(String[] args) {
            Student[] Student=new Student[3];
            Student S1=new Student(101,"Alice","CSE","A",3);
            Student[0]=S1;
            Student S2=new Student(111,"Ali","ECE","B",4);
            Student[1]=S2;
            Student [2]=new Student(11,"Ai","EC","B",3);

        for(int i=0;i<Student.length;i++){
            Student[i].display();
            
        }
            
            
        
    }
}
