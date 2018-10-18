package com.activenture.mib.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activenture.mib.entity.SubscribedUser;

public interface SubscriberRepo extends JpaRepository<SubscribedUser, Long> {
}
