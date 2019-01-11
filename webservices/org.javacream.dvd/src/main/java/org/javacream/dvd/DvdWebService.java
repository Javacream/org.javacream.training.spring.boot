package org.javacream.dvd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class DvdWebService {

    @Autowired private DvdRepository dvdRepository;

    @PostMapping(path = "dvds", consumes = MediaType.APPLICATION_JSON_VALUE) public void saveBook(@RequestBody Dvd dvd){
        dvdRepository.save(dvd);
    }
    @GetMapping(path = "dvds/{id}", produces = MediaType.APPLICATION_JSON_VALUE) public Dvd findDvd(@PathVariable("id") Long id){
        return dvdRepository.findById(id).get();
    }


}
