package factorymethod;

public class LLD extends Course{
    @Override
    public void createCourse(){
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new ExampleModule());

    }
}
