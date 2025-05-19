package com.github.karollewandowski.spscissue.startup

import com.github.karollewandowski.spscissue.MySettingsService
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class MyProjectActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        thisLogger().info("1. MySettingsService.value: ${MySettingsService.getInstance(project).value}")
        MySettingsService.getInstance(project).value = "initalized"
        thisLogger().info("2. MySettingsService.value: ${MySettingsService.getInstance(project).value}")

    }
}
