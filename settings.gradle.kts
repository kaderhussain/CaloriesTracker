pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CaloriesTracker"
include(":app")
include(":core")
include(":core-ui")
include(":onboarding")
include(":onboarding:onboarding_domain")
include(":onboarding:onboarding_presentation")
include(":tracker")
include(":tracker:trakcer_domain")
include(":tracker:tracker_data")
include(":tracker:tracker_presentation")
