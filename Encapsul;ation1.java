class student{
    int rollno;
    String name;
    private String dept;
    private String section;
    int year; 
    
    public String getdept(){
        return dept;
    }
    public void setdept(String dept){
        this.dept=dept;
    }
   
        public String getsection(){
            return section;
        }
        public void setsection(String section){
            this.section=section;
        }
        student(int rollno,String name,String dept,String section,int year){
            this.rollno=rollno;
            this.name=name; 
            this.dept=dept;
            this.section=section;
            this.year=year;
            
        }
        void display(){
            System.out.println("rollno:"+rollno);
            System.out.println("name:"+name);
            System.out.println("dept:"+dept);
            System.out.println("section:"+section);
            System.out.println("rollno:"+rollno);
            System.out.println("year:"+year);
            System.out.println();
            
        }
}
        public class Main{
            public static void main(String[] args){
                student[] student=new student[3];
                student s1=new student(101,"nila","ECE","A",2);
                student[0]=s1;
                student s2=new student(10,"ammuh","CSE","B",7);
                student[1]=s2;
                student[2]=new student(10,"nila","EEE","C",5);
                
                student[1].setsection("C");
                student[1].setdept("AIDS");
                
                for(int i=0;1<student.length;i++){
                    student[i].display();
                }
                
        }
        }
        
    


    
