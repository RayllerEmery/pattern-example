package builder;

public class UserWithBuilder {
    private final String name;
    private final String taxId;
    private final int age;
    private final String phone;
    private final String address;

    public UserWithBuilder(Builder builder) {
        this.name = builder.name;
        this.taxId = builder.taxId;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private String taxId;
        private int age;
        private String phone;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTaxId(String taxId) {
            this.taxId = taxId;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserWithBuilder build() {
            return new UserWithBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "UserWithBuilder{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
