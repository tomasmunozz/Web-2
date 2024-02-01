package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name="proponentes")
public class Solicitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitante")
    private Integer idSolicitante;
    @Column(name = "nombre_proponente")
    private String nombreProponente;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento idTipoDocumento;
    @Column(name = "nombres" )
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "numero_documento") //Hacer eso en cada columna para que la bd se cree con snake_Case
    private String numeroDocumento;
    @Column(name ="telefono_fijo" )
    private String telefonoFijo;
    @Column(name ="telefono_celular" )
    private String telefonoCelular;
    @Column(name ="correo" )
    private String correo;




}
