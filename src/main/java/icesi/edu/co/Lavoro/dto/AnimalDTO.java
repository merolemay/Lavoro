package icesi.edu.co.Lavoro.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnimalDTO {

    @Id
    private String id;

    private String name;

    private String sex;

    private float weight;

    private int age;

    private float height;

    private String arriveDate;

}
