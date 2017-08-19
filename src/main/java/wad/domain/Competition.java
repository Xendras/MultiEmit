package wad.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Competition extends AbstractPersistable<Long> {

    private String location;
    private String name;
    private Date date;
    
    @OneToMany
    private List<Competitor> competitors;
    private List<String> controls;

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date newDate) {
        this.date = newDate;
    }
    
    public List<Competitor> getCompetitors() {
        return this.competitors;
    }

    public void setCompetitors(List<Competitor> newCompetitors) {
        this.competitors = newCompetitors;
    }

}
