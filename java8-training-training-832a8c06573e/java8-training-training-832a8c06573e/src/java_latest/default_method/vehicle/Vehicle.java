package java_latest.default_method.vehicle;

interface Vehicle {
    
    double getSpeed();
    
    default double getSpeedInMilesPerHour() {
       return getSpeed()*0.621371;    
    }
}