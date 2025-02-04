package com.moqi.kotlin.ch08.RemovingDuplicationThroughLambdas

/**
 * 通过 lambda 去除重复代码
 *
 * @author moqi On 12/8/20 17:16
 */
data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

val averageWindowsDuration = log
    .filter { it.os == OS.WINDOWS }
    .map(SiteVisit::duration)
    .average()

fun List<SiteVisit>.averageDurationFor(os: OS) =
    filter { it.os == os }.map(SiteVisit::duration).average()

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

val averageMobileDuration = log
    .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
    .map(SiteVisit::duration)
    .average()

fun main() {
    println("averageWindowsDuration = ${averageWindowsDuration}")
    println()

    println("log.averageDurationFor(OS.WINDOWS) = ${log.averageDurationFor(OS.WINDOWS)}")
    println("log.averageDurationFor(OS.MAC) = ${log.averageDurationFor(OS.MAC)}")
    println()

    println("averageMobileDuration = ${averageMobileDuration}")
    println()

    println(
        "log.averageDurationFor { it.os in setOf(OS.ANDROID, OS.IOS) } = ${
            log.averageDurationFor {
                it.os in setOf(
                    OS.ANDROID,
                    OS.IOS
                )
            }
        }"
    )
    println("log.averageDurationFor { it.os == OS.IOS && it.path == \"/signup\" } = ${log.averageDurationFor { it.os == OS.IOS && it.path == "/signup" }}")
    println()
}
