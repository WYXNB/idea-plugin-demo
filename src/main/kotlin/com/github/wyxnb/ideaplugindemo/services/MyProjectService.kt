package com.github.wyxnb.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.wyxnb.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
