package com.example.propuestacultura.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "respuesta_propuesta")
public class RespuestaPropuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta_propuesta")
    private Integer idRespuestaPropuesta;
    @OneToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Integer idPropuesta;
    @Column(name = "fecha_recepcion")
    private LocalDate fechaRecepcion;
    @Column(name = "consulta_lista_publica")
    private Boolean consultaListaPublica;
    @Column(name = "area_receptora")
    private String areaReceptora;
    @Column(name = "negocio")
    private String negocio; //ENUM
    @Column(name = "observaciones_generales")
    private String observacionesGenerales;
    @Column(name = "se_apoya")
    private boolean seApoya;

    private String descripcionApoyo;

    private String respuesta;

    private String encargadoPropuesta;

    private String medioNotificacion;




}
