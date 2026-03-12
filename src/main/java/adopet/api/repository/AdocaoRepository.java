package adopet.api.repository;

import adopet.api.model.Adocao;
import adopet.api.model.StatusAdocao;
import adopet.api.model.Tutor;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

    Integer countByTutorAndStatus(@NotNull Tutor tutor, StatusAdocao status);

    Boolean existsByPetIdAndStatus(@NotNull Long idPet, StatusAdocao statusAdocao);
}
