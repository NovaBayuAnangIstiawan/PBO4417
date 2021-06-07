/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author Bayu
 */
public class DutaCoding {

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the ktp
     */
    public Integer getKTP() {
        return KTP;
    }

    /**
     * @param KTP the id to set
     */
    public void setKTP(Integer KTP) {
        this.KTP = KTP;
    }
    /**
     * @return the usia
     */
    public String getUsia() {
        return usia;
    }

    /**
     * @param usia the nim to set
     */
    public void setUsia(String usia) {
        this.usia = usia;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jk
     */
    public String getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
        /**
         * 
     * @return the alasan
     */
    public String getAlasan() {
        return alasan;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    private Integer id;
    private Integer KTP;
    private String nama;
    private String usia;
    private String jk;
    private String alamat;
    private String alasan;
}


