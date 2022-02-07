package com.green.greenchallenge.repository;

import com.green.greenchallenge.domain.DonationLog;
import com.green.greenchallenge.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface DonationLogRepository extends JpaRepository<DonationLog, Long> {
    List<DonationLog> findByParticipantId(Participant participant);
}
