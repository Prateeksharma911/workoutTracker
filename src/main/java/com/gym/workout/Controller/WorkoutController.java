package com.gym.workout.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gym.workout.Entity.WorkoutPlan;
import com.gym.workout.Service.WorkoutService;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping("/create")
    public WorkoutPlan createWorkout(@RequestBody WorkoutPlan workoutPlan) {
        return workoutService.createWorkout(workoutPlan);
    }

    @PutMapping("/update/{id}")
    public WorkoutPlan updateWorkout(@PathVariable Long id, @RequestBody WorkoutPlan workoutPlan) {
        return workoutService.updateWorkout(id, workoutPlan);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteWorkout(@PathVariable Long id) {
        workoutService.deleteWorkout(id);
        return "Workout deleted successfully";
    }

    @GetMapping("/list")
    public List<WorkoutPlan> listWorkouts() {
        return workoutService.listWorkouts();
    }

    // Additional endpoints for scheduling and reports can be added here
}