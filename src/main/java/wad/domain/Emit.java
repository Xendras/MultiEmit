
package wad.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Emit extends AbstractPersistable<Long>{
    
    private String number;
    
    @OneToOne
    private Competitor owner;
    
    @OneToMany
    private List<EmitPunch> emitPunches;
    
}
