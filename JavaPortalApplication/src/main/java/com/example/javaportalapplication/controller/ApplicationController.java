import com.example.javaportalapplication.service.ApplicationService;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.example.javaportalapplication.model.Application;

@RestController
@RequestMapping("/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping
    public Application apply(@RequestBody Application application) {
        return applicationService.saveApplication(application);

    }
}
