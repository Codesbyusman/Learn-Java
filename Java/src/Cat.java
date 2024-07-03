public class Cat extends Animal{
    public String fav = "ffkfm";
    // inheritance
    public void walkAround(){
        System.out.println("from cat class -- override");
    }

//    calling super call constructor
    public  Cat(String name, String favFood, String fav){
        super(name, favFood);
        this.fav = fav;
    }

}
