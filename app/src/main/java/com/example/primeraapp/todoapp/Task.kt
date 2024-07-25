package com.example.primeraapp.todoapp

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false)