plugins {
    id("fpgradle-minecraft") version ("0.8.3")
}

group = "com.carpentersblocks"

minecraft_fp {
    mod {
        modid = "CarpentersBlocks"
        name = "Carpenter's Blocks"
        rootPkg = "$group"
    }
    tokens {
        tokenClass = "Tags"
    }
    publish {
        changelog = "https://github.com/GTMEGA/carpentersblocks/releases/tag/$version"
        maven {
            repoUrl = "https://mvn.falsepattern.com/gtmega_releases/"
            repoName = "mega"
            group = "mega"
            artifact = "carpentersblocks-mc1.7.10"
        }
    }
}

repositories {
    exclusive(maven("horizon", "https://mvn.falsepattern.com/horizon"), "com.github.GTNewHorizons")
    exclusive(maven("mega", "https://mvn.falsepattern.com/gtmega_releases"), "team.chisel")
}

dependencies {
    compileOnly("com.github.GTNewHorizons:Angelica:1.0.0-alpha52:api") {
        excludeDeps()
    }
    compileOnly("team.chisel:chisel-mc1.7.10:2.15.1-mega:dev")
}