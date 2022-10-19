package com.trafficapp.trafficcop.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.trafficapp.trafficcop.Entities.Inspector;
import com.trafficapp.trafficcop.Entities.Location;
import com.trafficapp.trafficcop.Entities.Medical;
import com.trafficapp.trafficcop.Entities.Violation;

@Service
public class ViolationServiceImp implements ViolationService {

    List<Violation> violations;
    List<Location> locations;
    List<Inspector> inspectors;
    List<Medical> medicals;

    public ViolationServiceImp() {
        violations = new ArrayList<>();
        //violations.add(new Violation());

        locations = new ArrayList<>();
        //locations.add(new Location());

        inspectors = new ArrayList<>();
        inspectors.add(new Inspector("ajit", "9874651230", "inspector", "inspector", "1"));
        inspectors.add(new Inspector("tct", null, "tct", "tct", null));
        inspectors.add(new Inspector("medical", null, "medical", "medical", null));

        medicals = new ArrayList<>();
        //medicals.add(new Medical());

    }


    @Override
    public List<Violation> getViolations() {
        return violations;
    }

    @Override
    public List<Location> getLocations() {
        return locations;
    }

    @Override
    public List<Inspector> getInspectors() {
        return inspectors;
    }

    @Override
    public List<Medical> getMedicals() {
        return medicals;
    }




    @Override
    public List<Inspector> addInspector(Inspector data) {
        inspectors.add(data);
        return inspectors;
    }


    @Override
    public List<Medical> addMedical(Medical data) {
        medicals.add(data);
        return medicals;
    }


    

    @Override
    public List<Violation> addViolation(Violation value) {
        violations.add(value);
        return violations;
    }

    @Override
    public List<Location> addLocation(Location value) {
        locations.add(value);
        return locations;
    }


    @Override
    public int getInspectorId() {
        return inspectors.size();
    }


    @Override
    public int getLocationId() {
        return locations.size();
    }


    @Override
    public int getMedicalId() {
        return medicals.size();
    }


    @Override
    public int getViolationId() {
        return violations.size();
    }
   
    @Override
    public Inspector loginValidation(String username, String password){
        for (int i=0; i<inspectors.size(); i++)
        {
            Inspector item = inspectors.get(i);
            
            if (item.getUsername() != null && item.getPassword() != null && item.getUsername().equals(username) && item.getPassword().equals(password))
                return item;
        }
        return null;
    }


    @Override
    public Location updateLocation(String id) {
        for (int i=0; i<locations.size(); i++){
            Location item = locations.get(i);
            if (id != null && item.getId().equals(id)){
                item.setHelpSent(true);
                return item;
            }
        }
        return null;
    }
    

    
}
