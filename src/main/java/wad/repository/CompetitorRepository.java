
package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.Competitor;

public interface CompetitorRepository extends JpaRepository<Competitor, Long> {
    
}
