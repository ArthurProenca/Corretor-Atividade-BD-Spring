package dev.friday.com.corretor.resource;

import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/v1/corretor-resource/locador")
@Api(tags = "Locador API")
@CrossOrigin
@Log4j2
public class LocadorResource {
}
