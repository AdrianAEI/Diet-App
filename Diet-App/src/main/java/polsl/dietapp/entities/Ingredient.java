package polsl.dietapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "ingredient")
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nutrients_id", referencedColumnName = "id")
    private Nutrients nutrients;

    @ManyToMany(mappedBy = "ingredients")
    private List<Meal> meals = new ArrayList<>();
}
