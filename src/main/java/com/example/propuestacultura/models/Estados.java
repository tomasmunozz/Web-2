package com.example.propuestacultura.models;


import com.example.propuestacultura.Helpers.EstadosPropuesta;
import jakarta.persistence.*;

@Entity
@Table(name = "estados")
public class Estados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private EstadosPropuesta estado= EstadosPropuesta.INICIO;

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }


}
