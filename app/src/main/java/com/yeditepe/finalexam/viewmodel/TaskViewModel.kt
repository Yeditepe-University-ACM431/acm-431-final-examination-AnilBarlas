package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task
import kotlinx.coroutines.NonCancellable.isCompleted

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    val taskList: MutableList<Task> = mutableListOf(
        Task(1, "Task 1", false),
        Task(2, "Task 2", false))

    // Initially add at least 2 tasks


    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        var task = taskList.find { it.id == taskId }
        task?.isCompleted =!task.isCompleted
    }
}