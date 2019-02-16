package io.karl.godoy.learning.development.sandbox.users.restapi.controller;

import io.karl.godoy.learning.development.sandbox.users.restapi.entity.SandboxUserCreationResponse;
import io.karl.godoy.learning.development.sandbox.users.restapi.entity.SandboxUserEntity;
import io.karl.godoy.learning.development.sandbox.users.restapi.services.SandBoxUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SandBoxController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SandBoxController.class);

    private SandBoxUserService sandBoxUserService;

    public SandBoxController(SandBoxUserService sandBoxUserService) {
        this.sandBoxUserService = sandBoxUserService;
    }

    @GetMapping(path = "getAllUsers")
    @ResponseBody
    public List<SandboxUserEntity> getAllSandboxUsers() {
        return sandBoxUserService.getAllSandBoxUsers();
    }

    @PostMapping(path = "addUser")
    @ResponseStatus(HttpStatus.CREATED)
    public SandboxUserCreationResponse addSandboxUser(@RequestBody SandboxUserEntity sandboxUserEntity) {
        LOGGER.info("{}", sandboxUserEntity);
        sandBoxUserService.addUser(sandboxUserEntity);
        SandboxUserCreationResponse sandboxUserCreationResponse = new SandboxUserCreationResponse();
        sandboxUserCreationResponse.setResponseCode("00");
        sandboxUserCreationResponse.setResponseBody("User is Created");
        return sandboxUserCreationResponse;
    }
}
