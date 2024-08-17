package com.gibran.usercrud.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class User {

    @JsonProperty("Id")
    private Long id;

    @JsonProperty("Nombre")
    private String nombre;

    @JsonProperty("Paterno")
    private String paterno;

    @JsonProperty("Materno")
    private String materno;

    @JsonProperty("FechaNacimiento")
    private LocalDate fechaNacimiento;

    @JsonProperty("Genero")
    private String genero;

    @JsonProperty("Curp")
    private String curp;

    @JsonProperty("Rfc")
    private String rfc;

    @JsonProperty("Direccion")
    private Direccion direccion;

    public User() {
    }

    public static class Direccion {
        @JsonProperty("Calle")
        private String calle;

        @JsonProperty("Numint")
        private int numint;

        @JsonProperty("NumExt")
        private int numExt;

        @JsonProperty("Colonia")
        private String colonia;

        @JsonProperty("CP")
        private String cp;

        @JsonProperty("Municipio")
        private String municipio;

        @JsonProperty("Estado")
        private String estado;

        @JsonProperty("Pais")
        private String pais;

        public Direccion(String calle, int numint, int numExt, String colonia, String cp, String municipio, String estado, String pais) {
            this.calle = calle;
            this.numint = numint;
            this.numExt = numExt;
            this.colonia = colonia;
            this.cp = cp;
            this.municipio = municipio;
            this.estado = estado;
            this.pais = pais;
        }

        public Direccion() {
        }

        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public int getNumint() {
            return numint;
        }

        public void setNumint(int numint) {
            this.numint = numint;
        }

        public int getNumExt() {
            return numExt;
        }

        public void setNumExt(int numExt) {
            this.numExt = numExt;
        }

        public String getColonia() {
            return colonia;
        }

        public void setColonia(String colonia) {
            this.colonia = colonia;
        }

        public String getCp() {
            return cp;
        }

        public void setCp(String cp) {
            this.cp = cp;
        }

        public String getMunicipio() {
            return municipio;
        }

        public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }
    }

    public User(Long id, String nombre, String paterno, String materno, LocalDate fechaNacimiento, String genero, String curp, String rfc, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.curp = curp;
        this.rfc = rfc;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
