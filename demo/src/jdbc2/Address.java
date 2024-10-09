package jdbc2;

public class Address {
    public String addressline1;
    public String addressline2;
    public String city;
    public String state;
    public String country;
    public String pincode;
    public String toString(){
        return "addressline1 :"+addressline1+
                "\naddressline2 :"+addressline2+
                "\ncity :"+city+
                "\nstate :"+state+
                "\ncoutry :"+country+
                "\npincode :"+pincode;
    }

    public Address(String addressline1, String addressline2, String city, String state, String country, String pincode) {
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}

