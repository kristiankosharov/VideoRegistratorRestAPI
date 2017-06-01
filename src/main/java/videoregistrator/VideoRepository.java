package videoregistrator;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
	Optional<Video> video();
}
