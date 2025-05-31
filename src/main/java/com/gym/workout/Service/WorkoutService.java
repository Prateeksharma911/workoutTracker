package com.gym.workout.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.workout.Entity.WorkoutPlan;
import com.gym.workout.Repository.WorkoutRepository;

import java.util.List;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public WorkoutPlan createWorkout(WorkoutPlan workoutPlan) {
        return workoutRepository.save(workoutPlan);
    }

    public WorkoutPlan updateWorkout(Long id, WorkoutPlan workoutPlan) {
        WorkoutPlan existingPlan = workoutRepository.findById(id).orElseThrow(() -> new RuntimeException("Workout not found"));
        existingPlan.setName(workoutPlan.getName());
        // Update other fields
        return workoutRepository.save(existingPlan);
    }

    public void deleteWorkout(Long id) {
        workoutRepository.deleteById(id);
    }

    public List<WorkoutPlan> listWorkouts() {
        return workoutRepository.findAll();
    }

    // Additional methods for scheduling and reports can be added here
}

