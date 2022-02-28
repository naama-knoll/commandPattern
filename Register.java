public class Register implements Command{
    AddName name;

    public Register(AddName name) {
        this.name = name;
    }

    @Override
    public void execute() {
        name.addname();
    }
}
