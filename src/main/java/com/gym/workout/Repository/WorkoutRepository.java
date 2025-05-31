package com.gym.workout.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gym.workout.Entity.WorkoutPlan;

@Repository
public interface WorkoutRepository extends JpaRepository<WorkoutPlan, Long> {
    // You can define custom query methods here if needed
}