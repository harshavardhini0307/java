public class Book {
       private String title;
       private String author;
       private int yearofpublication;
   
    public Book(String title , String autor, int yearofpublication) {
          this.title =title;
          this.author=author;
          this.yearofpublication=yearofpublication;
         }
          public void displayDetails() {
                System.out.println("Title"+title);
                System.out.println("Author"+author);
                System.out.println("Year of publication"+yearofpublication);
           }
            public static void main(String args[]) {
                   Book Book1 = new Book("Heart bones","collen hoveer",2020);
                   Book Book2 = new Book("The art of beign alone","Renuka",2024);
                   System.out.println("Harsha vardhini, AV.SC.U4CSE24225.CSE-C");
                   
 
                    System.out.println("Details of Book1:");
                    Book1.displayDetails();
       
                    System.out.println("Details of Book2:");
                    Book2.displayDetails();
    
   }
}