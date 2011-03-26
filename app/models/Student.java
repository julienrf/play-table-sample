package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Student extends Model {

    public String name;

    @ManyToMany
    public List<Lesson> lessons;

    @Override
    public String toString() {
        return name;
    }
}
