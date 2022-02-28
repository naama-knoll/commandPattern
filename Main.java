public class Main {
    public static void main(String[] args) {
       
        var command=new Register(new AddName("naama","knoll"));
        var button =new Botton(command);
        button.click();

    }
}
