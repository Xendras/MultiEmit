
package wad.domain;

import java.sql.Time;
import java.util.List;
import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Result extends AbstractPersistable<Long>{
    
    private Competitor competitor;
    private Competition competition;
    private List<EmitPunch> splits;
    private Time time;
    
}
