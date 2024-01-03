package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fiy() {
        System.out.println("새 날기");
    }
}
