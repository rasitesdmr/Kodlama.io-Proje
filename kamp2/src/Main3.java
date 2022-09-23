import model.CorporateCustomer;
import model.Customer;
import model.IndividualCustomer;

public class Main3 {
    public static void main(String[] args) {

        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("545");
        individualCustomer.setPhone("055565896");
        individualCustomer.setFirstName("Raşit");
        individualCustomer.setLastName("Eşdemir");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("045865252");
        corporateCustomer.setCustomerNumber("1455");
        corporateCustomer.setCompanyName("microsoft");
        corporateCustomer.setTaxNumber("548");

        Customer [] customers = {individualCustomer,corporateCustomer};

        for (Customer customer : customers){
            System.out.println(customer.toString());
        }

    }
}
