//make this class a subclass of customer
public class RegularCustomer implements ICommunication {
    @Override
    public Email createMail() {
        return new Email("Regular Customer Email");
    }

    @Override
    public Brochure createBrochure() {
        return new Brochure("Regular Customer Brochure");
    }
    
}
