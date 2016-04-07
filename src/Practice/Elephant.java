/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Objects;

/**
 *
 * @author Jennifer
 */
public class Elephant {
    private String name;
    private String region;
    private String trackingID;

    public Elephant(String name, String region, String trackingID) {
        this.name = name;
        this.region = region;
        this.trackingID = trackingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.region);
        hash = 43 * hash + Objects.hashCode(this.trackingID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elephant other = (Elephant) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.region, other.region)) {
            return false;
        }
        if (!Objects.equals(this.trackingID, other.trackingID)) {
            return false;
        }
        return true;
    }
    
    
}
