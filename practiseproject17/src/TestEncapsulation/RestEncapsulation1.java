package TestEncapsulation;

public class RestEncapsulation1 
{     
    public static void main (String[] args)  
    { 
        TestEncapsulation obj = new TestEncapsulation(); 
        obj.setName("Harsh"); 
        obj.setAge(19); 
        obj.setRoll(51); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 
}
