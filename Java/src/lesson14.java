public class lesson14 {

    public static void main(String[] args){
        Animal generic = new Animal();
        System.out.println(generic.getName());


        Cat cat1 = new Cat("ccat1" , "food", "1");


        System.out.println(cat1.getName());

        Animal test = new Cat("c8cat1" , "food", "11");
        acceptAnimal(test);
    }

    public static void acceptAnimal(Animal e)
    {
        System.out.println(e.getName());
        e.walkAround();
    }



}
