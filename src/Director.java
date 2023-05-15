public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void createContact() {
        builder.reset();
        builder.name();
        builder.surName();
        builder.mail();
        builder.phone();
        builder.address();
        builder.getResult();
    }
}
