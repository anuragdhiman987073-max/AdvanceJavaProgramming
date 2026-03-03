class Animal{
          String name;
          String sound;

    Animal() {
          this("","");
}
          
          Animal(String name,String sound){
                    this.name=name;
                    this.sound=sound;
          }
          String getInfo(int a)
          {
                return "";
          }
          void getInfo(String a){
                    System.out.println("Name: "+name);
                    System.out.println("Sound: "+sound);
          }
          void getInfo(String name,String sound,int legs)
          {
                    System.out.println("Name: "+name);
                    System.out.println("Sound: "+sound);
                    System.out.println("No of Legs: "+legs);
          }
}
class Cat extends Animal{
   Cat(String name,String sound)
       {
                   super(name,sound);
       }
       void getInfo(String name,String sound)
       {
                 System.out.println("Name: "+name);
                 System.out.println("Sound: "+sound);
       }
}

public class PolyMain {
          public static void main(String[] args) {
              Animal a1=new Animal("Dog","Bark");

              a1.getInfo("cat","meow",4);
              Cat c1=new Cat();
                      c1.getInfo();
          }
}
