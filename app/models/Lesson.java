package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Lesson extends Model {
    
    public String name;

    @ManyToOne
    public Teacher teacher;

    @ManyToMany(mappedBy = "lessons")
    public List<Student> students;

    @Override
    public String toString() {
        return name;
    }
}
