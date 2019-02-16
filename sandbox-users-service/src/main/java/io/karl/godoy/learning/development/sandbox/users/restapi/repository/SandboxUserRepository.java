package io.karl.godoy.learning.development.sandbox.users.restapi.repository;

import io.karl.godoy.learning.development.sandbox.users.restapi.entity.SandboxUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SandboxUserRepository extends JpaRepository<SandboxUserEntity, SandboxUserEntity> {
}
