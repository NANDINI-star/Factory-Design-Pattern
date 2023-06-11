package factorymethod;

public class HLD extends Course{
    @Override
    public void createCourse(){
        modules.add(new IntroModule());
        modules.add(new ImplementationModule());
        modules.add(new ExampleModule());
    }
}
