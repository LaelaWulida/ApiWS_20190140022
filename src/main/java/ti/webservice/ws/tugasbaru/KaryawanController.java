/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.ws.tugasbaru;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author laela
 */
@Controller
public class KaryawanController {
    @CrossOrigin
    @RequestMapping(value = "/datakaryawan/xml", produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Karyawan> getKaryawanXML() {
        List<Karyawan> datakaryawan = new ArrayList<>();
        
        KaryawanJpaController controller = new KaryawanJpaController();
        
        try
        {
            datakaryawan = controller.findKaryawanEntities();
        } catch (Exception e) {}
        
        return datakaryawan;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/datakaryawan/json", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Karyawan> getKaryawanJson() {
        List<Karyawan> datakaryawan = new ArrayList<>();
        
        KaryawanJpaController controller = new KaryawanJpaController();
        
        try
        {
            datakaryawan = controller.findKaryawanEntities();
        } catch (Exception e) {}
        
        return datakaryawan;
    }
    
}
