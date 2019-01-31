public class SmartCar{
  int carBattery;
// class smartCar is instantiated with attribute carBattery 

  SmartCar(){  
  carBattery = 100;
    
  }
//object SmartCar has a carBattery of 100


public int checkcarBattery() {
  System.out.println("Your battery level is at " + carBattery + " percent.");
  return carBattery;
}
//method checkcarBattery prints out what the carBattery is, has integer return type

public void startUp() {
  System.out.println("Systems on. How can I assist you?");
carBattery = carBattery - 5;
System.out.println("Battery Level is: " + carBattery + " percent."); 

}
// startUp is a void method (no return value). It prompts the user, subtracts 5% battery upon start up and prints the current battery level. 

public void drive(int meters){
  if (meters < 2){
    System.out.println("SmartCar de-accelerating...You are too close to the oncoming vehicle.");
    carBattery = carBattery - 15;
    System.out.println("The SmartCar is at " + carBattery + " percent.");
  }
  else{ 
    System.out.println("Driving...");
      carBattery = carBattery - 10;
      System.out.println("The SmartCar is at " + carBattery + " percent.");
  }
}
// The user needs to enter the parameter of an integer, representing meters. The drive method utilizes an if else statement to check if the car is too close to an oncoming vehicle.If it is, the car prints a message to deaccelerate, subtracts 15% battery and prints current level. If not, it prints that it is driving, subtracts 10% battery and prints current battery level.

public void chargeCar(int hours){
  System.out.println("SmartCar charging...");
  carBattery = carBattery + hours;
  if (carBattery > 100){
    carBattery = 100;
    System.out.println("Your battery level is at: " + carBattery + " percent.");
   }
  else{
    System.out.println("Your battery level is at " + carBattery + " percent.");
  }
}

//The user needs to enter the parameter of an integer, representing hours for charging. The charge method utilizes an if else statement to check what battery the car has and prints a corresponding statement. It is limited to 100% so the statement does not allow a value above that.
}
