package BGHubApiJava.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class Mechanic {
	@Id
    String id;

    @NonNull
    long gameId;

    @NonNull
    String mechanic;

}
