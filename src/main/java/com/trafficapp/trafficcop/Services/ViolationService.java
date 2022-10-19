package com.trafficapp.trafficcop.Services;
import java.util.List;

import com.trafficapp.trafficcop.Entities.Inspector;
import com.trafficapp.trafficcop.Entities.Location;
import com.trafficapp.trafficcop.Entities.Violation;
import com.trafficapp.trafficcop.Entities.Medical;


public interface ViolationService {

    public List<Violation> getViolations();
    public List<Location> getLocations();
    public List<Medical> getMedicals();
    public List<Inspector> getInspectors();

    public List<Violation> addViolation(Violation data);
    public List<Location> addLocation(Location data);
    public List<Medical> addMedical(Medical data);
    public List<Inspector> addInspector(Inspector data);

    public int getViolationId();
    public int getLocationId();
    public int getMedicalId();
    public int getInspectorId();

    public Location updateLocation(String id);

    public Inspector loginValidation(String username, String password);

}
