
package wad.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class EmitPunch extends AbstractPersistable<Long>{
    
    @OneToMany
    private Emit emit;
    private String punchCode;
    private Date date;
    
    public Emit getEmit(){
        return this.emit;
    }
    
    public void setEmit(Emit newEmit){
        this.emit = newEmit;
    }
    
    public String getPunchCode(){
        return this.punchCode;
    }
    
    public void setPunchCode(String newCode){
        this.punchCode = newCode;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public void setDate(Date newDate){
        this.date = newDate;
    }
    
}
