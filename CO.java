class Book {
        String Tittle;
        String Author;
        String Publisher;
        int year;
        Book(String Tittle,String Author,String Publisher,int year){
            
            this.Tittle=Tittle;
            this.Author=Author;
            this.Publisher=Publisher;
            this.year=year;
              }
        void display() {
            System.out.println("Tittle;"+Tittle);
            System.out.println("Author;"+Author);
            System.out.println("Publisher;"+Publisher);
            System.out.println("year;"+year);
}
    }
    public class Main{
        public static void main(String[] args) {
            Book[] Book=new Book[3];
            Book S1=new Book("Art OF BEING ALONE","NILA","DD",3);
            Book[0]=S1;
            Book S2=new Book("Art OF BEING LOVE","MM","VIZHI",4);
            Book[1]=S2;
            Book [2]=new Book("Art OF BEING FORB PEACE","ME","RAJ",3);

        for(int i=0;i<Book.length;i++){
            Book[i].display();
            
        }
            
            
        
    }
}
