/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class Country {
    private int idCountry;
    private String country;
    private String lastUpdate;

    public Country(int idCountry, String country, String lastUpdate) {
        this.idCountry = idCountry;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Country{" + "idCountry=" + idCountry + ", country=" + country + ", lastUpdate=" + lastUpdate + '}';
    }
    
    
}
