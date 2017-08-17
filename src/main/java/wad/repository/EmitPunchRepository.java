
package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.EmitPunch;

public interface EmitPunchRepository extends JpaRepository<EmitPunch, Long> {
    
}
