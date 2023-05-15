public class Main {
    public static void main(String[] args) {
        ContactBuilderOstin contactBuilderOstin = new ContactBuilderOstin();
        Director director = new Director(contactBuilderOstin);
        director.createContact();

        Contact contact = contactBuilderOstin.getResult();
        System.out.println(contact.name + " " + contact.surName);
    }
}