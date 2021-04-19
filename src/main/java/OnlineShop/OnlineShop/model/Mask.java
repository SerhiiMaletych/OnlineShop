package OnlineShop.OnlineShop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mask")
public class Mask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Field can't be empty")
    @Length(max = 255)
    private String maskTitle;

    @NotBlank(message = "Field can't be empty")
    @Length(max = 255)
    private String manufacturer;

    @NotBlank(message = "Field can't be empty")
    private Integer year;

    @NotBlank(message = "Field can't be empty")
    @Length(max = 255)
    private String country;

    @NotBlank(message = "Field can't be empty")
    private String description;

    private String filename;

    @NotBlank(message = "Field can't be empty")
    private Integer price;

    @NotBlank(message = "Field can't be empty")
    private String material;

    @NotBlank(message = "Field can't be empty")
    @Length(max = 255)
    private String color;
}
