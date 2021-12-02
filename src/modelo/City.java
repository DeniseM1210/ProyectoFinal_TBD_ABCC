/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class City {
    private int idCity;
    private String city;
    private int idCountry;
    private String lastUpdate;

    public City(){}
    
    public City(int idCity, String city, int idCountry, String lastUpdate) {
        this.idCity = idCity;
        this.city = city;
        this.idCountry = idCountry;
        this.lastUpdate = lastUpdate;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "City{" + "idCity=" + idCity + ", city=" + city + ", idCountry=" + idCountry + ", lastUpdate=" + lastUpdate + '}';
    }
    
    
}
