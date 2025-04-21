class Car extends Vehicle{
    int numDoor;
Car (String brand, double speed, int numDoors){
    super(brand, speed);
    this.numDoor = numDoor;
}
    public void showDetails(){
       super.showDetails();
    System.out.println("Number of Doors: " + numDoor);

}


}