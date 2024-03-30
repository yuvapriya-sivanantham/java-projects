package player;

public class Player {
   private String name;
   private char symbol;
   private String address;
   private String contactnumber;
   private String emailId;
   private int age;

   public void setPlayerDetails(String name,char symbol,String address,String contactnumber,String emailId,int age){
    this.name=name;
    this.symbol=symbol;
    this.address=address;
    this.contactnumber=contactnumber;
    this.emailId=emailId;
    this.age=age;
   }
   public void setPlayerNameAge(String name,int age){
    this.name=name;
    this.age=age;
   }
   public void setPlayerNameSymbolEmailIdAge(String name,char symbol,String emailId,int age){
    this.name=name;
    this.age=age;
    this.emailId=emailId;
    this.symbol=symbol;
   }
   public void changeSymbol(char symbol){
      this.symbol=symbol;
   }
   public void setPlayerNameSymbol(String name,char symbol){
    this.name=name;
    this.symbol=symbol;
   }
   public String getPlayerName(){
    return this.name;
   }
   public char getPlayerSymbol(){
    return this.symbol;
   }
   public void getPlayerNameSymbol(){
   System.out.println("Player Name: "+ this.name);
    System.out.println("Player Symbol: "+this.symbol);      
   }
   public void getPlayerNameAge(){
    System.out.println("Player Name: "+ this.name);
    System.out.println("Player Age: " +this.age);
   }
   public void getPlayerDetails(){
    System.out.println("Player Name: "+ this.name);
    System.out.println("Player Symbol: "+this.symbol);
    System.out.println("Player EmailId:"+this.emailId);
    System.out.println("Player Age: "+this.age);
    System.out.println("Player contact number: "+this.contactnumber);
    System.out.println("Player Address: "+this.address);
   }

}
