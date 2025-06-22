package combinatorpattern;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+0892833834444",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(new CustomerValidationService().isValid(customer));
    }
}
