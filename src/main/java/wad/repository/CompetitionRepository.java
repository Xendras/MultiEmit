
package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.Competition;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
    
}
