/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Objects;

/**
 *
 * @author Foxy
 */
public class Department {

    private int deptId; 
    private String deptName; 
    private String location; 
        
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.deptId;
        hash = 29 * hash + Objects.hashCode(this.deptName);
        hash = 29 * hash + Objects.hashCode(this.location);
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
        final Department other = (Department) obj;
        if (this.deptId != other.deptId) {
            return false;
        }
        if (!Objects.equals(this.deptName, other.deptName)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Department{" + "deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + '}';
    }
   

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
