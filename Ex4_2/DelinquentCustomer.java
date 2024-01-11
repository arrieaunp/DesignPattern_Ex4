//make this class a subclass of customer
public class DelinquentCustomer implements ICommunication {
    @Override
    public Email createMail() {
        return new Email("Delinquent Customer Mail");
    }
    @Override
    public Brochure createBrochure() {
        return new Brochure("Delinquent Customer Brochure");
    }   
}
