package uk.co.ltw.service.kart.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.co.ltw.service.kart.model.Kart;

@RestController
@RequestMapping("/karts")
public class KartController {

	
	@GetMapping("/{id}")
	public ResponseEntity<Kart> getKartDetails(@PathVariable Integer id) {
		
		Kart kart = new Kart(id, "kart 1", "OTK", "ABC1234");
		return ResponseEntity.ok(kart);
	}
	
}
