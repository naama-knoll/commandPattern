public class AddName {
    private String firstName ;
    private String lastName ;

    public AddName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addname(){
        System.out.println(this.firstName+" "+this.lastName);
    }
}
