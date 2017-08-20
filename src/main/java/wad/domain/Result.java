
package wad.domain;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Result extends AbstractPersistable<Long>{
    
    private Competitor competitor;
    private Competition competition;
    @OneToMany
    private List<EmitPunch> splits;
    private Time time;
    
    public Competitor getCompetitor(){
        return this.competitor;
    }
    
    public void setCompetitor(Competitor newCompetitor){
        this.competitor = newCompetitor;
    }
    
    public Competition getCompetition(){
        return this.competition;
    }
    
    public void setCompetition(Competition newCompetition){
        this.competition = newCompetition;
    }
    
    public List<EmitPunch> getSplits(){
        if (this.splits == null) {
            this.splits = new ArrayList<>();
        }
        return this.splits;
    }
    
    public void setSplits(List<EmitPunch> newSplits){
        this.splits = newSplits;
    }
    
    public Time getTime(){
        return this.time;
    }
    
    public void setTime(Time newTime){
        this.time = newTime;
    }
    
}
