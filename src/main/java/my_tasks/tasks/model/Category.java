package my_tasks.tasks.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table("category")
@Entity
public class Category {

    private Long id;
    private String categoryTpe; // it can be enum
    //todo: write fileds if you need;
    // todo: make many to one relation ship between  user; examples many to one->user


}
