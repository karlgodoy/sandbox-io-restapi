package io.karl.godoy.learning.development.sandbox.users.restapi.services;

import io.karl.godoy.learning.development.sandbox.users.restapi.entity.SandboxUserEntity;
import io.karl.godoy.learning.development.sandbox.users.restapi.repository.SandboxUserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SandBoxUserService {

    private SandboxUserRepository sandboxUserRepository;

    public SandBoxUserService(SandboxUserRepository sandboxUserRepository) {
        this.sandboxUserRepository = sandboxUserRepository;
    }

    public void addUser(SandboxUserEntity sandboxUserEntity) {
        sandboxUserRepository.save(sandboxUserEntity);
    }

    public List<SandboxUserEntity> getAllSandBoxUsers() {
        return sandboxUserRepository.findAll();
    }
}
