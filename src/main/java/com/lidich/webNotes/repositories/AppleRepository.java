package com.lidich.webNotes.repositories;

import com.lidich.webNotes.dbModels.Apple;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppleRepository extends JpaRepository<Apple, Long> {
}
