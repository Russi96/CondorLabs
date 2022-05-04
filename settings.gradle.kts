pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Condor Labs Soccer"
include (":app")
include(":data")
include(":domain")
include(":usescases")
include(":framework:imagemanager")
include(":framework:requestmanager")
