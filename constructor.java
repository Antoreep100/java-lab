class Main {
    int a ;
   private Main(){
      a =5 ;
      System.out.println("Constructor is called");
   }
     
    
    
    public static void main(String[] args) {
        
       Main obj= new Main();
     
        System.out.println("value of i " + obj.a);
         
    }
}
