package polsl.dietapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "nutrients")
@Entity
public class Nutrients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Integer PROTEIN;

    private Integer FAT;

    private Integer CARBOHYDRATES;

    @OneToOne(mappedBy = "nutrients")
    private Ingredient ingredient;

}
