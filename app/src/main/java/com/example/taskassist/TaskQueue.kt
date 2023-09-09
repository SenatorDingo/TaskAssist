package com.example.taskassist

import java.util.PriorityQueue

class TaskQueue : PriorityQueue<Task>(compareBy { it.priority }) {

}