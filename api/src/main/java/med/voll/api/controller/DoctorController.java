package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.doctor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity registerDoctor(@RequestBody @Valid DoctorRegisterData data,
                                         UriComponentsBuilder uriBuilder){
        var doc = new Doctor(data);
        repository.save(doc);
        var uri = uriBuilder.path("/doctor/{id}").buildAndExpand(doc.getId()).toUri();
        return ResponseEntity.created(uri).body(new DoctorDetailData(doc));
    }

    @GetMapping
    public ResponseEntity<Page<DoctorList>> getAll(@PageableDefault(size=10, sort={"name"}) Pageable pagination){
        var page = repository.findAllByActiveTrue(pagination).map(DoctorList::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity detailDoctor(@PathVariable Long id){
        var doc = repository.getReferenceById(id);
        return ResponseEntity.ok(new DoctorDetailData(doc));

    }

    @PutMapping
    @Transactional
    public ResponseEntity updateDoctor(@RequestBody @Valid DoctorUpdateData data){
        var doc = repository.getReferenceById(data.id());
        doc.udpateInfo(data);
        return ResponseEntity.ok(new DoctorDetailData(doc));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteDoctor(@PathVariable Long id){
        Doctor doc = repository.getReferenceById(id);
        doc.delete();
        return ResponseEntity.noContent().build();
    }
}
