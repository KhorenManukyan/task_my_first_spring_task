package my_tasks.tasks.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table("user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //todo: write colume name
    private String name;
    private String surname;
    //todo: write some filed if you need;
    //todo: write realtion ship between  one to meany.




}
