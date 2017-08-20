
package wad.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Emit extends AbstractPersistable<Long>{
    
    private String number;   
    private Competitor owner;
    @OneToMany
    private List<EmitPunch> emitPunches;
    
    public String getNumber() {
        return this.number;
    }

    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    public Competitor getOwner() {
        return this.owner;
    }

    public void setCompetitor(Competitor newOwner) {
        this.owner = newOwner;
    }
    
    public List<EmitPunch> getEmitPunches() {
        if (this.emitPunches == null) {
            this.emitPunches = new ArrayList<>();
        }
        return this.emitPunches;
    }

    public void setEmitPunches(List<EmitPunch> newEmitPunches) {
        this.emitPunches = newEmitPunches;
    }
    
}
