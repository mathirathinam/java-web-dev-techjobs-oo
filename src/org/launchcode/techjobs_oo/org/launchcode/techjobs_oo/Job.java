package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId ;
        nextId++;
    }
    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    /* public void setId(int id) {
        this.id = id;
    } */

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        if (name == null || name == "") {
            name = "Data not available";
        }
         if (employer.getValue() == null || employer.getValue() == "") {
            employer.setValue("Data not available");
            //System.out.println(getEmployer());
        }  if (location.getValue() == null || location.getValue() == "") {
            location.setValue("Data not available");
        }  if (positionType.getValue() == null || positionType.getValue() == "") {
            positionType.setValue("Data not available");
        } if (coreCompetency.getValue() == null || coreCompetency.getValue() == "") {
            coreCompetency.setValue("Data not available");
            ;
        }
        return String.format("\nID: %d" + "\nName: %s" + "\nEmployer: %s" + "\nLocation: %s" + "\nPositionType: %s" + "\nCoreCompetency: %s\n", id, name, employer, location, positionType, coreCompetency);

    }
}
