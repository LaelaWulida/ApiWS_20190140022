/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.ws.tugasbaru;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author laela
 */
@CrossOrigin
@RestController
@RequestMapping("/datakaryawan")
public class KaryawanController {
@Autowired
private KaryawanInterface employees;
@GetMapping("/employees")
public List<Karyawan> getAllKaryawan(){
return employees.findAll();
}
@GetMapping ("/employees/{idproduct}")
public Karyawan getKarywanById(@PathVariable String idproduct){
return employees.findById(idproduct).get();
}
@PostMapping ("/employees")
public Karyawan saveKaryawanDetails(@RequestBody Karyawan emp){
return employees.save(emp);
}
@PutMapping("/employees")
public Karyawan updateKaryawan(@RequestBody Karyawan emp){
return employees.save(emp);
}
@DeleteMapping("/employees/{idproduct}")
public ResponseEntity<HttpStatus> deleteKaryawanById(@PathVariable String idproduct){
employees.deleteById(idproduct);
return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}