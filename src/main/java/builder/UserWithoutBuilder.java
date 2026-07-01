package builder;

public class UserWithoutBuilder {
    private final String name;
    private final String taxId;
    private final int age;
    private final String phone;
    private final String address;

    public UserWithoutBuilder(String name, String taxId, int age, String phone, String address) {
        this.name = name;
        this.taxId = taxId;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getTaxId() {
        return taxId;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserWithoutBuilder{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

