package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.user.UserAuthenticationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class UserAuthenticationController {

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity executeLogin(@RequestBody @Valid UserAuthenticationData userData){
        var token = new UsernamePasswordAuthenticationToken(userData.login(),userData.password());
        var authentication = manager.authenticate(token);

        return ResponseEntity.ok().build();
    }



}
