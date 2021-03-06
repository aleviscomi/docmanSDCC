package it.ale.docman.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "proprietario")
    @JsonIgnore
    private Utente proprietario;

    @ManyToMany(mappedBy = "tags")
    @JsonIgnore
    private List<Documento> documenti;

    public boolean equals(Object obj) {
        if(!(obj instanceof Tag)) return false;
        if(this == obj) return true;

        Tag t = (Tag) obj;
        if(t.getId() == this.getId())
            return true;
        return false;
    }
}
