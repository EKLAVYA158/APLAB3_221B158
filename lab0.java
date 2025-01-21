/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Juet
{
    String name;
    int age;
    String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("Age must be positive");
        }
    }
    public static void main(String[] args) {
        Juet person = new Juet();
        person.setName("Eklavya Gautam");
        person.setAge(21);
        
        System.out.println("Name : "+person.getName());
        System.out.println("Age : "+person.getAge());
    }
}