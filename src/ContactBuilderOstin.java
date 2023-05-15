public class ContactBuilderOstin implements Builder {

    Contact contact;

    @Override
    public void reset() {
        contact = new Contact();
    }

    @Override
    public void name() {
        contact.name = "Ostin";
    }

    @Override
    public void surName() {
        contact.surName = "Powers";
    }

    @Override
    public void mail() {
        contact.mail = "ostin@gmail.com";
    }

    @Override
    public void phone() {
        contact.phone = "911";
    }

    @Override
    public void address() {
        contact.address = "White House";
    }

    @Override
    public Contact getResult() {
        return contact;
    }
































    /*private String name;

    private String surName;

    private String mail;

    private String phone;

    private String address;

    public ContactBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder surName(String surName) {
        this.surName = surName;
        return this;
    }

    public ContactBuilder mail(String mail) {
        this.mail = mail;
        return this;
    }

    public ContactBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactBuilder address(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Contact build() {
        return new Contact(this);
    }*/
}
