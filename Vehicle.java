package vehicle;

public class Vehicle {

    public static void main(String[] args) {
        String name = "Cabbie";
        String color = "Yellow";
        int doors = 4;
        int cylinders = 4;
        int transmission = 4;
                
        Automobile Cabbie = new Automobile(name, color, doors, cylinders, transmission);
        System.out.println(Cabbie.About());
        
        name = "Sporty";
        color = "Red";
        doors = 2;
        cylinders = 8;
        transmission = 7;
        
        Automobile Sporty = new Automobile(name, color, doors, cylinders, transmission);
        System.out.println(Sporty.About());
        
        name = "Vany";
        color = "Green";
        doors = 4;
        cylinders = 4;
        transmission = 5;
        
        Automobile Vany = new Automobile(name, color, doors, cylinders, transmission);
        System.out.println(Vany.About());
        
    }
    
}
