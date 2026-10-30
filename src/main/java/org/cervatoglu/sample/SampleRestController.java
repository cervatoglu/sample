package org.cervatoglu.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestController {
    public ResponseEntity<String> message() {
        return ResponseEntity.ok("A sample response.");
    }
}
