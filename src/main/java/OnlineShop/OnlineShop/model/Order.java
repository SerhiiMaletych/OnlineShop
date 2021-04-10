package OnlineShop.OnlineShop.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Table(name = "orders")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalPrice;

    private LocalDate date;

    @NotBlank(message = "Field can't be empty")
    private String firstName;

    @NotBlank(message = "Field can't be empty")
    private String lastName;

    @NotBlank(message = "Field can't be empty")
    private String city;

    @NotBlank(message = "Field can't be empty")
    private String address;

    @Email
    @NotBlank(message = "Field can't be empty")
    private String email;

    @NotBlank(message = "Field can't be empty")
    private String phoneNumber;


    @NotNull(message = "Field can't be empty")
    @Min(value = 5, message = "Post index should contain 5 literals")
    private Integer postIndex;

    @OrderColumn
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Mask> maskList;


    @ManyToOne
    private User user;

    public Order(User user) {
        this.date = LocalDate.now();
        this.user = user;
        this.maskList = new ArrayList<>();
    }
}
