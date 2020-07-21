package firebase.example.springboot.controller;

/**
 * @author NyiNyiZin
 * @date Jul 16, 2020
 * @time 3:23:12 PM
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import firebase.example.springboot.pojo.Patient;
import firebase.example.springboot.service.PatientService;

import java.util.concurrent.ExecutionException;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/getPatientDetails")
    public Patient getPatient(@RequestParam String name ) throws InterruptedException, ExecutionException{
        return patientService.getPatientDetails(name);
    }

    @PostMapping("/createPatient")
    public String createPatient(@RequestBody Patient patient ) throws InterruptedException, ExecutionException {
        return patientService.savePatientDetails(patient);
    }

    @PutMapping("/updatePatient")
    public String updatePatient(@RequestBody Patient patient  ) throws InterruptedException, ExecutionException {
        return patientService.updatePatientDetails(patient);
    }

    @DeleteMapping("/deletePatient")
    public String deletePatient(@RequestParam String name){
        return patientService.deletePatient(name);
    }
}
