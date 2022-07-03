package BGHubApiJava.Repositories;

import org.springframework.data.repository.CrudRepository;

import BGHubApiJava.Models.Game;

public interface GameRepository extends CrudRepository<Game, Long> {

}
