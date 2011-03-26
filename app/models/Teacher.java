package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Teacher extends Model {

    public String name;

    @OneToMany(mappedBy = "teacher")
    public List<Lesson> lessons;

    @Override
    public String toString() {
        return name;
    }
}
