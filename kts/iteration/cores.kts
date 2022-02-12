fun systemInfo(): String =
    when (val numberOfCores = Runtime.getRuntime().availableProcessors()){
        1 -> "1 core"
        in 2..16 -> "$numberOfCores"
        else -> "..."
    }

println(systemInfo())