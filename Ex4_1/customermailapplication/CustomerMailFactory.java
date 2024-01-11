public class CustomerMailFactory {
    public static Customer createCustomer(String type){
        if(type.equals("Delinquent")){
            return new DelinquentCustomer();
        }
        else if(type.equals("Mountain")){
            return new MountainCustomer();
        }
        else if(type.equals("Regular")){
            return new RegularCustomer();
        }
        return null;
    }
}
