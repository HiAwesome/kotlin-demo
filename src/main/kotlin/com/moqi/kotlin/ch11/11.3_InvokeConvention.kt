package com.moqi.kotlin.ch11.InvokeConvention

/**
 * 使用 invoke 约定构建更灵活的代码嵌套块
 *
 * @author moqi On 12/10/20 11:40
 */
class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

data class Issue(
    val id: String, val project: String, val type: String,
    val priority: String, val description: String
)

class ImportantIssuesPredicate(val project: String) : (Issue) -> Boolean {

    override fun invoke(issue: Issue): Boolean {
        return issue.project == project && issue.isImportant()
    }

    private fun Issue.isImportant(): Boolean {
        return type == "Bug" &&
                (priority == "Major" || priority == "Critical")
    }

}

class DependencyHandler {
    fun compile(coordinate: String) {
        println("Added dependency on $coordinate")
    }

    operator fun invoke(
        body: DependencyHandler.() -> Unit
    ) {
        body()
    }

}

fun main() {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry")
    println()

    val i1 = Issue(
        "IDEA-154446", "IDEA", "Bug", "Major",
        "Save settings failed"
    )
    val i2 = Issue(
        "KT-12183", "Kotlin", "Feature", "Normal",
        "Intention: convert several calls on the same receiver to with/apply"
    )
    val predicate = ImportantIssuesPredicate("IDEA")

    for (issue in setOf(i1, i2).filter(predicate)) {
        println("issue.id = ${issue.id}")
    }
    println()

    val kotlinDependency = "org.jetbrains.kotlin:kotlin-stdlib:1.4.21"
    val dependencies = DependencyHandler()
    dependencies.compile(kotlinDependency)
    dependencies {
        compile(kotlinDependency)
    }
    println()
}
