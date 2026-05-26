package com.choiceeat.backend.domain.destination.repository;

import com.choiceeat.backend.domain.destination.entity.SelectedDestination;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SelectedDestinationRepository extends JpaRepository<SelectedDestination, Long> {
    Optional<SelectedDestination> findByUser_UserId(Long userId);
}
