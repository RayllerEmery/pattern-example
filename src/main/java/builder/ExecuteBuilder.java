
import builder.UserWithBuilder;
import builder.UserWithoutBuilder;

import static java.lang.IO.println;

void main() {
    println("""
            
            Builder Design Pattern
                        The Builder design pattern is a creational design pattern that allows for the construction of complex
                        objects step by step. It separates the construction of a complex object from its representation,
                        enabling the same construction process to create different representations.
                        The Builder pattern is useful when creating an object involves many steps and different representations
                        of the object may be required. It allows you to create complex objects in a more readable and flexible way,
                        avoiding the need to create multiple constructors or factory methods for different parameter combinations.
            ====
            
            """);

    var userWithoutBuilder = new UserWithoutBuilder(
            "John Doe",
            "123456789",
            30,
            null,
            null
    );

    println(userWithoutBuilder + """
            \n
            Attributes not clearly declared, plus the need to pass null values.
            
            ===
            
            """);

    var userWithBuilder =
            new UserWithBuilder.Builder()
                    .setName("John Doe")
                    .setTaxId("123456789")
                    .setAge(30)
                    .build();

    println(userWithBuilder + """
            \n
            Attributes clearly declared, no need to pass null values.
            
            ===
            
            """);
}
