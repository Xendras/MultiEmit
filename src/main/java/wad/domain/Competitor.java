
package wad.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Competitor extends AbstractPersistable<Long>{
    
    private String name;
    private Emit emit;
    
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Emit getEmit() {
        return this.emit;
    }

    public void setEmit(Emit newEmit) {
        this.emit = newEmit;
    }
    
}
