package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "formatos_adjuntos_solicitante")
public class FormatosAdjuntoSolicitante {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adjunto_solicitante")
    private Integer idAdjuntoSolicitante;
    @OneToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Integer idPropuesta;

    private String nombreFormatoInhabilidades;

    private String extraDatas;

    public Integer getIdAdjuntoSolicitante() {
        return idAdjuntoSolicitante;
    }

    public void setIdAdjuntoSolicitante(Integer idAdjuntoSolicitante) {
        this.idAdjuntoSolicitante = idAdjuntoSolicitante;
    }

    public Integer getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(Integer idPropuesta) {
        this.idPropuesta = idPropuesta;
    }

    public String getNombreFormatoInhabilidades() {
        return nombreFormatoInhabilidades;
    }

    public void setNombreFormatoInhabilidades(String nombreFormatoInhabilidades) {
        this.nombreFormatoInhabilidades = nombreFormatoInhabilidades;
    }

    public String getExtraDatas() {
        return extraDatas;
    }

    public void setExtraDatas(String extraDatas) {
        this.extraDatas = extraDatas;
    }
}
