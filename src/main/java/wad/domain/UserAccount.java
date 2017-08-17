
package wad.domain;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class UserAccount extends AbstractPersistable<Long>{
    
    private String username;
    private String password;
    private String authority;
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    
    public String getAuthority(){
        return this.authority;
    }
    
    public void setAuthority(String newAuthority){
        this.authority = newAuthority;
    }
    
}
