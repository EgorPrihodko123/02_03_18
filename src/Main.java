import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {


        Cat muric=new Cat("muric",2);
        Cat matilda =new Cat("matilda",1);
        Dog dog=new Dog("gav",3);
        Dog dogic=new Dog("naida",3);

   //     Dog[] dogMass={dog,dogic};
    //    System.out.println(dogMass.length);
    //    dogMass[1]=null;
    //    for (Dog dogMas:dogMass){
    //        System.out.println(dogMas);
    //    }
        ArrayList<Dog> dogisList=new ArrayList<>();
        dogisList.add(dog);
        dogisList.add(dogic);
        dogisList.add(new Dog("volic",8));
        dogisList.add(new Dog("tamara",15));
      //  for(Dog dog1:dogisList){
       //     System.out.println(dog1.getName());
      //  }
     //   System.out.println(dogisList.size());


        Collection newList=new ArrayList<>();

    }
}
