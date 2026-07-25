class student{
    private int id;
    private String name;
    public void setid(int id){
        this.id=id;
    }
        
        public void setname (String name) {
            this.name=name;
        }
        public int getid(){
            return id;
        }
        public String getname() {
            return name;
        }
    }
        public class Main{
            public static void main(String[] args){
                student s=new student();
                s.setid(101);
                s.setname("nila");
                System.out.println("id:"+s.getid());
                System.out.println("name:"+s.getname());
                
            }
        }
        
    
