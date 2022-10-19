package com.trafficapp.trafficcop.TestControllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trafficapp.trafficcop.Entities.Inspector;
import com.trafficapp.trafficcop.Entities.Location;
import com.trafficapp.trafficcop.Entities.Medical;
import com.trafficapp.trafficcop.Entities.Violation;
import com.trafficapp.trafficcop.Services.ViolationService;

@RestController
@CrossOrigin
public class DemoController {

    @Autowired
    private ViolationService vservice;

    
    @GetMapping("/getviolations")
    public List<Violation> getViolations()
    {
        return this.vservice.getViolations();
    }

    @GetMapping("/getlocations")
    public List<Location> getLocations()
    {
        return this.vservice.getLocations();
    }

    @GetMapping("/getinspectors")
    public List<Inspector> getInspectors()
    {
        return this.vservice.getInspectors();
    }

    @GetMapping("/getmedicals")
    public List<Medical> getMedicals()
    {
        return this.vservice.getMedicals();
    }



    @PostMapping("/addviolation")
    public List<Violation> addViolation(@RequestBody Violation data)
    {
        return this.vservice.addViolation(data);
    }

    @PostMapping("/addlocation")
    public List<Location> addLocation(@RequestBody Location data)
    {
        return this.vservice.addLocation(data);
    }

    @PostMapping("/addmedical")
    public List<Medical> addMedical(@RequestBody Medical data)
    {
        return this.vservice.addMedical(data);
    }

    @PostMapping("/addinspector")
    public List<Inspector> addInspector(@RequestBody Inspector data)
    {
        return this.vservice.addInspector(data);
    }

    @GetMapping("/getinspectorid")
    public int getInspectorId() {
        return this.vservice.getInspectorId();
    }


    @GetMapping("/getlocationid")
    public int getLocationId() {
        return this.vservice.getLocationId();
    }


    @GetMapping("/getmedicalid")
    public int getMedicalId() {
        return this.vservice.getMedicalId();
    }


    @GetMapping("/getviolationid")
    public int getViolationId() {
        return this.vservice.getViolationId();
    }

    @GetMapping("/updatelocation/{id}")
    public Location updateLocation(@PathVariable String id){
        return this.vservice.updateLocation(id);
    }

    @GetMapping("/valid/{username}/{password}")
    public Inspector loginValidation(@PathVariable String username, @PathVariable String password){
        return this.vservice.loginValidation(username, password);
    }

}
