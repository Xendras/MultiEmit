
package wad.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class EmitPunch extends AbstractPersistable<Long>{
    
    @NotNull
    private Emit emit;
    @NotBlank
    private String punchCode;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
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
