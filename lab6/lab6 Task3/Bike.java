class Bike extends Vehicle{
    String helmetType;
    
    Bike (String brand, double speed, String helmetType){
         super (brand, speed);
         this.helmetType= helmetType;
}
    public void showDetails(){
          super.showDetails();

System.out.println("Helmet Type: " + helmetType);
}
}