public class Botton {
    private Command comaand;

    public Botton(Command comaand) {
        this.comaand = comaand;
    }

    public void click(){
        this.comaand.execute();
    }
}
