//make this class a subclass of customer
public class MountainCustomer implements ICommunication {
    @Override
    public Email createMail() {
        return new Email("Mountain Customer Email");
    }

    @Override
    public Brochure createBrochure() {
        return new Brochure("Mountain Customer Brochure");
    }
}
