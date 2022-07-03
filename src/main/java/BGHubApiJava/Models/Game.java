package BGHubApiJava.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class Game {
	@Id
	Long id;

    @NonNull
	@Size(max=100, message="Must have 100 characters max.")
    String name;

    String minPlayers;

    String maxPlayers;

    String thumbnail;

    String image;

    String description;
    
    @OneToMany(targetEntity=Mechanic.class)
    List<Mechanic> mechanics;

    @OneToMany(targetEntity=Mechanic.class)
    List<Family> families;
}
