package adopet.api.dto;

import adopet.api.model.Tutor;

public record TutorDTO(Long id, String nome, String email, String telefone) {

    public TutorDTO(Tutor tutor){
        this(tutor.getId(), tutor.getNome(), tutor.getEmail(), tutor.getTelefone());
    }
}
