package PolyMorphism.ConstructorOverloading;

import java.util.Arrays;

class Registration{

    private String customerName;
    private String panCardNumber;
    private int voterId;
    private String passportNumber;
    private int licenseNumber;
    private long[] telephoneNumber;

    public Registration(String customerName, String passportNumber, long[] telephoneNumber) {
        this.customerName = customerName;
        this.passportNumber = passportNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public Registration(String customerName, String panCardNumber, int licenseNumber,  long[] telephoneNumbe) {
        this.customerName = customerName;
        this.panCardNumber = panCardNumber;
        this.licenseNumber = licenseNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public Registration(String customerName, int voterId, int licenseNumber,  long[] telephoneNumbe) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNumber = licenseNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public long[] getTelephoneNumber() {
        return telephoneNumber;
    }
}


public class RunnerTest {
    public static void main(String[] args) {
        long [] telephoneNumber = {9452425421L,9452425421L};
        Registration registration1 = new Registration("Kevin","MN9891N",telephoneNumber);
        System.out.println("Congratulations " +registration1.getCustomerName()+
                "!!! you have been successfully registered for our services with the following details:"+
                 " Passport number : "+registration1.getPassportNumber()+
                " Phone numbers : "+ Arrays.toString(registration1.getTelephoneNumber()));
    }
}
