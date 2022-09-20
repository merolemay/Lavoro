package icesi.edu.co.Lavoro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table(name = "`user`")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    @Id
    private String id;

    private String parent1;

    private String parent2;

    private String name;

    private String sex;

    private float weight;

    private int age;

    private float height;

    private String arriveDate;



}
