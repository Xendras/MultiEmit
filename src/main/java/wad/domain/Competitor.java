
package wad.domain;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Competitor extends AbstractPersistable<Long>{
    
    private String name;
    private Emit emit;
    
}
