/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author denis
 */
public class Actor {
    private int idActor;
    private String firstName;
    private String lastName;
    private String lastUpdate;
    
    public Actor(){}
    
    public Actor(int idActor, String firstName, String lastName, String lastUpdate){
        super();
        this.idActor = idActor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Actor{" + "idActor=" + idActor + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate=" + lastUpdate + '}';
    }
}

